package application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.core.JpaRepository;
import application.model.adherent.Adherent;
import application.repository.AdherentRepository;
import application.service.AdherentService;

@Service ("adherentService")
public class AdherentServiceImpl implements AdherentService {
	@Autowired private AdherentRepository repository;
	@Override public JpaRepository<Adherent> getRepository() {return repository;}
}