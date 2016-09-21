package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import modele.media.Media;

public class MediaDAO {
	
    private static MediaDAO mediaDao;

    private MediaDAO() {
    }

    public static MediaDAO instance() {
        if (mediaDao == null) {
        	mediaDao = new MediaDAO();
        }
        return mediaDao;
    }
    
    public void addMedia(Media med) {
    	EntityManager entityManager = DatabaseHelper.createEntityManager();
    	try {
            DatabaseHelper.beginTx(entityManager);
            entityManager.persist(med);
            DatabaseHelper.commitTxAndClose(entityManager);
        } catch (Exception e) {
            DatabaseHelper.rollbackTxAndClose(entityManager);
            throw new RuntimeException(e);
        }
    }
    
    public Media findMedia(Long id) {
    	EntityManager em = DatabaseHelper.createEntityManager();
		
		Query query = em.createQuery("FROM Media WHERE id=:id", Media.class);
		query.setParameter("id", id);
		Media mediaFind = (Media) query.getSingleResult();
		System.out.println(mediaFind);
		
    	return mediaFind;
    }
    
    public void mergeMedia(Media med) {
		EntityManager em = DatabaseHelper.createEntityManager();
		em.getTransaction().begin();
		em.merge(med);
		DatabaseHelper.commitTxAndClose(em);
	}
}
