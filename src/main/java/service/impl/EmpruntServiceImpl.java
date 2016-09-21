package service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import core.JpaRepository;
import modele.emprunt.Emprunt;
import repository.EmpruntRepository;
import service.EmpruntService;

public class EmpruntServiceImpl implements EmpruntService {

	@Autowired private EmpruntRepository repository;
	@Override public JpaRepository<Emprunt> getRepository() {return repository;}

}
