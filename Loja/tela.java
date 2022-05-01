package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtEuTeAmo;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
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
	public tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Prosseguir = new JButton("Proximo");
		Prosseguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Prosseguir.setBounds(180, 209, 89, 23);
		contentPane.add(Prosseguir);
		
		txtEuTeAmo = new JTextField();
		txtEuTeAmo.setBounds(39, 43, 363, 20);
		contentPane.add(txtEuTeAmo);
		txtEuTeAmo.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(39, 134, 363, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(39, 109, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(39, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
	}
}
