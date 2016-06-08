package Vista;

import Controlador.C_Descatalogados;
import Controlador.C_Login;
import Controlador.C_NuevoEquipo;
import Controlador.C_Principal;
import Controlador.C_RegistroUsuario;
import Modelo.adminBBDD;

public class Main {

	
		// TODO Auto-generated method stub
		
		// VISTAS INICIO
		V_Login vLogin;
		V_Principal vPrincipal;
		V_Descatalogados vDescatalogados;
		V_RegistroUsuario vRegistroUsuario;
		V_NuevoEquipo vNuevoEquipo;
		
		// CONTROLADORES INICIO
	    C_Login cLogin;
		C_Principal cPrincipal;
		C_Descatalogados cDescatalogados;
		C_RegistroUsuario cRegistroUsuario;
		C_NuevoEquipo cNuevoEquipo;
		
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
			vRegistroUsuario=new V_RegistroUsuario();
			cRegistroUsuario=new C_RegistroUsuario();
			vNuevoEquipo=new V_NuevoEquipo();
			cNuevoEquipo=new C_NuevoEquipo();
			
			
			
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
			vPrincipal.setvRegistroUsuario(vRegistroUsuario);
			vPrincipal.setvNuevoEquipo(vNuevoEquipo);
			
			vDescatalogados.setPrincipal(vPrincipal);
			vDescatalogados.setCDescatalogados(cDescatalogados);
			vDescatalogados.setvRegistroUsuario(vRegistroUsuario);
			cDescatalogados.setvDescatalogados(vDescatalogados);
			cDescatalogados.setBbdda(bbdda);
			bbdda.setCDescatalogados(cDescatalogados);
			
			
			vRegistroUsuario.setvPrincipal(vPrincipal);
			vRegistroUsuario.setcRegistroUsuario(cRegistroUsuario);
			vRegistroUsuario.setvDescatalogados(vDescatalogados);
			cRegistroUsuario.setvRegistroUsuario(vRegistroUsuario);
			cRegistroUsuario.setBbdda(bbdda);
			bbdda.setCRegistroUsuario(cRegistroUsuario);
			
			vNuevoEquipo.setvPrincipal(vPrincipal);
			vNuevoEquipo.setcNuevoEquipo(cNuevoEquipo);
			cNuevoEquipo.setBbdda(bbdda);
			cNuevoEquipo.setvNuevoEquipo(vNuevoEquipo);
			bbdda.setcNuevoEquipo(cNuevoEquipo);
			
			
			vLogin.setVisible(true);
			
			
			//Introducción de tablas
			bbdda.insertarTabla();
			bbdda.insertarTablaDescatalogados();
			bbdda.insertarTablaUsuarios();
			
			
			
		}

	



  public static void main(String[] args) {
	  new Main();
	
      }


}




