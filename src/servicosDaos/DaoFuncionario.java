package servicosDaos;

import java.util.List;

import entidades.Cliente;
import entidades.Funcionario;

public class DaoFuncionario extends Dao<Funcionario> {

	
	
	public void inserirFuncionario(Funcionario f) {
		inserir(f);
}
	
	
public List<Funcionario> buscaPorNome(String nome){
		
		List<Funcionario> funcionarios = null;
		
		funcionarios = em.createQuery("from Funcionario f where f.nome LIKE :nome").setParameter("nome",nome + "%").getResultList();
		
		return funcionarios;
	}

public List<Funcionario> buscaTodos(){
	
	List<Funcionario> funcionarios = null;
	
	funcionarios = em.createQuery("from Funcionario f").getResultList();
	
	return funcionarios;
}
	
	
	
	
}
