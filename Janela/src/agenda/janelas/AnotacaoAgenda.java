package agenda.janelas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class AnotacaoAgenda extends JPanel {
	private JTextField txtTitulo;
	private JTextField txtLembrete;
	private JTextField txtEmail;
	private JTextField txtDescricao;

	/**
	 * Create the panel.
	 */
	public AnotacaoAgenda() {
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(10, 11, 46, 14);
		add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBackground(SystemColor.inactiveCaption);
		txtTitulo.setBounds(67, 8, 347, 20);
		add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblLembrete = new JLabel("Data do lembrete");
		lblLembrete.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLembrete.setBounds(10, 136, 103, 14);
		add(lblLembrete);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 92, 46, 14);
		add(lblEmail);
		
		txtLembrete = new JTextField();
		txtLembrete.setBackground(SystemColor.inactiveCaption);
		txtLembrete.setBounds(123, 133, 113, 20);
		add(txtLembrete);
		txtLembrete.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(SystemColor.inactiveCaption);
		txtEmail.setBounds(67, 89, 347, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblRadioEmail = new JLabel("Enviar por e-mail?");
		lblRadioEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRadioEmail.setBounds(10, 52, 103, 14);
		add(lblRadioEmail);
		
		JRadioButton rdbtnSim = new JRadioButton("sim");
		rdbtnSim.setBackground(SystemColor.activeCaption);
		rdbtnSim.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSim.setBounds(133, 48, 54, 23);
		add(rdbtnSim);
		
		JRadioButton rdbtnNao = new JRadioButton("n\u00E3o");
		rdbtnNao.setBackground(SystemColor.activeCaption);
		rdbtnNao.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNao.setBounds(228, 48, 62, 23);
		add(rdbtnNao);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescricao.setBounds(10, 175, 62, 14);
		add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBackground(SystemColor.inactiveCaption);
		txtDescricao.setBounds(74, 172, 340, 117);
		add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblAlarme = new JLabel("Alarme?");
		lblAlarme.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAlarme.setBounds(10, 322, 62, 14);
		add(lblAlarme);
		
		JCheckBox chckbxAlarme = new JCheckBox("");
		chckbxAlarme.setBackground(SystemColor.activeCaption);
		chckbxAlarme.setBounds(74, 318, 39, 23);
		add(chckbxAlarme);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(SystemColor.activeCaption);
		btnSalvar.setBounds(158, 318, 89, 23);
		add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(SystemColor.activeCaption);
		btnLimpar.setBounds(271, 318, 89, 23);
		add(btnLimpar);

	}
}
