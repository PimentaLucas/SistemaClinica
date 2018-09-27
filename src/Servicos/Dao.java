package Servicos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao<T> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager");
	EntityManager em = emf.createEntityManager();	
	
	public void inserir(T entidade){
		
		begin();
		em.persist(entidade);
		commit();
		
		
	}
	
	
	public void begin() {
		em.getTransaction().begin();
	}
	
	public void commit() {
		em.getTransaction().commit();
	}
}
