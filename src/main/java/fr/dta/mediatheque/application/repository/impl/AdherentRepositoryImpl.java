package fr.dta.mediatheque.application.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.dta.mediatheque.application.core.JpaRepositoryImpl;
import fr.dta.mediatheque.application.model.Adherent;
import fr.dta.mediatheque.application.repository.AdherentRepository;

@Repository
public class AdherentRepositoryImpl extends JpaRepositoryImpl<Adherent> implements AdherentRepository {

	@Override
	protected Class<Adherent> getEntityClass() {return Adherent.class;}
		
	public Adherent findByLogin(String login){
		return findFirst("select u from Adherent u where u.login ='"+login+"'");
	}

	@Override
	public List<Adherent> findAllAdherent() {
		// TODO Auto-generated method stub
		return findAll();
	}
}
