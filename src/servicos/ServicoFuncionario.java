package servicos;

import entidades.Funcionario;
import servicosDaos.DaoFuncionario;

public class ServicoFuncionario {
	
	DaoFuncionario dao = new DaoFuncionario();
	
	
	public void inserirFuncionario(Funcionario f){
		dao.inserirFuncionario(f);
	}
	
	
	
	public Funcionario criarFuncionario(String nome, String cpf, String telefone, String celular, String email, String endereco) {
		Funcionario f = new Funcionario();
		
		f.setNome(nome.isEmpty() ? null : nome);
		f.setCpfFunc(cpf.isEmpty() ? null : cpf);
		f.setEmail(email.isEmpty() ? null : email);
		f.setCelular(celular.isEmpty() ? null : celular);
		f.setEndereco(endereco.isEmpty() ? null : endereco);
		f.setTelefone(telefone.isEmpty() ? null : telefone);
		
		
		return f;
		
	}

}
