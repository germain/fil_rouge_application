<<<<<<< HEAD:src/main/java/application/service/impl/MediaServiceImpl.java
package application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.core.JpaRepository;
import application.model.adherent.Adherent;
import application.model.media.Media;
import application.repository.AdherentRepository;
import application.repository.MediaRepository;
import application.service.MediaService;
@Service ("mediaService")
public class MediaServiceImpl implements MediaService {

		@Autowired private MediaRepository repository;
		@Override public JpaRepository<Media> getRepository() {return repository;}
}
=======
package application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.core.JpaRepository;
import application.model.adherent.Adherent;
import application.model.media.Media;
import application.repository.AdherentRepository;
import application.repository.MediaRepository;
import application.service.MediaService;
@Service ("mediaService")
public class MediaServiceImpl implements MediaService {

		@Autowired private MediaRepository repository;
		@Override public JpaRepository<Media> getRepository() {return repository;}
}
>>>>>>> 723622ee5438056a6455e4959f990d977615a556:src/main/java/application/service/impl/MediaServiceImpl.java
