package Controlador;

import Modelo.adminBBDD;
import Vista.V_NuevoEquipo;


public class C_NuevoEquipo {
	V_NuevoEquipo vNuevoEquipo;
	adminBBDD bbdda;
	
	public void setvNuevoEquipo(V_NuevoEquipo vNuevoEquipo) {
		this.vNuevoEquipo = vNuevoEquipo;
	}
	
	public void setBbdda(adminBBDD bbdda) {
		this.bbdda = bbdda;
	}

	public void NuevoEquipo(String idEquipo , String tipo, String marca,
			String prestable, String modelo, String departamento, String tipoUso, String estado) {
		// TODO Auto-generated method stub
		bbdda.insertarNuevoEquipo(idEquipo,tipo,marca,prestable,modelo,departamento,tipoUso,estado);
		
	}

	public void insertarPortatil() {
		// TODO Auto-generated method stub
		vNuevoEquipo.insertarPortatil();
	}

	public void InsertarNuevoEquipoPortatil(String codigoEquipo, String resolPort,
			String pulgPort, String SSOO, String capacDisc,
			String tipoDisc, String ramVel, String capacRam, String velGraf,
			String marcGraf, String modelGraf, String velProces, String marcProces,
			String modelProces) {
		// TODO Auto-generated method stub
		bbdda.insertarNuevoEquipoPortatil(codigoEquipo,resolPort,pulgPort,SSOO,capacDisc,
				tipoDisc,ramVel,capacRam,velGraf,marcGraf,modelGraf,velProces,marcProces,modelProces);
		
	}
	
	

}
