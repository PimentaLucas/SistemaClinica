package servicos;

import entidades.Procedimento;
import servicosDaos.DaoProcedimento;

public class ServicoProcedimento {

		DaoProcedimento dao = new DaoProcedimento();
		
		
		public void inserirProcedimento(Procedimento p){
			dao.inserirProcedimento(p);
		}
		
		public Procedimento criarProcedimento(String nome, String valorString, String descricao){
			Procedimento p = new Procedimento();
			
			valorString = (valorString.isEmpty() ? null : valorString);
			
			Float valorFloat = Float.valueOf(valorString);
			
			
			p.setNome(nome.isEmpty() ? null : nome);
			p.setValor(valorFloat);
			p.setDescricao(descricao.isEmpty() ? null : descricao);
			
			
			
			return p;
			
		}
		
}
