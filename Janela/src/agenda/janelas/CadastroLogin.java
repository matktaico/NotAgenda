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

public class CadastroLogin extends JPanel {
	private JTextField txtUserCadastro;
	private JPasswordField passCadastro2;
	private JPasswordField passCadastro1;
	private JTextField txtLogin;
	private JPasswordField passLogin;

	/**
	 * Create the panel.
	 */
	public CadastroLogin() {
		setForeground(SystemColor.desktop);
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Bem Vindo ao");
		lblTitulo.setBounds(10, 0, 215, 95);
		lblTitulo.setForeground(SystemColor.textHighlight);
		lblTitulo.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 32));
		add(lblTitulo);
		
		JLabel lblCadastro = new JLabel("Cadastro de novo usu\u00E1rio");
		lblCadastro.setBounds(25, 106, 196, 14);
		lblCadastro.setForeground(SystemColor.textHighlight);
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		add(lblCadastro);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(392, 106, 46, 14);
		lblLogin.setForeground(SystemColor.textHighlight);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		add(lblLogin);
		
		JLabel lblUserCadastro = new JLabel("Usu\u00E1rio");
		lblUserCadastro.setBounds(65, 135, 46, 14);
		lblUserCadastro.setForeground(SystemColor.textHighlight);
		add(lblUserCadastro);
		
		JLabel lblSenhaCadastro1 = new JLabel("Senha");
		lblSenhaCadastro1.setBounds(65, 169, 46, 14);
		lblSenhaCadastro1.setForeground(SystemColor.textHighlight);
		add(lblSenhaCadastro1);
		
		JLabel lblSenhaCadastro2 = new JLabel("Confirmar Senha");
		lblSenhaCadastro2.setBounds(25, 199, 86, 17);
		lblSenhaCadastro2.setForeground(SystemColor.textHighlight);
		add(lblSenhaCadastro2);
		
		txtUserCadastro = new JTextField();
		txtUserCadastro.setBounds(135, 135, 139, 20);
		add(txtUserCadastro);
		txtUserCadastro.setColumns(10);
		
		passCadastro2 = new JPasswordField();
		passCadastro2.setBounds(135, 197, 139, 20);
		add(passCadastro2);
		
		passCadastro1 = new JPasswordField();
		passCadastro1.setBounds(135, 166, 139, 20);
		add(passCadastro1);
		
		JButton btnCadastro = new JButton("cadastrar");
		btnCadastro.setBounds(159, 228, 89, 23);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCadastro.setBackground(new Color(240, 255, 255));
		btnCadastro.setForeground(SystemColor.textInactiveText);
		add(btnCadastro);
		
		JLabel lblUserLogin = new JLabel("Usu\u00E1rio");
		lblUserLogin.setBounds(332, 135, 46, 14);
		lblUserLogin.setForeground(SystemColor.textHighlight);
		add(lblUserLogin);
		
		JLabel lblSenhaLogin = new JLabel("Senha");
		lblSenhaLogin.setBounds(332, 169, 46, 14);
		lblSenhaLogin.setForeground(SystemColor.textHighlight);
		add(lblSenhaLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(376, 131, 139, 20);
		txtLogin.setColumns(10);
		add(txtLogin);
		
		passLogin = new JPasswordField();
		passLogin.setBounds(376, 166, 139, 20);
		add(passLogin);
		
		JButton btnLogin = new JButton("entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtLogin.getText().equals("usuario") && passLogin.getPassword().equals("1234")) {
					
				}
			}
		});
		btnLogin.setBounds(407, 196, 89, 23);
		btnLogin.setForeground(SystemColor.textInactiveText);
		add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(215, 3, 300, 95);
		lblNewLabel.setIcon(new ImageIcon(CadastroLogin.class.getResource("/imagem/logo.png")));
		add(lblNewLabel);

	}
}
