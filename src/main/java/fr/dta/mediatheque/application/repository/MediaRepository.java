
package fr.dta.mediatheque.application.repository;

import java.util.List;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Media;

public interface MediaRepository extends JpaRepository<Media> {
	public Media findByTitre(String titre);
	public Media findByAuteur(String auteur);
	public Media findByType(String type);
	public List<Media> findAllMedia();
}
