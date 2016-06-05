package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import Controlador.C_Login;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class V_Login extends JFrame {
	
	private V_Principal vPrincipal;
	private JPanel contentPane;
	private JTextField textUser;
	private JButton btnLogIn;
	public C_Login cLogin;
	private JPasswordField textPass;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public V_Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		setResizable(false);	
		
		JLabel lblUser = new JLabel("User");
		
		textUser = new JTextField();
		textUser.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		
		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cLogin.executeLogin(textUser.getText(),new String(textPass.getPassword()) );
			}
		});
		
		textPass = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(182)
							.addComponent(lblPassword))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(194)
							.addComponent(lblUser))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(174)
							.addComponent(btnLogIn))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(145)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textPass, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(textUser, 118, 118, 118))))
					.addContainerGap(160, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addComponent(lblUser)
					.addGap(18)
					.addComponent(textUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(lblPassword)
					.addGap(18)
					.addComponent(textPass, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addComponent(btnLogIn)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
	}
		
		public void setPrincipal (V_Principal VPrincipal){
			this.vPrincipal = VPrincipal;
		}
		public void setCLogin(C_Login cLogin){
			this.cLogin = cLogin;
		}
		
		public void loginSuccess(){
			setVisible(false);
			vPrincipal.setVisible(true);
			limpiarCampos();
            
		}
		public void limpiarCampos(){
			textPass.setText("");
			textUser.setText("");
		}
	}

