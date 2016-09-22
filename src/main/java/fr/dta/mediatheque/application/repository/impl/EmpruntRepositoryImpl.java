package fr.dta.mediatheque.application.repository.impl;

import org.springframework.stereotype.Repository;

import fr.dta.mediatheque.application.core.JpaRepositoryImpl;
import fr.dta.mediatheque.application.model.Emprunt;
import fr.dta.mediatheque.application.repository.EmpruntRepository;

@Repository
public class EmpruntRepositoryImpl extends JpaRepositoryImpl<Emprunt>implements EmpruntRepository {

	@Override
	protected Class<Emprunt> getEntityClass() {
		// TODO Auto-generated method stub
		return Emprunt.class;
	}


}
