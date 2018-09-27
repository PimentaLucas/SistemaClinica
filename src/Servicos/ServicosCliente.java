package Servicos;

import Entidades.Cliente;

public class ServicosCliente {
		
		Dao servico = new Dao();
	
	public void inserirCliente(Cliente c) {
			servico.inserir(c);
	}

}
