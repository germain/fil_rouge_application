package application.repository.impl;

import org.springframework.stereotype.Repository;

import application.core.JpaRepositoryImpl;
import application.model.cotisation.Cotisation;
import application.repository.CotisationRepository;

@Repository
public class CotisationRepositoryImpl extends JpaRepositoryImpl<Cotisation> implements CotisationRepository {

	@Override
	protected Class<Cotisation> getEntityClass() {
		// TODO Auto-generated method stub
		return Cotisation.class;
	}




}
