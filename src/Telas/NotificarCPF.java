package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class NotificarCPF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotificarCPF frame = new NotificarCPF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NotificarCPF() {
		setTitle("Adicionar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 207, 136);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCpfIncorreto = new JLabel("CPF INCORRETO!");
		lblCpfIncorreto.setForeground(new Color(255, 255, 255));
		lblCpfIncorreto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpfIncorreto.setBackground(new Color(255, 255, 255));
		lblCpfIncorreto.setBounds(47, 27, 111, 14);
		contentPane.add(lblCpfIncorreto);
		
		JButton btnCorrigir = new JButton("Corrigir");
		btnCorrigir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCorrigir.setForeground(new Color(255, 255, 255));
		btnCorrigir.setBackground(new Color(250, 128, 114));
		btnCorrigir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCorrigir.setBounds(52, 48, 89, 23);
		contentPane.add(btnCorrigir);
	}
}
