package fr.dta.mediatheque.application.service;

import fr.dta.mediatheque.application.model.Usr;

public interface UsrService extends GenericService<Usr> {
	public Usr findUsrByLogin(String login);
}


