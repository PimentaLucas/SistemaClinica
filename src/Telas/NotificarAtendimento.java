package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotificarAtendimento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotificarAtendimento frame = new NotificarAtendimento();
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
	public NotificarAtendimento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 217, 150);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAtendimentoRegistrado = new JLabel("Atendimento Registrado!");
		lblAtendimentoRegistrado.setForeground(new Color(255, 255, 255));
		lblAtendimentoRegistrado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAtendimentoRegistrado.setBounds(21, 48, 170, 14);
		contentPane.add(lblAtendimentoRegistrado);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(new Color(250, 128, 114));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(54, 73, 89, 23);
		contentPane.add(btnNewButton);
	}
}
