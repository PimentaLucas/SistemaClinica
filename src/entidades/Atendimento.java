package entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Atendimento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ATENDIMENTO_ID")
	private int atendimentoId;
	
	@Column(name="DATA")
	private String data;
	
	@ManyToOne
	@JoinColumn(name="CPF_CLIENTE")
	private Cliente cliente;
	
	
	@ManyToOne
	@JoinColumn(name="CPF_FUNC")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name="PROCEDIMENTO_ID")
	private String procedimento;
	
	
	
	public String getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
