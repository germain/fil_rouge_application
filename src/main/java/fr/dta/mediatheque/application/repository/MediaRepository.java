
package fr.dta.mediatheque.application.repository;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Media;

public interface MediaRepository extends JpaRepository<Media> {
	public Media findByLogin(String login);
}
