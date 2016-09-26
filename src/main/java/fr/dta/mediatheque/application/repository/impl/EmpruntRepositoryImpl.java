package fr.dta.mediatheque.application.repository.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Repository;

import fr.dta.mediatheque.application.core.JpaRepositoryImpl;
import fr.dta.mediatheque.application.model.Adherent;
import fr.dta.mediatheque.application.model.Emprunt;
import fr.dta.mediatheque.application.model.Media;
import fr.dta.mediatheque.application.repository.EmpruntRepository;

@Repository
public class EmpruntRepositoryImpl extends JpaRepositoryImpl<Emprunt> implements EmpruntRepository {

	@Override
	protected Class<Emprunt> getEntityClass() {
		
		return Emprunt.class;
	}

	@Override
	public void emprunt(int id_adherent, int id_media, String depart) {			
			
			Adherent adh = (Adherent) findOneAll(Adherent.class, id_adherent);
			Media media = (Media) findOneAll(Media.class, id_media);			
			
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			java.util.Date date;
			
			date = null;
			
			try {
				date = df.parse(depart);
			} catch (ParseException e) {				
				e.printStackTrace();
			}
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);					
			
			if (media.getType().equals("CD") || media.getType().equals("DVD") ){				
				cal.add(Calendar.DAY_OF_MONTH, 30);						
				date = cal.getTime();
			}else{					
				cal.add(Calendar.DAY_OF_MONTH, 15);						
				date = cal.getTime();
			}
			
			Emprunt emprunt = new Emprunt(media, adh, new Date(depart), date);
			this.save(emprunt);			
	}		

}
