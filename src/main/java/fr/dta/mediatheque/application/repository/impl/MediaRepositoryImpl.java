package fr.dta.mediatheque.application.repository.impl;

import java.util.List;

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

	@Override
	public List<Media> findAllMedia() {
		return findAll();
	}

	@Override
	public Media findByTitre(String titre) {
		return findFirst("select u from Media u where u.title ='"+titre+"'");
	}

	@Override
	public Media findByAuteur(String auteur) {
		return findFirst("select u from Media u where u.author ='"+auteur+"'");
	}

	@Override
	public Media findByType(String type) {
		return findFirst("select u from Media u where u.type ='"+type+"'");
	}

}
