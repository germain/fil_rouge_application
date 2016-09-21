<<<<<<< HEAD
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
=======
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
>>>>>>> 723622ee5438056a6455e4959f990d977615a556
