package repository.impl;

import core.JpaRepositoryImpl;
import modele.cotisation.Cotisation;
import repository.CotisationRepository;

public class CotisationRepositoryImpl extends JpaRepositoryImpl<Cotisation> implements CotisationRepository {

	@Override
	protected Class<Cotisation> getEntityClass() {
		// TODO Auto-generated method stub
		return Cotisation.class;
	}




}
