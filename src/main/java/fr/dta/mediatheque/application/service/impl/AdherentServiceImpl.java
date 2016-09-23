package fr.dta.mediatheque.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Adherent;
import fr.dta.mediatheque.application.repository.AdherentRepository;
import fr.dta.mediatheque.application.service.AdherentService;

@Service ("adherentService")
public class AdherentServiceImpl implements AdherentService {
	
	@Autowired private AdherentRepository repository;
	
	@Override public JpaRepository<Adherent> getRepository() {return repository;}

	@Override
	public Adherent findAdherentByLogin(String login) {
		return repository.findByLogin(login);
	}

	@Override
	public List<Adherent> findAllAdherent() {
		return repository.findAllAdherent();
	}

	@Override
	public Adherent findAdherentByName(String nom) {
		return repository.findByName(nom);
	}

}