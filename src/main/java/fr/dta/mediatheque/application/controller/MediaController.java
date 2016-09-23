package fr.dta.mediatheque.application.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
import fr.dta.mediatheque.application.model.Media;
import fr.dta.mediatheque.application.service.MediaService;

@RestController
public class MediaController {
	@Autowired private MediaService mediaService;
	
	@RequestMapping(value = "/media/{id}", method = RequestMethod.GET)
	public ResponseEntity<Media> findMediaById(@PathVariable int id) {
		Media media = mediaService.getById(id);
		if (media == null)
			return new ResponseEntity<Media>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Media>(media, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/createMedia", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Media createMedia(@RequestBody Media media) {
		if(media.getId()>0) {
			System.out.println("media existe deja");
			return null;
		}else{
			return mediaService.save(media);
		}	
	}
	
	@RequestMapping(value = "/media", method = RequestMethod.GET)
	public List<Media> findAllMedia() {
		return mediaService.findAllMedia();
	}	
	
	@RequestMapping(value = "/media/{id}", method = RequestMethod.PUT)
	public Media updateMedia(@RequestBody Media media){
		if(media.getId()<=0) {
			System.out.println("media n'existe pas");
			return null;
		}else{
			return mediaService.save(media);
		}
	}
	
	@RequestMapping(value = "/media/{id}", method = RequestMethod.DELETE)
	public void deleteMedia(@PathVariable int id){
		Media media =mediaService.getById(id);
		mediaService.remove(media);
	}
	
	@RequestMapping(value = "/media/recherche", method = RequestMethod.GET)
	public ResponseEntity<List<Media>> findMediaWithTitle(@RequestBody Media media, HttpSession session) {
		if(media.getTitle()==null) {
			System.out.println("title non trouvé");
			if(media.getAuthor()==null){
				System.out.println("auteur non trouvé");
				if(media.getType()==null) {
					System.out.println("type non trouvé");
				}
			}
		}
		
		List<Media> mediaResd = mediaService.findMedia(media);
		
		if (media == null)	return new ResponseEntity<List<Media>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Media>>(mediaResd, HttpStatus.OK);
	}
	
//	@RequestMapping(value = "/media/recherche", method = RequestMethod.GET)
//	public ResponseEntity<Media> findMediaWithAuthor(@RequestParam("author") String author) {
//		Media media = mediaService.findMediaByAuteur(author);
//		if (media == null)	return new ResponseEntity<Media>(HttpStatus.NOT_FOUND);
//		return new ResponseEntity<Media>(media, HttpStatus.OK);
//	}
}
