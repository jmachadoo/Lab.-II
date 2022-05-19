package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tela_cliente extends JFrame {

	
	private JPanel area_tela_cliente;
	private JTextField txt_nome;
	private JTextField txt_cpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_cliente frame = new Tela_cliente();
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
	public Tela_cliente() {
		setTitle("Cadastro do cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 287);
		area_tela_cliente = new JPanel();
		area_tela_cliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(area_tela_cliente);
		area_tela_cliente.setLayout(null);
		
		JLabel title_name = new JLabel("NOME");
		title_name.setBounds(10, 11, 46, 14);
		area_tela_cliente.add(title_name);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(10, 35, 334, 20);
		area_tela_cliente.add(txt_nome);
		txt_nome.setColumns(10);
		
		txt_cpf = new JTextField();
		txt_cpf.setBounds(10, 91, 334, 20);
		area_tela_cliente.add(txt_cpf);
		txt_cpf.setColumns(10);
		
		JLabel title_cpf = new JLabel("CPF");
		title_cpf.setBounds(10, 66, 46, 14);
		area_tela_cliente.add(title_cpf);
		
		
				
		JLabel info_cadastro = new JLabel("");
		info_cadastro.setBounds(130, 191, 100, 21);
		area_tela_cliente.add(info_cadastro);
		
		JButton botao_cadastro = new JButton("Cadastrar");
		area_tela_cliente.add(botao_cadastro);
		botao_cadastro.setBounds(130, 157, 100, 23);
		
		botao_cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info_cadastro.setText("Cadastrado");	
				
			}
		});
		
		
		
	}
}
