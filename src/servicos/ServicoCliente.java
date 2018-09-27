package servicos;

import entidades.Cliente;
import servicosDaos.DaoCliente;

public class ServicoCliente {
	
	DaoCliente dao = new DaoCliente();
	
	public void inserirCliente(Cliente c){
		dao.inserirCliente(c);
	}
	
	public Cliente criarCliente(String nome, String cpf, String telefone, String celular, String email, String endereco) {
		Cliente c = new Cliente();
		
		c.setNome(nome.isEmpty() ? null : nome);
		c.setCpfCliente(cpf.isEmpty() ? null : cpf);
		c.setEmail(email.isEmpty() ? null : email);
		c.setCelular(celular.isEmpty() ? null : celular);
		c.setEndereco(endereco.isEmpty() ? null : endereco);
		c.setTelefone(telefone.isEmpty() ? null : telefone);
		
	
		return c;
		
	}

}
