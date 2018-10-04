package servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entidades.Atendimento;
import entidades.Cliente;
import entidades.Funcionario;
import entidades.Procedimento;
import servicosDaos.DaoAtendimento;
import servicosDaos.DaoFuncionario;
import servicosDaos.DaoProcedimento;

public class ServicoAtendimento {

	DaoAtendimento dao = new DaoAtendimento();
	DaoFuncionario funcionario = new DaoFuncionario();
	DaoProcedimento proc = new DaoProcedimento();

	public void inserirAtendimento(Atendimento a) {
		dao.inserirAtendimento(a);
	}

	public Atendimento criarAtendimento(Cliente c, Procedimento p, Funcionario f, String data) throws ParseException {
		Atendimento a = new Atendimento();

		a.setCliente(c);
		a.setFuncionario(f);
		a.setProcedimento(p);
		a.setData(data);

		return a;

	}

	public List<Funcionario> listaFuncionarios() {

		List<Funcionario> funcionarios = null;
		funcionarios = funcionario.buscaTodos();

		return funcionarios;
	}

	public List<Procedimento> listaProcedimentos() {

		List<Procedimento> procedimentos = null;

		procedimentos = proc.buscaTodos();

		return procedimentos;

	}

	public ArrayList<String> nomesFuncionarios(List<Funcionario> funcionarios) {
		ArrayList<String> lista = new ArrayList<String>();

		for (int i = 0; i < funcionarios.size(); i++) {

			lista.add(funcionarios.get(i).getNome());

		}
		
		return lista;
	}

	public ArrayList<String> nomesProcedimentos(List<Procedimento> procedimentos) {
		ArrayList<String> lista = new ArrayList<String>();

		for (int i = 0; i < procedimentos.size(); i++) {

			lista.add(procedimentos.get(i).getNome());

		}
		
		return lista;
	}
	
	public String pegaDataAtual() {
		Date data = new Date(System.currentTimeMillis());  
		SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy"); 
		return (formatarDate.format(data));
	}
	
	
}
