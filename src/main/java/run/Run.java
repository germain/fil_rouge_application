package run;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.MediaDAO;
import fr.dta.application.media.model.Media;
import fr.dta.application.media.model.Type;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");
		MediaDAO mediaDAO = MediaDAO.instance();
		
		Media book1 = new Media("Don Quichotte", Type.Livre, "Miguel de Cervantes");
		Media book2 = new Media("Fables", Type.Livre, "Esope");
		
		mediaDAO.addMedia(book1);
		mediaDAO.addMedia(book2);
		
	}

}
