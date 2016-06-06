package Controlador;

import Modelo.adminBBDD;
import Vista.V_RegistroUsuario;


public class C_RegistroUsuario {
	adminBBDD bbdda;
	V_RegistroUsuario vRegistroUsuario;
	
	public void setBbdda(adminBBDD bbdda) {
		this.bbdda = bbdda;
	}
	
	public void setvRegistroUsuario(V_RegistroUsuario vRegistroUsuario) {
		this.vRegistroUsuario = vRegistroUsuario;
	}

	public void introducirTablaUsuarios(String usuario, String email,
			String nombre, String apellidos, String tipoUsuario) {
		// TODO Auto-generated method stub
		vRegistroUsuario.introducirTablaUsuarios(usuario,email,nombre,apellidos,tipoUsuario);
		
		
	}
	
	
	
	

}
