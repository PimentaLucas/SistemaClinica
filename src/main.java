import java.text.ParseException;

import entidades.Atendimento;
import entidades.Cliente;
import entidades.Funcionario;
import entidades.Procedimento;
import servicosDaos.DaoAtendimento;
import servicosDaos.DaoCliente;
import servicosDaos.DaoFuncionario;
import servicosDaos.DaoProcedimento;

public class main {

		public static void main(String[] args) throws ParseException {
			Cliente c = new Cliente();
			
			c.setNome("teste");
			c.setCpfCliente("teste7");
			c.setEmail("teste");
			c.setCelular("teste");
			c.setTelefone("teste");
			c.setEndereco("teste");
			
			Procedimento p = new Procedimento();
			p.setNome("teste");
			p.setDescricao("teste");
			p.setValor(70);
			
			Funcionario f = new Funcionario();
			
			f.setNome("teste");
			f.setCpfFunc("teste7");
			f.setEmail("teste");
			f.setCelular("teste");
			f.setTelefone("teste");
			f.setEndereco("teste");
			
			Atendimento a = new Atendimento();
			
			a.setCliente(c);
			a.setFuncionario(f);
			a.setProcedimento(p);
			a.setData("03/10/2018");
			
			DaoCliente sc = new DaoCliente();
			DaoProcedimento pc = new DaoProcedimento();
			DaoFuncionario fc = new DaoFuncionario();
			DaoAtendimento ac = new DaoAtendimento();
			
			sc.inserirCliente(c);
			pc.inserirProcedimento(p);
			fc.inserirFuncionario(f);
			ac.inserirAtendimento(a);
			
		}
		
}
