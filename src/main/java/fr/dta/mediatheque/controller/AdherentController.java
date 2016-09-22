package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import modele.adherent.Adherent;
import service.AdherentService;

@RestController
public class AdherentController {
	@Autowired private AdherentService adherentService;
	
	@RequestMapping(value = "/adherent/{id}", method = RequestMethod.GET)
	public ResponseEntity<Adherent> findAdherentById(@PathVariable int id) {
		Adherent adherent = adherentService.getById(id);
		if (adherent == null)
			return new ResponseEntity<Adherent>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Adherent>(adherent, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/adherent", method = RequestMethod.GET)
	public ResponseEntity<Adherent> test() {
		return new ResponseEntity<Adherent>(HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/createAdherent", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createAdherent(@RequestBody Adherent adherent) {
		 adherentService.save(adherent);
	}

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
