package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

		@Column(name="NOME",length=150)
		private String nome;
		
		@Id
		@Column(name="CPF",length=11)
		private String cpf_client;
		
		@Column(name="TELEFONE")
		private String telefone;
		
		@Column(name="CELULAR")
		private String celular;
		
		@Column(name="ENDERECO")
		private String endereco;
		
		@Column(name="EMAIL")
		private String email;
		
		
		
		public String getNome() {
			return nome;
		}
		
		
		public String getCpf_client() {
			return cpf_client;
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
		
		public void setCpf_client(String cpf_client) {
			this.cpf_client = cpf_client;
		}
}