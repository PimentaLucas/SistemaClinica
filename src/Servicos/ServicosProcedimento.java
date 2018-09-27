package Servicos;

import Entidades.Procedimento;

public class ServicosProcedimento {

	Dao servico = new Dao();
	
	public void inserirProcedimento(Procedimento p) {
		servico.inserir(p);
}
}
