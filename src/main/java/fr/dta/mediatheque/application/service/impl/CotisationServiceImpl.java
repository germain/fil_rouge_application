package fr.dta.mediatheque.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Cotisation;
import fr.dta.mediatheque.application.repository.CotisationRepository;
import fr.dta.mediatheque.application.service.CotisationService;

public class CotisationServiceImpl implements CotisationService {	
	@Autowired private CotisationRepository repository;
	@Override public JpaRepository<Cotisation> getRepository() {return repository;}
}
