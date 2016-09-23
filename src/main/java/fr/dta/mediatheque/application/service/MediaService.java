package fr.dta.mediatheque.application.service;

import java.util.List;

import org.hibernate.Session;

import fr.dta.mediatheque.application.core.GenericService;
import fr.dta.mediatheque.application.model.Media;

public interface MediaService extends GenericService<Media>  {
	public List<Media> findAllMedia();
	public List<Media> findMedia(Media media);
}
