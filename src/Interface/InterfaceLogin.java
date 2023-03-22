package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceLogin window = new InterfaceLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Faça seu Login:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(140, 6, 150, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setBounds(140, 63, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(140, 91, 200, 26);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setBounds(140, 129, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(140, 157, 200, 26);
		frame.getContentPane().add(txtSenha);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Login Invalido", "Login", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(173, 195, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
	public boolean checkLogin(String Login, String Senha) {
		return Login.equals("Adm") 
	}
}
