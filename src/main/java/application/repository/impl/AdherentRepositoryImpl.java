package application.repository.impl;

import org.springframework.stereotype.Repository;

import application.core.JpaRepositoryImpl;
import application.model.adherent.Adherent;
import application.repository.AdherentRepository;

@Repository
public class AdherentRepositoryImpl extends JpaRepositoryImpl<Adherent>implements AdherentRepository {

	@Override
	protected Class<Adherent> getEntityClass() {
		// TODO Auto-generated method stub
		return Adherent.class;
	}


}
