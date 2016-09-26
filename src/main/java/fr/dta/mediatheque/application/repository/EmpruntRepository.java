
package fr.dta.mediatheque.application.repository;

import java.util.Date;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt> {
 public void emprunt (int id_adherent, int id_media, String depart);
}
