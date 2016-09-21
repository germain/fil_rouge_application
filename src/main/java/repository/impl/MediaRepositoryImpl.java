package repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import core.JpaRepositoryImpl;
import modele.media.Media;
import repository.MediaRepository;

@Repository
public class MediaRepositoryImpl extends JpaRepositoryImpl<Media> implements MediaRepository {

	@Override
	protected Class<Media> getEntityClass() {
		// TODO Auto-generated method stub
		return Media.class;
	}

}
