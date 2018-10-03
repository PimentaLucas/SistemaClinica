package servicos;

import java.text.ParseException;
import java.util.ArrayList;
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

	public String[] listaFuncionarios() {
		ArrayList<String> lista = new ArrayList<String>();
		List<Funcionario> funcionarios = null;
		funcionarios = funcionario.buscaTodos();

		for (int i = 0; i < funcionarios.size(); i++) {

			lista.add(funcionarios.get(i).getNome());

		}
		String[] nomes = lista.toArray(new String[lista.size()]);

		return nomes;
	}

	public String[] listaProcedimentos() {
		ArrayList<String> lista = new ArrayList<String>();
		List<Procedimento> procedimentos = null;

		procedimentos = proc.buscaTodos();

		for (int i = 0; i < procedimentos.size(); i++) {

			lista.add(procedimentos.get(i).getNome());

		}
		String[] nomes = lista.toArray(new String[lista.size()]);
		
		return nomes;

	}
}
