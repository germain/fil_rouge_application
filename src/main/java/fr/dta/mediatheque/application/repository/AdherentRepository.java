
package fr.dta.mediatheque.application.repository;

import java.util.List;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Adherent;

public interface AdherentRepository extends JpaRepository<Adherent> {
	public Adherent findByLogin(String login);

	public List<Adherent> findAllAdherent();
}
