import entidades.Cliente;
import servicosDaos.DaoCliente;

public class main {

		public static void main(String[] args) {
			Cliente c = new Cliente();
			
			c.setNome("teste");
			c.setCpfCliente("teste");
			c.setEmail("teste");
			c.setCelular("teste");
			c.setTelefone("teste");
			c.setEndereco("teste");
			
			DaoCliente sc = new DaoCliente();
			
			sc.inserirCliente(c);
		}
}
