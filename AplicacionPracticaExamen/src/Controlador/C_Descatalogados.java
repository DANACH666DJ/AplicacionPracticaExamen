package Controlador;

import Modelo.adminBBDD;
import Vista.V_Descatalogados;

public class C_Descatalogados {
    V_Descatalogados vDescatalogados;
    adminBBDD bbdda;
	
	public void setvDescatalogados(V_Descatalogados vDescatalogados) {
		this.vDescatalogados = vDescatalogados;
	}
	
	public void setBbdda(adminBBDD bbdda) {
		this.bbdda = bbdda;
	}
	public void introducirTablaDescatalogados(int codigoEquipo,String tipo,String marca,String modelo
			,String fechaBaja,String horaBaja){
		
		vDescatalogados.introducirTablaDescatalogados(codigoEquipo,tipo,marca,modelo,fechaBaja,horaBaja);
		
	}

	public void actualizarTabla() {
		vDescatalogados.actualizarTabla();
		
		
		
	}

	public void actualizarTablaDescatalogados() {
		// TODO Auto-generated method stub
		bbdda.insertarTablaDescatalogados();
		
	}
	

}
