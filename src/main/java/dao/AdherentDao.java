package dao;

import javax.persistence.EntityManager;

import fr.dta.application.adherent.model.Adherent;


public class AdherentDao {
	static public void persistAdherent(Adherent a) {
		EntityManager em = DatabaseHelper.createEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		DatabaseHelper.commitTxAndClose(em);
	}
}
