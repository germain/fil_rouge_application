package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.JpaRepository;
import modele.adherent.Adherent;
import modele.media.Media;
import repository.AdherentRepository;
import repository.MediaRepository;
import service.MediaService;
@Service ("mediaService")
public class MediaServiceImpl implements MediaService {

		@Autowired private MediaRepository repository;
		@Override public JpaRepository<Media> getRepository() {return repository;}
}
