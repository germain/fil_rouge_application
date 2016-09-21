<<<<<<< HEAD
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
=======
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
>>>>>>> 723622ee5438056a6455e4959f990d977615a556
