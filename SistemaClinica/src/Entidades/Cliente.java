package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

		
		private String nome;
		private String cpf_client;
		private String telefone;
		private String celular;
		private String endereco;
		private String email;
		
		
		@Column(name="NOME",length=150)
		public String getNome() {
			return nome;
		}
		
		@Id
		@Column(name="CPF",length=11)
		public String getCpf_client() {
			return cpf_client;
		}
		
		@Column(name="TELEFONE")
		public String getTelefone() {
			return telefone;
		}
		
		@Column(name="CELULAR")
		public String getCelular() {
			return celular;
		}
		
		@Column(name="ENDERECO")
		public String getEndereco() {
			return endereco;
		}
		
		@Column(name="EMAIL")
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
		
		public void setCpf_client(String cpf_client) {
			this.cpf_client = cpf_client;
		}
}
