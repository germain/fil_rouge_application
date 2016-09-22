//package dao;
//
//import javax.persistence.EntityManager;
//
//import application.model.emprunt.Emprunt;
//
//public class EmpruntDAO {
//	private static EmpruntDAO empruntDao;
//
//    private EmpruntDAO() {
//    }
//
//    public static EmpruntDAO instance() {
//        if (empruntDao == null) {
//        	empruntDao = new EmpruntDAO();
//        }
//        return empruntDao;
//    }
//    
//    public void addEmprunt(Emprunt emp) {
//    	EntityManager entityManager = DatabaseHelper.createEntityManager();
//    	try {
//            DatabaseHelper.beginTx(entityManager);
//            entityManager.persist(emp);
//            DatabaseHelper.commitTxAndClose(entityManager);
//        } catch (Exception e) {
////            DatabaseHelper.rollbackTxAndClose(entityManager);
//            throw new RuntimeException(e);
//        }
//    }
//    
//    
//}
