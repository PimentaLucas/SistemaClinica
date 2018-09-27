package Servicos;

import Entidades.Funcionario;

public class ServicosFuncionario {

	Dao servico = new Dao();
	
	public void inserirFuncionario(Funcionario f) {
		servico.inserir(f);
}
}
