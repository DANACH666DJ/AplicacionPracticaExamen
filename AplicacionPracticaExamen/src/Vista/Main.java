package Vista;

import Controlador.C_Descatalogados;
import Controlador.C_Login;
import Controlador.C_Principal;
import Modelo.adminBBDD;

public class Main {

	
		// TODO Auto-generated method stub
		
		// VISTAS INICIO
		V_Login vLogin;
		V_Principal vPrincipal;
		V_Descatalogados vDescatalogados;
		
		// CONTROLADORES INICIO
	    C_Login cLogin;
		C_Principal cPrincipal;
		C_Descatalogados cDescatalogados;
		
		// MODELO INICIO
		adminBBDD bbdda;
		
		
		public Main(){
			// CREACION PANTALLAS
			vLogin = new V_Login();
			cLogin = new C_Login();
			bbdda = new adminBBDD();
			vPrincipal = new V_Principal();
			cPrincipal = new C_Principal();
			vDescatalogados=new V_Descatalogados();
			cDescatalogados=new C_Descatalogados();
			
			
			
			// RELACIONES ENTRE PAGINAS QUE ESTEN COMUNICADAS
			
			vLogin.setPrincipal(vPrincipal);
			vLogin.setCLogin(cLogin);
			cLogin.setVLogin(vLogin);
			cLogin.setBBDD(bbdda);
			bbdda.setCLogin(cLogin);
			
			bbdda.setCPrincipal(cPrincipal);
			cPrincipal.setBBDD(bbdda);
			cPrincipal.setVPrincipal(vPrincipal);
			vPrincipal.setCPrincipal(cPrincipal);
			vPrincipal.setLogin(vLogin);
			vPrincipal.setDescatalogados(vDescatalogados);
			
			vDescatalogados.setPrincipal(vPrincipal);
			vDescatalogados.setCDescatalogados(cDescatalogados);
			cDescatalogados.setvDescatalogados(vDescatalogados);
			cDescatalogados.setBbdda(bbdda);
			bbdda.setCDescatalogados(cDescatalogados);
			
			
			vLogin.setVisible(true);
			
			
			//Introducción de tablas
			bbdda.insertarTabla();
			bbdda.insertarTablaDescatalogados();
			
			
			
		}

	



  public static void main(String[] args) {
	  new Main();
	
      }


}




