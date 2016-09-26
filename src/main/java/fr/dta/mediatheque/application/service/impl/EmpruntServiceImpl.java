package fr.dta.mediatheque.application.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Adherent;
import fr.dta.mediatheque.application.model.Emprunt;
import fr.dta.mediatheque.application.repository.EmpruntRepository;
import fr.dta.mediatheque.application.service.EmpruntService;

@Service ("empruntService")
public class EmpruntServiceImpl implements EmpruntService {

	@Autowired private EmpruntRepository repository;
	@Override public JpaRepository<Emprunt> getRepository() {return repository;}
	
	@Override
	@Transactional
	public void emprunt(int id_adherent, int id_media, String depart) {
		repository.emprunt(id_adherent, id_media, depart);
	}

}
