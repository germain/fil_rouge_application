package fr.dta.mediatheque.application.repository.impl;

import org.springframework.stereotype.Repository;

import fr.dta.mediatheque.application.core.JpaRepositoryImpl;
import fr.dta.mediatheque.application.model.Cotisation;
import fr.dta.mediatheque.application.repository.CotisationRepository;

@Repository
public class CotisationRepositoryImpl extends JpaRepositoryImpl<Cotisation> implements CotisationRepository {

	@Override
	protected Class<Cotisation> getEntityClass() {
		// TODO Auto-generated method stub
		return Cotisation.class;
	}




}
