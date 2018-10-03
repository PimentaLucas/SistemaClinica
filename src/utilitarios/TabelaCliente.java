//package utilitarios;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import javax.swing.table.AbstractTableModel;
//
//import entidades.Cliente;
//
//public class TabelaCliente extends AbstractTableModel {
//    private static final int COL_ID = 0;
//    private static final int COL_NOME = 1;
//    private static final int COL_SENHA = 1;
//    private List<Cliente> valores;       
//    //Esse � um construtor, que recebe a nossa lista de usu�rios
//    
//    public TitulosTableModel(List<Cliente> valores) {
//          this.valores = new ArrayList<Usuario>(valores);
//    }
//    public int getRowCount() {
//        //Quantas linhas tem sua tabela? Uma para cada item da lista.
//        return valores.size();
//    }
//    public int getColumnCount() {
//        //Quantas colunas tem a tabela? Nesse exemplo, s� 3.
//        return 3;
//    }
//    public String getColumnName(int columnIndex) {
//        //Qual � o nome das nossas colunas?
//        String colunas[] = {"Autor", "T�tulo", "Senha"};
//        return colunas[columnIndex];
//    }
//    public Object getValueAt(int row, int column) {
//        //Precisamos retornar o valor da coluna column e da linha row.
//        Cliente u = valores.get(row);
//        if (column == COL_ID) return u.getId();
//        else if (column == COL_NOME) return u.getNome();
//        else if (column == COL_SENHA) return u.getSenha();
//    }
//    public  void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no par�metro.
//        //Note que vc poderia alterar 2 campos ao inv�s de um s�.
//        Usuario u = valores.get(row);
//        if (column == COL_ID) u.setId((Integer)aValue);
//        else if (column == COL_NOME) u.setNome(aValue.toString());
//        else if (column == COL_SENHA) u.setNome(aValue.toString());
//    }
//    public  Class getColumnClass(int columnIndex) {
//        //Qual a classe das nossas colunas? A coluna 1 � inteira, as outras string.
//        if (columnIndex == COL_ID) return Integer.class;
//        return String.class;
//    }
//    boolean isCellEditable(int rowIndex, int columnIndex) {
//        //Indicamos se a c�lula da rowIndex e da columnIndex � edit�vel. Nossa tabela toda �.
//        return true;
//    }
//    public List<Usuario> getUsuarios() {
//       return Collections.unmodifiableList<Usuario>(usuarios);
//    }
//    //Usuaremos esse m�todo para adicionar um novo usu�rio da tabela
//    public void Adicionar(Usuario usuario) {
//       usuarios.add(usuario);   //Adicionamos na lista
//       fireTableRowsInserted(usuarios.size(), usuarios.size()); //Avisamos a tabela para repintar a linha
//    }
//    //Aqui faremos a remo��o do usu�rio
//    public void Remover(Usuario usuario) {
//       int index = usuario.indexOf(usuario);
//       if (index == -1)  //Se o usu�rio n�o estiver na tabela
//          return;           //Saimos sem fazer nada
//       usuarios.remove(index);   //Caso contr�rio, removemos da lista
//       fireTableRowsDeleted(index, index); //Repintamos a linha
//    }
//}