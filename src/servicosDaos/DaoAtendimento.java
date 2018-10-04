package servicosDaos;

import java.util.List;

import entidades.Atendimento;

public class DaoAtendimento extends Dao<Atendimento> {

	public void inserirAtendimento(Atendimento a) {
		inserir(a);
	}

	public List<Atendimento> buscarTodos(){
		
		List<Atendimento> atendimentos = null;
		
		atendimentos = em.createQuery("from Atendimento a").getResultList();
		
		return atendimentos;
	}

}
