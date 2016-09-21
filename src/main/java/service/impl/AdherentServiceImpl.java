package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.JpaRepository;
import modele.adherent.Adherent;
import repository.AdherentRepository;
import service.AdherentService;

@Service ("adherentService")
public class AdherentServiceImpl implements AdherentService {
	@Autowired private AdherentRepository repository;
	@Override public JpaRepository<Adherent> getRepository() {return repository;}
}