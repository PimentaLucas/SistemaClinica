package entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Funcionario {
	
	@Column(name="NOME") 
	private String nome;
	
	@Id
	@Column(name="CPF_FUNC")
	private String cpfFunc;
	
	@Column(name="TELEFONE")
	private String telefone;
	
	@Column(name="CELULAR")
	private String celular;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@OneToMany(mappedBy = "atendimentoId", targetEntity = Atendimento.class, fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	List<Atendimento> atendimentos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfFunc() {
		return cpfFunc;
	}
	public void setCpfFunc(String cpfFunc) {
		this.cpfFunc = cpfFunc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
