package fr.dta.mediatheque.application.service;

import fr.dta.mediatheque.application.core.GenericService;
import fr.dta.mediatheque.application.model.Media;

public interface MediaService extends GenericService<Media>  {
	public Media findMediaByLogin(String login);
}
