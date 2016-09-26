package fr.dta.mediatheque.application.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.model.Media;
import fr.dta.mediatheque.application.model.Type;
import fr.dta.mediatheque.application.repository.MediaRepository;
import fr.dta.mediatheque.application.service.MediaService;
@Service ("mediaService")
public class MediaServiceImpl implements MediaService {

		@Autowired private MediaRepository repository;
		@PersistenceContext protected EntityManager em;
		@Override public JpaRepository<Media> getRepository() {return repository;}
		
		
		@Override
		public List<Media> findAllMedia() {
			return repository.findAllMedia();
		}


//		@Override
//		public List<Media> findMedia(Media media) {
//			CriteriaQuery<Media> criteria = repository.newCriteria();
//			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//			Root<Media> from = criteria.from(Media.class);
//			
//			return null;
//		}

		@Override
		public List<Media> findMedia(Media media) {
			CriteriaQuery<Media> crit = repository.newCriteria();
			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
			Root<Media> from = crit.from(Media.class);
			List<Predicate> predicates = new ArrayList<Predicate>();
			//ajouter les conditions sur les predicats
			if(media.getTitle() != null){
			Predicate predicate1 = criteriaBuilder.like(criteriaBuilder.upper(from.get("title")), "%"+media.getTitle().toUpperCase().trim()+"%");
			predicates.add(predicate1);
			}
			if(media.getType() != null){
			Predicate predicate2 = criteriaBuilder.equal((from.get("type")),  media.getType());
			System.out.println(media.getType().toString().toUpperCase());
			predicates.add(predicate2);
			}
			if(media.getAuthor() != null){
			Predicate predicate3 = criteriaBuilder.like(criteriaBuilder.upper(from.get("author")),"%"+ media.getAuthor().toUpperCase().trim()+"%");
			predicates.add(predicate3);
			}
			 for (Predicate predicate : predicates) {
		            crit.where(criteriaBuilder.or(predicate), criteriaBuilder.and(predicate));
		        }
			return em.createQuery(crit).getResultList();
		}
		
}
