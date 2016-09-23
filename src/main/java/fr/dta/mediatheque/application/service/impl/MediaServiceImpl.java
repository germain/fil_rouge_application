package fr.dta.mediatheque.application.service.impl;

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

		@Override
		public List<Media> findMedia(Media media) {
			CriteriaQuery<Media> crit = repository.newCriteria();
			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
			Root<Media> from = crit.from(Media.class);
			CriteriaQuery<Media> medias = crit.multiselect(from);
			Predicate predicate1 = criteriaBuilder.equal(from.get("titre"), media.getTitle());
			Predicate predicate2 = criteriaBuilder.equal(from.get("type"), media.getType());
			Predicate predicate3 = criteriaBuilder.equal(from.get("auteur"), media.getAuthor());
			crit.where(criteriaBuilder.and(predicate1,predicate2,predicate3));
			return em.createQuery(crit).getResultList();
		}
}
