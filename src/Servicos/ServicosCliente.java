package Servicos;

import Entidades.Cliente;

public class ServicosCliente {
		
		Dao servico = new Dao();
	
	public void inserirCliente(Cliente c) {
			servico.inserir(c);
	}
	
	
	public Cliente criarCliente(String nome, String cpf, String telefone, String celular, String email, String endereco) {
		Cliente c = new Cliente();
		
		c.setNome(nome);
		c.setCpfCliente(cpf);
		c.setEmail(email);
		c.setCelular(celular);
		c.setEndereco(endereco);
		c.setTelefone(telefone);
		
		return c;
		
	}

}
