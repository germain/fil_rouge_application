package fr.dta.mediatheque.application.repository.impl;

import org.springframework.stereotype.Repository;

import fr.dta.mediatheque.application.core.JpaRepositoryImpl;
import fr.dta.mediatheque.application.model.Usr;
import fr.dta.mediatheque.application.repository.UsrRepository;

@Repository
public class UsrRepositoryImpl extends JpaRepositoryImpl<Usr>implements UsrRepository {

	@Override
	protected Class<Usr> getEntityClass() {
		// TODO Auto-generated method stub
		return Usr.class;
	}

	@Override
	public Usr findByLogin(String login) {
		// TODO Auto-generated method stub
		return findFirst("select u from Usr u where u.login ='"+login+"'");
	}

}
