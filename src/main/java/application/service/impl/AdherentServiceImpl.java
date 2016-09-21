<<<<<<< HEAD:src/main/java/application/service/impl/AdherentServiceImpl.java
package application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.core.JpaRepository;
import application.model.adherent.Adherent;
import application.repository.AdherentRepository;
import application.service.AdherentService;

@Service ("adherentService")
public class AdherentServiceImpl implements AdherentService {
	@Autowired private AdherentRepository repository;
	@Override public JpaRepository<Adherent> getRepository() {return repository;}
=======
package application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.core.JpaRepository;
import application.model.adherent.Adherent;
import application.repository.AdherentRepository;
import application.service.AdherentService;

@Service ("adherentService")
public class AdherentServiceImpl implements AdherentService {
	@Autowired private AdherentRepository repository;
	@Override public JpaRepository<Adherent> getRepository() {return repository;}
>>>>>>> 723622ee5438056a6455e4959f990d977615a556:src/main/java/application/service/impl/AdherentServiceImpl.java
}