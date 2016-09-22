package fr.dta.mediatheque.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Media;
import fr.dta.mediatheque.application.repository.MediaRepository;
import fr.dta.mediatheque.application.service.MediaService;
@Service ("mediaService")
public class MediaServiceImpl implements MediaService {

		@Autowired private MediaRepository repository;
		@Override public JpaRepository<Media> getRepository() {return repository;}
		
		@Override
		public Media findMediaByLogin(String login) {
			return repository.findByLogin(login);
		}
}
