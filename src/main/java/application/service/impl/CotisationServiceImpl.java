package application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import application.core.JpaRepository;
import application.model.cotisation.Cotisation;
import application.repository.CotisationRepository;
import application.service.CotisationService;

public class CotisationServiceImpl implements CotisationService {	
	@Autowired private CotisationRepository repository;
	@Override public JpaRepository<Cotisation> getRepository() {return repository;}
}
