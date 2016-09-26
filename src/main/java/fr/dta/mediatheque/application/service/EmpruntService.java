package fr.dta.mediatheque.application.service;

import fr.dta.mediatheque.application.core.GenericService;
import fr.dta.mediatheque.application.model.Emprunt;

public interface EmpruntService extends GenericService<Emprunt> {	
	public void emprunt (int id_adherent, int id_media, String depart);
}
