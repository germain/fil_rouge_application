package application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import application.core.JpaRepository;
import application.model.emprunt.Emprunt;
import application.repository.EmpruntRepository;
import application.service.EmpruntService;

public class EmpruntServiceImpl implements EmpruntService {

	@Autowired private EmpruntRepository repository;
	@Override public JpaRepository<Emprunt> getRepository() {return repository;}

}
