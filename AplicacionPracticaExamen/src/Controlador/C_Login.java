package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.adminBBDD;
import Vista.V_Login;

public class C_Login implements ActionListener {
	V_Login vlogin;
	adminBBDD bbdda;
	
	public void setVLogin(V_Login l) {
		this.vlogin = l;
	}

	public void setBBDD(adminBBDD bbdd) {
		this.bbdda = bbdd;
	}
	
	
	public void executeLogin(String user, String pass) {
		bbdda.loguearse(user, pass);

	}

	public void loginSuccess() {
		vlogin.loginSuccess();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	
	
	
	
	

}
