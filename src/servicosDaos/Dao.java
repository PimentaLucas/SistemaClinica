package servicosDaos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Dao<T> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager");
	EntityManager em = emf.createEntityManager();	
	
	protected void inserir(T entidade){
		
		begin();
		em.persist(entidade);
		commit();
		
		
	}
	
	
	protected void begin() {
		em.getTransaction().begin();
	}
	
	protected void commit() {
		em.getTransaction().commit();
	}
	
	
}
