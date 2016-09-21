<<<<<<< HEAD:src/main/java/application/repository/impl/MediaRepositoryImpl.java
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
=======
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
>>>>>>> 723622ee5438056a6455e4959f990d977615a556:src/main/java/application/repository/impl/MediaRepositoryImpl.java
