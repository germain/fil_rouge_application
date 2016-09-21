package service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import core.JpaRepository;
import modele.cotisation.Cotisation;
import repository.CotisationRepository;
import service.CotisationService;

public class CotisationServiceImpl implements CotisationService {	
	@Autowired private CotisationRepository repository;
	@Override public JpaRepository<Cotisation> getRepository() {return repository;}
}
