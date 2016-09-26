package fr.dta.mediatheque.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Usr;
import fr.dta.mediatheque.application.repository.UsrRepository;
import fr.dta.mediatheque.application.service.UsrService;

@Service ("usrService")
public class UsrServiceImpl implements UsrService {

	@Autowired private UsrRepository repository;
	@Override
	public JpaRepository<Usr> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	@Override
	public Usr findUsrByLogin(String login) {
		// TODO Auto-generated method stub
		return repository.findByLogin(login);
	}

	
}
