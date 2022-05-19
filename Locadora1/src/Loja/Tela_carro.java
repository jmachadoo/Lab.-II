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
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class Tela_carro extends JFrame {

	private JPanel especificacoes;
	private JTextField txt_modelo;
	private JTextField txt_cor;
	private JTextField txt_ano;
	private JTextField txt_potencia;
	private JTextField txt_marca;
	private JTextField txt_preco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_carro frame = new Tela_carro();
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
	public Tela_carro() {
		setTitle("Loja");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		especificacoes = new JPanel();
		especificacoes.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(especificacoes);
		especificacoes.setLayout(null);
		
		JLabel title_modelo = new JLabel("Modelo");
		title_modelo.setBounds(32, 39, 46, 14);
		especificacoes.add(title_modelo);
		
		txt_modelo = new JTextField();
		txt_modelo.setBounds(80, 36, 86, 20);
		especificacoes.add(txt_modelo);
		txt_modelo.setColumns(10);
		
		JLabel title_cor = new JLabel("Cor");
		title_cor.setBounds(32, 95, 46, 14);
		especificacoes.add(title_cor);
		
		txt_cor = new JTextField();
		txt_cor.setBounds(80, 92, 86, 20);
		especificacoes.add(txt_cor);
		txt_cor.setColumns(10);
		
		JLabel title_ano = new JLabel("Ano");
		title_ano.setBounds(32, 151, 46, 14);
		especificacoes.add(title_ano);
		
		txt_ano = new JTextField();
		txt_ano.setBounds(80, 148, 86, 20);
		especificacoes.add(txt_ano);
		txt_ano.setColumns(10);
		
		JLabel title_potencia = new JLabel("Potencia");
		title_potencia.setBounds(212, 39, 70, 14);
		especificacoes.add(title_potencia);
		
		txt_potencia = new JTextField();
		txt_potencia.setBounds(292, 36, 86, 20);
		especificacoes.add(txt_potencia);
		txt_potencia.setColumns(10);
		
		JLabel title_marca = new JLabel("Marca");
		title_marca.setBounds(212, 95, 46, 14);
		especificacoes.add(title_marca);
		
		txt_marca = new JTextField();
		txt_marca.setBounds(292, 92, 86, 20);
		especificacoes.add(txt_marca);
		txt_marca.setColumns(10);
		
		txt_preco = new JTextField();
		txt_preco.setBounds(292, 148, 86, 20);
		especificacoes.add(txt_preco);
		txt_preco.setColumns(10);
		
		JLabel title_preco = new JLabel("Pre\u00E7o");
		title_preco.setBounds(212, 151, 46, 14);
		especificacoes.add(title_preco);
		
		JButton botao_filtrar = new JButton("Filtrar");
		botao_filtrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				desenho_carro frame = new desenho_carro();
				frame.setVisible(true);
			}
		});
		botao_filtrar.setBounds(169, 208, 89, 23);
		especificacoes.add(botao_filtrar);
		
		
		
	}
}
