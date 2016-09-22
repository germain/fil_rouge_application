package fr.dta.mediatheque.application.service;

import java.util.List;

import fr.dta.mediatheque.application.core.GenericService;
import fr.dta.mediatheque.application.model.Adherent;

public interface AdherentService extends GenericService<Adherent> {
	public Adherent findAdherentByLogin(String login);
	public List<Adherent> findAllAdherent();
}
