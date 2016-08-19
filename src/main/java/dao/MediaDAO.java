package dao;

import javax.persistence.EntityManager;
import fr.dta.application.media.model.Media;

public class MediaDAO {
	
    private static MediaDAO mediaDao;

    private MediaDAO() {
    }

    public static MediaDAO instance() {
        if (mediaDao == null) {
        	mediaDao = new MediaDAO();
        }
        return mediaDao;
    }
    
    public void addMedia(Media med) {
    	EntityManager entityManager = DatabaseHelper.createEntityManager();
    	try {
            DatabaseHelper.beginTx(entityManager);
            entityManager.persist(med);
            DatabaseHelper.commitTxAndClose(entityManager);
        } catch (Exception e) {
            DatabaseHelper.rollbackTxAndClose(entityManager);
            throw new RuntimeException(e);
        }
    }
}
