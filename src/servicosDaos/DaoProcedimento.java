package servicosDaos;

import java.util.List;

import entidades.Procedimento;

public class DaoProcedimento extends Dao<Procedimento> {


	
	public void inserirProcedimento(Procedimento p) {
		inserir(p);
}
	
	public List<Procedimento> buscaPorNome(String nome){
		
		List<Procedimento> procedimentos = null;
		
		procedimentos = em.createQuery("from Procedimento p where p.nome LIKE :nome").setParameter("nome",nome + "%").getResultList();
		
		return procedimentos;
		
	}
	
	
}
