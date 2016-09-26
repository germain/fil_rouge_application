package fr.dta.mediatheque.application.service;

import java.util.List;

import fr.dta.mediatheque.application.core.JpaRepository;
import fr.dta.mediatheque.application.core.Model;

public interface GenericService<T extends Model> {
	
	public JpaRepository<T> getRepository();		
	public default T save(T t){		return getRepository().save(t);	}	
	public default void remove(T t){		getRepository().delete(t);	}
	public default T getById(int id){		return getRepository().findOne(id);	}
	public default List<T> getAll(){ return getRepository().findAll();}
}

