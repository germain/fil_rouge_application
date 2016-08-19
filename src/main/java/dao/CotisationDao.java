package dao;

import javax.persistence.EntityManager;

import fr.dta.application.cotisation.model.Cotisation;

public class CotisationDao {
	public static void persistCotisation(Cotisation c) {
		EntityManager em = DatabaseHelper.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		DatabaseHelper.commitTxAndClose(em);
	}
}