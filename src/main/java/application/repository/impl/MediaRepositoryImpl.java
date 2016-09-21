package application.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import application.core.JpaRepositoryImpl;
import application.model.media.Media;
import application.repository.MediaRepository;

@Repository
public class MediaRepositoryImpl extends JpaRepositoryImpl<Media> implements MediaRepository {

	@Override
	protected Class<Media> getEntityClass() {
		// TODO Auto-generated method stub
		return Media.class;
	}

}
