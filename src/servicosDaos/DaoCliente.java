package servicosDaos;

import java.util.List;

import entidades.Cliente;

public class DaoCliente extends Dao<Cliente> {
		
	
	public void inserirCliente(Cliente c) {
			inserir(c);
	}
	
	
	public Cliente buscaPorID(String id) {
		
		Cliente c = null;
		
		c = em.find(Cliente.class, id);
		
		
		
		return c;
	}
	
	
	public List<Cliente> buscaPorNome(String nome){
		
		List<Cliente> clientes = null;
		
		clientes = em.createQuery("from Cliente c where c.nome LIKE :nome").setParameter("nome",nome + "%").getResultList();
		
		return clientes;
	}
	
	
	

}
