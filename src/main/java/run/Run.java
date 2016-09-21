package run;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import dao.*;
import modele.adherent.Adherent;
import modele.cotisation.Cotisation;
import modele.media.Media;
import modele.media.Type; 

public class Run {

	public static void main(String[] args) {			
				
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
		try {
			
			//Ajout cotisation
			Cotisation cotisation = new Cotisation(formater.parse("01-01-2000"), 25);
			CotisationDao.persistCotisation(cotisation);
			
			//Ajout adherent
			Adherent adherent = new Adherent("nom1", "prenom1", formater.parse("10-10-2000"), "blabla@mail", "adresse1", 44000, "ville1", 2, cotisation);			
			AdherentDao.persistAdherent(adherent);
			
			Adherent adherent2 = new Adherent("nom2", "prenom2", formater.parse("10-10-2100"), "blabla2@mail", "adresse2", 75000, "ville2", 1, cotisation);			
			AdherentDao.persistAdherent(adherent2);	
			
			//Recherche nb emprunt adherent			
			AdherentDao.CountAdherentEmprunt(2L);
			
			//Maj cotisation adherent
			cotisation.setMontant(60);
			CotisationDao.mergeCotisation(cotisation);
			
			//Recherche info adherent
			AdherentDao.findAdherent(2L);
			
			//Recherche tous les adherents
			AdherentDao.listAdherent();	
			
			//Supprime un adherent
			AdherentDao.DeleteAdherent(2L);	
												
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
