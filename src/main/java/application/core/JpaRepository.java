<<<<<<< HEAD:src/main/java/application/core/JpaRepository.java
package application.core;

import java.util.List;

import org.hibernate.Session;


public interface JpaRepository<T extends Model> {

	public Session getSession();
    public T save(T entity);
    public T findOne(int id);
    public List<T> findAll();
    public void delete(T entity);
    public void delete(int id);
	public boolean isNew(T entity);
}
=======
package application.core;

import java.util.List;

import org.hibernate.Session;


public interface JpaRepository<T extends Model> {

	public Session getSession();
    public T save(T entity);
    public T findOne(int id);
    public List<T> findAll();
    public void delete(T entity);
    public void delete(int id);
	public boolean isNew(T entity);
}
>>>>>>> 723622ee5438056a6455e4959f990d977615a556:src/main/java/application/core/JpaRepository.java
