package entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Procedimento {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		@Column(name="NOME")
		private String nome;
		
		@Column(name="DESCRICAO")
		private String descricao;
		
		@Column(name="VALOR")
		private Float  valor;
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public float getValor() {
			return valor;
		}
		public void setValor(float valor) {
			this.valor = valor;
		}
		
		
}
