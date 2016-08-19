package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import fr.dta.application.adherent.model.Adherent;
import fr.dta.application.cotisation.model.Cotisation;
import dao.*;

public class Run {

	public static void main(String[] args) {			
				
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
		try {
			
			//Ajout cotisation
			Cotisation cotisation = new Cotisation(formater.parse("01-01-2000"), 25);
			CotisationDao.persistCotisation(cotisation);
			
			//Ajout adherent
			Adherent adherent = new Adherent("nom1", "prenom1", formater.parse("10-10-2000"), "blabla@mail", "adresse1", 44000, "ville1", 0, cotisation);			
			AdherentDao.persistAdherent(adherent);
			
			Adherent adherent2 = new Adherent("nom2", "prenom2", formater.parse("10-10-2100"), "blabla2@mail", "adresse2", 75000, "ville2", 0, cotisation);			
			AdherentDao.persistAdherent(adherent2);
			
			//Ajout cotisation pour modification
			cotisation = new Cotisation(formater.parse("01-01-2000"), 55);
			CotisationDao.persistCotisation(cotisation);
			
			//Maj cotisation adherent
			adherent.setCotisation(cotisation);
			AdherentDao.mergeAdherent(adherent);
			
			//Recherche info adherent
			//AdherentDao.findAdherent(2L);
			
			AdherentDao.listAdherent();
			
		} catch (ParseException e) {			
			e.printStackTrace();
		}

		
		
	}

}
