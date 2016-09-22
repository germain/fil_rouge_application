package fr.dta.mediatheque.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Emprunt;
import fr.dta.mediatheque.application.repository.EmpruntRepository;
import fr.dta.mediatheque.application.service.EmpruntService;

public class EmpruntServiceImpl implements EmpruntService {

	@Autowired private EmpruntRepository repository;
	@Override public JpaRepository<Emprunt> getRepository() {return repository;}

}
