<<<<<<< HEAD
//package application.controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import fr.dta.application.media.model.Media;
//
//public class MediaController {
//	@Autowired private MediaService mediaService;
//	
//	@RequestMapping(value = "/media/{id}", method = RequestMethod.GET)
//	public ResponseEntity<Media> findMediaById(@PathVariable int id) {
//		Media media = mediaService.getById(id);
//		if (media == null)
//			return new ResponseEntity<Media>(HttpStatus.NOT_FOUND);
//		return new ResponseEntity<Media>(media, HttpStatus.OK);
//	}
//	
//	@RequestMapping(value = "/createMedia", method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public Media createMedia(@RequestBody Media media) {
//		return mediaService.save(media);
//	}
//	
//	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
//	public Media updateMedia(@PathVariable int id, @RequestBody Media media){
//		return mediaService.update(id);
//	}
//	
//	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//	public void deleteMedia(@PathVariable int id){
//		mediaService.delete(id);
//	}
//}
=======
//package application.controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import fr.dta.application.media.model.Media;
//
//public class MediaController {
//	@Autowired private MediaService mediaService;
//	
//	@RequestMapping(value = "/media/{id}", method = RequestMethod.GET)
//	public ResponseEntity<Media> findMediaById(@PathVariable int id) {
//		Media media = mediaService.getById(id);
//		if (media == null)
//			return new ResponseEntity<Media>(HttpStatus.NOT_FOUND);
//		return new ResponseEntity<Media>(media, HttpStatus.OK);
//	}
//	
//	@RequestMapping(value = "/createMedia", method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public Media createMedia(@RequestBody Media media) {
//		return mediaService.save(media);
//	}
//	
//	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
//	public Media updateMedia(@PathVariable int id, @RequestBody Media media){
//		return mediaService.update(id);
//	}
//	
//	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//	public void deleteMedia(@PathVariable int id){
//		mediaService.delete(id);
//	}
//}
>>>>>>> 723622ee5438056a6455e4959f990d977615a556
