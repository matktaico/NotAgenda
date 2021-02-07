package agenda.janelas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logo extends JPanel {

	/**
	 * Create the panel.
	 */
	public Logo() {
		setForeground(SystemColor.desktop);
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Bem Vindo ");
		lblTitulo.setBounds(109, 24, 215, 95);
		lblTitulo.setForeground(SystemColor.textHighlight);
		lblTitulo.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 32));
		add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(37, 130, 300, 95);
		lblNewLabel.setIcon(new ImageIcon(Logo.class.getResource("/imagem/logo.png")));
		add(lblNewLabel);

	}
}
