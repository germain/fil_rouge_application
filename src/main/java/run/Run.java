package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import fr.dta.application.adherent.model.Adherent;
import fr.dta.application.cotisation.model.Cotisation;
import dao.*;

import dao.MediaDAO;
import fr.dta.application.media.model.Media;
import fr.dta.application.media.model.Type;

public class Run {

	public static void main(String[] args) {			
				
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
		try {
			
			Cotisation cotisation = new Cotisation(formater.parse("01-01-2000"), 25);
			CotisationDao.persistCotisation(cotisation);
			
			Adherent adherent = new Adherent("nom1", "prenom1", formater.parse("10-10-2000"), "blabla@mail", "adresse1", 44000, "ville1", 0, cotisation);			
			AdherentDao.persistAdherent(adherent);
			
			cotisation = new Cotisation(formater.parse("01-01-2000"), 55);
			CotisationDao.persistCotisation(cotisation);
			//Maj cotisation adherent
			adherent.setCotisation(cotisation);
			AdherentDao.mergeAdherent(adherent);
			
			//Recherche info adherent
			AdherentDao.findAdherent(2L);
			
			MediaDAO mediaDAO = MediaDAO.instance();
			
			Media book1 = new Media("Don Quichotte", Type.Livre, "Miguel de Cervantes");
			Media book2 = new Media("Fables", Type.Livre, "Esope");
			
			mediaDAO.addMedia(book1);
			mediaDAO.addMedia(book2);
			
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
	}

}
