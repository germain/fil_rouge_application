package run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.dta.application.adherent.model.Adherent;
import dao.AdherentDao;
import dao.DatabaseHelper;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");
		
		EntityManager em = DatabaseHelper.createEntityManager();
		
		Adherent adherent = new Adherent("nom1", "prenom1", "10-10-2000", "blabla@mail", "adresse1", 44000, "ville1", 0, Cotisation cotisation);
		AdherentDao.persistAdherent(em, adherent);
	}

}
