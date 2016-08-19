package dao;

import javax.persistence.EntityManager;

import fr.dta.application.adherent.model.Adherent;


public class AdherentDao {
	static public void persistAdherent(EntityManager em, Adherent a) {
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
	}
}
