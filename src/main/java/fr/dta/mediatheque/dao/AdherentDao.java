//package dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
//import application.model.adherent.Adherent;
//
//
//
//public class AdherentDao {
//	
//	static public void persistAdherent(Adherent a) {
//		EntityManager em = DatabaseHelper.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(a);
//		DatabaseHelper.commitTxAndClose(em);
//	}
//	
//	static public void mergeAdherent(Adherent a) {
//		EntityManager em = DatabaseHelper.createEntityManager();
//		em.getTransaction().begin();
//		em.merge(a);
//		DatabaseHelper.commitTxAndClose(em);
//	}	
//	
//	static public void findAdherent(long id) {		
//		EntityManager em = DatabaseHelper.createEntityManager();		
//		Query query = em.createQuery("FROM Adherent WHERE id=:id",Adherent.class);
//		query.setParameter("id", id);
//		Adherent adherentFind = (Adherent) query.getSingleResult();
//		System.out.println(adherentFind.getPrenom());		
//	}
//	
//	static public void CountAdherentEmprunt(long id) {		
//		EntityManager em = DatabaseHelper.createEntityManager();		
//		Query query = em.createQuery("FROM Adherent WHERE id=:id",Adherent.class);
//		query.setParameter("id", id);
//		Adherent adherentFind = (Adherent) query.getSingleResult();	
//		System.out.println("nb emprunt de l'adherent " + adherentFind.getNbEmpruntEnCours());	
//	}
//	
//	static public void listAdherent() {		
//		EntityManager em = DatabaseHelper.createEntityManager();		
//		Query query = em.createQuery("FROM Adherent",Adherent.class);
//		List<Adherent> adherents = query.getResultList();
//		for (Adherent adherent : adherents) {
//			System.out.println(adherent.getPrenom());
//		}	
//	}		
//	
//	static public void DeleteAdherent(long id) {	
//		EntityManager em = DatabaseHelper.createEntityManager();
//		em.getTransaction().begin();
//		Query query = em.createQuery("delete Adherent where id=:id").setParameter("id", id);		
//		query.executeUpdate();		
//		DatabaseHelper.commitTxAndClose(em);
//	}
//
//
//}
