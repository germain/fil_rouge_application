package fr.dta.mediatheque.application.core;

import java.util.List;


	public interface GenericService<T extends Model> {
		
		public JpaRepository<T> getRepository();		
		public default T save(T t){		return getRepository().save(t);	}	
		public default void remove(T t){		getRepository().delete(t);	}
		public default T getById(int id){		return getRepository().findOne(id);	}
		public default List<T> getAll(){ return getRepository().findAll();}
	}

