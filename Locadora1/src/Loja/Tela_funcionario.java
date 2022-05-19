package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_funcionario extends JFrame {

	private JPanel painel;
	Funcionario F1;
	Funcionario F2 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_funcionario frame = new Tela_funcionario();
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
	public Tela_funcionario() {
		F2 = new Funcionario ("gabriel",23,"faxineiro");
		F1 = new Funcionario ("joao",21,"atendente");
		F1.setSituacao("Empregado");
		F2.setSituacao("Desempregado");
		setTitle("Dados dos funcion\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 435);
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		painel.setLayout(null);
		
		JComboBox idade = new JComboBox();
		idade.setBackground(Color.WHITE);
		idade.setBounds(104, 97, 220, 20);
		idade.addItem(F1.get_idade());
		idade.addItem(F2.get_idade());
		painel.add(idade);
		
		JComboBox nome = new JComboBox();
		nome.setBackground(Color.WHITE);
		nome.setBounds(104, 43, 220, 20);
		nome.addItem(F1.getNome());
		nome.addItem(F2.getNome());
		painel.add(nome);
		
		JComboBox funcao = new JComboBox();
		funcao.setBackground(Color.WHITE);
		funcao.setBounds(104, 153, 220, 20);
		funcao.addItem(F1.getfuncao());
		funcao.addItem(F2.getfuncao());
		painel.add(funcao);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(104, 18, 46, 14);
		painel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(104, 74, 46, 14);
		painel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fun\u00E7\u00E3o");
		lblNewLabel_2.setBounds(104, 128, 46, 14);
		painel.add(lblNewLabel_2);
		JLabel situacao = new JLabel("");
		situacao.setToolTipText("ff");
		situacao.setBounds(93, 198, 231, 61);
		painel.add(situacao);
		JButton filtrar = new JButton("Filtrar");
		
		filtrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (F1.getNome().equals(nome.getSelectedItem())) {	
			situacao.setText(F1.getSituacao());	
			
			}
			else situacao.setText(F2.getSituacao());
		
			}});
		
		filtrar.setForeground(Color.BLACK);
		filtrar.setBackground(Color.LIGHT_GRAY);
		filtrar.setBounds(187, 299, 112, 23);
		painel.add(filtrar);
		
		
	}
}
