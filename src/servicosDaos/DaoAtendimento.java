package servicosDaos;

import entidades.Atendimento;
import entidades.Cliente;

public class DaoAtendimento extends Dao<Atendimento> {
	
	public void inserirAtendimento(Atendimento a) {
			inserir(a);
	}

}
