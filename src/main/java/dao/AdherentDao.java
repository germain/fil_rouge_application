package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import fr.dta.application.adherent.model.Adherent;

public class AdherentDao {
	
	static public void persistAdherent(Adherent a) {
		EntityManager em = DatabaseHelper.createEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		DatabaseHelper.commitTxAndClose(em);
	}
	
	static public void mergeAdherent(Adherent a) {
		EntityManager em = DatabaseHelper.createEntityManager();
		em.getTransaction().begin();
		em.merge(a);
		DatabaseHelper.commitTxAndClose(em);
	}
	
	
	static public void findAdherent(long id) {
		EntityManager em = DatabaseHelper.createEntityManager();
		
		Query query = em.createQuery("FROM Adherent WHERE id=:id",Adherent.class);
		query.setParameter("id", id);
		Adherent adherentFind = (Adherent) query.getSingleResult();
		System.out.println(adherentFind.getPrenom());
	}

	
}
