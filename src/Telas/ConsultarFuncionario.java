package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import entidades.Funcionario;
import servicos.ServicoFuncionario;

public class ConsultarFuncionario extends javax.swing.JFrame {

	ServicoFuncionario servico = new ServicoFuncionario();

	/**
	 * Creates new form ConsultarFuncionario
	 */
	public ConsultarFuncionario() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		botaoVoltar = new javax.swing.JButton();
		labelNome = new javax.swing.JLabel();
		nomeFuncionario = new javax.swing.JTextField();
		pesquisaFuncionario = new javax.swing.JButton();
		pesquisaFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurarFuncionarios();
				
			}
		});
		jScrollPane1 = new javax.swing.JScrollPane();
		tabelaFuncionario = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 153, 153));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Consultar Funcionário");

		botaoVoltar.setBackground(new java.awt.Color(255, 153, 153));
		botaoVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
		botaoVoltar.setText("Voltar");
		botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoVoltarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1)
						.addGap(95, 95, 95).addComponent(botaoVoltar)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1)
						.addContainerGap(25, Short.MAX_VALUE))
				.addGroup(
						jPanel1Layout.createSequentialGroup().addComponent(botaoVoltar).addGap(0, 0, Short.MAX_VALUE)));

		labelNome.setText("Nome");

		pesquisaFuncionario.setBackground(new java.awt.Color(255, 153, 153));
		pesquisaFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		pesquisaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
		pesquisaFuncionario.setText("Pesquisar");

		tabelaFuncionario
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { },
						new String[] { "Nome", "Celular", "Telefone"}));
		jScrollPane1.setViewportView(tabelaFuncionario);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addContainerGap(30, Short.MAX_VALUE).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
										.createSequentialGroup()
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 30, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(labelNome)
										.addGroup(layout.createSequentialGroup()
												.addComponent(nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE,
														245, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(pesquisaFuncionario,
														javax.swing.GroupLayout.PREFERRED_SIZE, 93,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(labelNome)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(pesquisaFuncionario))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(24, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		new TelaFuncionario().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ConsultarFuncionario().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton botaoVoltar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel labelNome;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tabelaFuncionario;
	private javax.swing.JTextField nomeFuncionario;
	private javax.swing.JButton pesquisaFuncionario;
	// End of variables declaration
	
	private void procurarFuncionarios() {
		String nome = nomeFuncionario.getText();
		List<Funcionario> funcionarios = null;
		funcionarios = servico.buscaPorNome(nome);

		DefaultTableModel modeloTabela = (DefaultTableModel) tabelaFuncionario.getModel();

		for (int i = 0; i < funcionarios.size(); i++) {
			modeloTabela.addRow(new String[modeloTabela.getColumnCount()]);
			tabelaFuncionario.setValueAt(funcionarios.get(i).getNome(), i, 0);
			tabelaFuncionario.setValueAt(funcionarios.get(i).getCelular(), i, 1);
			tabelaFuncionario.setValueAt(funcionarios.get(i).getTelefone(), i, 2);
		}
	}
}
