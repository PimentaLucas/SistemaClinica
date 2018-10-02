package entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Procedimento {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="PROCEDIMENTO_ID")
		private int procedimentId;
		
		@Column(name="NOME")
		private String nome;
		
		@Column(name="DESCRICAO")
		private String descricao;
		
		@Column(name="VALOR")
		private Float  valor;
		
		@OneToMany(mappedBy = "atendimento_id", targetEntity = Atendimento.class, fetch = FetchType.LAZY,
				cascade = CascadeType.ALL)
		List<Atendimento> atendimentos;
		
		
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
