package fr.dta.mediatheque.application.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.dta.mediatheque.application.model.Adherent;
import fr.dta.mediatheque.application.model.Cotisation;
import fr.dta.mediatheque.application.service.AdherentService;
import fr.dta.mediatheque.application.service.EmpruntService;


@RestController
public class Emprunt {
	
	@Autowired private EmpruntService empruntService;
	
	@RequestMapping(value = "/emprunt", method = RequestMethod.POST)
	public void findAllAdherent(@RequestParam("id_adh") int id_adherent, @RequestParam("id_media") int id_media, @RequestParam("depart") String depart ) {
		
		empruntService.emprunt(id_adherent, id_media, depart);			
		
	}	
	
	
//	@RequestMapping(value = "/createAdherent", method = RequestMethod.GET)
//	//@ResponseStatus(HttpStatus.CREATED)
//	//public Adherent createAdherent(@RequestParam("label") String label, HttpServletRequest request, Adherent adherent) {
//	public Adherent createAdh(){		
//	
//		Cotisation cot = new Cotisation();
//		Adherent adherent = new Adherent ("nom", "prenom", new Date("10/03/1999"), "email", "adresse", 75000,"ville", 2, cot);
//		return adherentService.save(adherent);
//	}
	
//	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
//	public Adherent updateAdherent(@PathVariable int id, @RequestBody Adherent adherent){
//		return adherentService.update(id);
//	}
//	
//	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//	public void deleteAdherent(@PathVariable int id){
//		adherentService.delete(id);
//	}
}
