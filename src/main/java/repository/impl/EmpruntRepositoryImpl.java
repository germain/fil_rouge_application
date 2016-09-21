package repository.impl;

import core.JpaRepositoryImpl;
import modele.emprunt.Emprunt;
import repository.EmpruntRepository;

public class EmpruntRepositoryImpl extends JpaRepositoryImpl<Emprunt>implements EmpruntRepository {

	@Override
	protected Class<Emprunt> getEntityClass() {
		// TODO Auto-generated method stub
		return Emprunt.class;
	}


}
