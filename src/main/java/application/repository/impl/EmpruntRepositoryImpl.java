package application.repository.impl;

import org.springframework.stereotype.Repository;

import application.core.JpaRepositoryImpl;
import application.model.emprunt.Emprunt;
import application.repository.EmpruntRepository;

@Repository
public class EmpruntRepositoryImpl extends JpaRepositoryImpl<Emprunt>implements EmpruntRepository {

	@Override
	protected Class<Emprunt> getEntityClass() {
		// TODO Auto-generated method stub
		return Emprunt.class;
	}


}
