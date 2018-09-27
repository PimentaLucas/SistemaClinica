import Entidades.Cliente;
import Servicos.ServicosCliente;

public class main {

		public static void main(String[] args) {
			Cliente c = new Cliente();
			
			c.setNome("teste");
			c.setCpfCliente("teste");
			c.setEmail("teste");
			c.setCelular("teste");
			c.setTelefone("teste");
			c.setEndereco("teste");
			
			ServicosCliente sc = new ServicosCliente();
			
			sc.inserirCliente(c);
		}
}
