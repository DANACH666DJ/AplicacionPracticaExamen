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
	

}
