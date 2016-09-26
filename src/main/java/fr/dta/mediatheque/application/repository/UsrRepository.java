package fr.dta.mediatheque.application.repository;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Usr;

public interface UsrRepository extends JpaRepository<Usr> {
	public Usr findByLogin(String login);
}

