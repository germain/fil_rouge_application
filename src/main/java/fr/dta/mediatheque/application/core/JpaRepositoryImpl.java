package fr.dta.mediatheque.application.core;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;


public abstract class JpaRepositoryImpl<T extends Model> implements JpaRepository<T>{

	protected Class<T> entityClass;
	
	@PersistenceContext protected EntityManager em;
	
	@Override
	public EntityManager getEm() {
		return em;
	}
	@PostConstruct    public void init() {        entityClass = getEntityClass();    }
	protected abstract Class<T> getEntityClass();
	
	public Session getSession() {		return em.unwrap(Session.class);	}

	@Transactional
    public T save(T entity) {
        if (isNew(entity)) {
            em.persist(entity);
            return entity;
        } else if (!em.contains(entity)) {
            return em.merge(entity);
        }

        return entity;
    }
	
    @Transactional
    public Object findOneAll(Class type, int id) {
        return em.find(type, id);
    }
    
    @Transactional
    public T findOne(int id) {
        return em.find(entityClass, id);
    }
	
    @Transactional
    public List<T> findAll() {    	
        return em.createQuery(" from "+entityClass.getSimpleName()).getResultList();
    }
	
    protected List<T> findBy(String query){
    	return em.createQuery(query).getResultList();
    }
    
    protected T findFirst(String query){
    	List<T> l = findBy(query);
    	if(l==null || l.size()==0) return null;
    	return l.get(0);
    }
    
    @Override
    public CriteriaQuery<T> newCriteria(){
    	return em.getCriteriaBuilder().createQuery(entityClass);
    }
    
    @Transactional
    public void delete(T entity) {
        if (!getSession().contains(entity)) {
            em.remove(getSession().merge(entity));
        } else {
            em.remove(entity);
        }
    }
    
    @Transactional
    public void delete(int id) {
    	T t = findOne(id);
    	if(t==null) return;
        em.remove(t);
    }

	public boolean isNew(T entity) {        return entity.getId() == 0;    }
	
}
