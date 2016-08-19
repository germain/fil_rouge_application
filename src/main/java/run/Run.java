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
			Cotisation cotisation = new Cotisation(formater.parse("01-01-2000"), 25);
			CotisationDao.persistCotisation(cotisation);
			Adherent adherent = new Adherent("nom1", "prenom1", formater.parse("10-10-2000"), "blabla@mail", "adresse1", 44000, "ville1", 0, cotisation);
			AdherentDao.persistAdherent(adherent);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
