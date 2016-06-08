package Controlador;

import Modelo.adminBBDD;
import Vista.V_Principal;

public class C_Principal {
	adminBBDD bbdda;
	V_Principal vPrincipal;
	
	

	public void setBBDD(adminBBDD bbdd) {
		this.bbdda = bbdd;
	}
	
	public void setVPrincipal(V_Principal vPrincipal){
		this.vPrincipal = vPrincipal;
	}

	public void introducirTabla(int codigoEquipo, String tipo, String marca,
			String modelo, String departamento, String tipoUso,
			String prestable, String estado) {
		// TODO Auto-generated method stub
		
		vPrincipal.IntroducirTablaPrincipal(codigoEquipo, tipo, marca, modelo, departamento, tipoUso, prestable, estado);
		
		
	}

	public void actualizarTablaPrincipal() {
		// TODO Auto-generated method stub
		vPrincipal.actualizarTablaPrincipal();
		
		
	}

	public void actualizarTabla() {
		// TODO Auto-generated method stub
		bbdda.insertarTabla();
		
	}

	

}
