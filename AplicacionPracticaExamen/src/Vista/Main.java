package Vista;

import Controlador.C_Login;
import Controlador.C_Principal;
import Modelo.adminBBDD;

public class Main {

	
		// TODO Auto-generated method stub
		
		// VISTAS INICIO
		V_Login vLogin;
		V_Principal vPrincipal;
		
		// CONTROLADORES INICIO
		C_Login cLogin;
		C_Principal cPrincipal;
		
		// MODELO INICIO
		adminBBDD bbdda;
		
		
		public Main(){
			// CREACION PANTALLAS
			vLogin = new V_Login();
			cLogin = new C_Login();
			bbdda = new adminBBDD();
			vPrincipal = new V_Principal();
			cPrincipal = new C_Principal();
			
			
			
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
			
			
			vLogin.setVisible(true);
			
			
		}

	



  public static void main(String[] args) {
	  new Main();
	
      }


}




