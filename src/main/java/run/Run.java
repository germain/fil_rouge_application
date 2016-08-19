package run;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");
	}

}
