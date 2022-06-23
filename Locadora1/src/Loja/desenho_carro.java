package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class desenho_carro extends JFrame {

	private JPanel tela_brasilia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					desenho_carro frame = new desenho_carro();
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
	public desenho_carro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 340);
		tela_brasilia = new JPanel();
		tela_brasilia.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tela_brasilia);
		tela_brasilia.setLayout(null);
		
		JLabel desenho_carro = new JLabel("");
		desenho_carro.setIcon(new ImageIcon("D:\\Locadora1\\imagem\\volkswagen-brasilia-brasilia-ls-1600-ano-1979-impecavel-branco_8204112519.jpg"));
		desenho_carro.setBounds(0, 0, 450, 301);
		tela_brasilia.add(desenho_carro);
	}

}
