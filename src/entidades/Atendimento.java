package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
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
	private Procedimento procedimento;
	
	
	
	public Procedimento getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date parsed = format.parse(data);
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
        
		this.data = data;
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
	public int getAtendimentoId() {
		return atendimentoId;
	}
	public void setAtendimentoId(int atendimentoId) {
		this.atendimentoId = atendimentoId;
	}
}
