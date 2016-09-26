package fr.dta.mediatheque.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.dta.mediatheque.application.model.Adherent;
import fr.dta.mediatheque.application.service.AdherentService;

@RestController
public class AdherentController {
	@Autowired private AdherentService adherentService;
	
	@RequestMapping(value = "adherent/{id}", method = RequestMethod.GET)
	public ResponseEntity<Adherent> findAdherentById(@PathVariable int id) {
		Adherent adherent = adherentService.getById(id);
		if (adherent == null)
			return new ResponseEntity<Adherent>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Adherent>(adherent, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/adherent/recherche", method = RequestMethod.GET)
	public ResponseEntity<Adherent> findAdherentWithName(@RequestParam("nom") String nom) {
		Adherent adherent = adherentService.findAdherentByName(nom);
		if (adherent == null)
			return new ResponseEntity<Adherent>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Adherent>(adherent, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/adherent", method = RequestMethod.GET)
	public List<Adherent> findAllAdherent() {
		return adherentService.findAllAdherent();
		/*
		if (adherent == null)
			return new ResponseEntity<Adherent>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Adherent>(adherent, HttpStatus.OK);*/		
	}	
	
	
	@RequestMapping(value = "/createAdherent", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Adherent createAdh(@RequestBody Adherent adherent){	
		if(adherent.getId()>0) {
			System.out.println("user existe deja");
			return null;
		}else{
			return adherentService.save(adherent);
		}
		
	}
	
	@RequestMapping(value = "/adherent/{id}", method = RequestMethod.PUT)
	public Adherent updateAdherent(@RequestBody Adherent adherent){
		if(adherent.getId()<=0) {
			System.out.println("user n'existe pas");
			return null;
		}else{
			return adherentService.save(adherent);
		}
	}
	
	@RequestMapping(value = "/adherent/{id}", method = RequestMethod.DELETE)
	public void deleteAdherent(@PathVariable int id){
		Adherent adherent =adherentService.getById(id);
		adherentService.remove(adherent);
	}
}
