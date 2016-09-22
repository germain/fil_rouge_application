package fr.dta.mediatheque.application.repository.impl;

import org.springframework.stereotype.Repository;

import fr.dta.mediatheque.application.core.JpaRepositoryImpl;
import fr.dta.mediatheque.application.model.Media;
import fr.dta.mediatheque.application.repository.MediaRepository;

@Repository
public class MediaRepositoryImpl extends JpaRepositoryImpl<Media> implements MediaRepository {

	@Override
	protected Class<Media> getEntityClass() {	return Media.class;	}
	
	public Media findByLogin(String login){
		return findFirst("select u from Media u where u.login ='"+login+"'");
	}

}
