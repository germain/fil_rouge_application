package repository.impl;

import core.JpaRepositoryImpl;
import modele.adherent.Adherent;
import repository.AdherentRepository;

public class AdherentRepositoryImpl extends JpaRepositoryImpl<Adherent>implements AdherentRepository {

	@Override
	protected Class<Adherent> getEntityClass() {
		// TODO Auto-generated method stub
		return Adherent.class;
	}


}
