package entidades;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@Entity
public class Cliente {

		@Column(name="NOME",length=150)
		private String nome;
		
		@Id
		@Column(name="CPF_CLIENTE",length=11)
		private String cpfCliente;
		
		@Column(name="TELEFONE")
		private String telefone;
		
		@Column(name="CELULAR")
		private String celular;
		
		@Column(name="ENDERECO")
		private String endereco;
		
		@Column(name="EMAIL")
		private String email;
		
		@OneToMany(mappedBy = "atendimentoId", targetEntity = Atendimento.class, fetch = FetchType.LAZY,
				cascade = CascadeType.ALL)
		List<Atendimento> atendimentos;
		
		
		
		
		public List<Atendimento> getAtendimentos(){
			
			return atendimentos;
		}
		
		
		
		public String getNome() {
			return nome;
		}
		
		
		public String getCpfCliente() {
			return cpfCliente;
		}
		
		
		public String getTelefone() {
			return telefone;
		}
		
		
		public String getCelular() {
			return celular;
		}
		
		
		public String getEndereco() {
			return endereco;
		}
		
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		public void setCelular(String celular) {
			this.celular = celular;
		}
		
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public void setCpfCliente(String cpfCliente) {
			this.cpfCliente = cpfCliente;
		}
}
