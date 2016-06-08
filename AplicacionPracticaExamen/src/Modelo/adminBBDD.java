package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Controlador.C_Login;
import Controlador.C_NuevoEquipo;
import Controlador.C_Principal;
import Controlador.C_Descatalogados;
import Controlador.C_RegistroUsuario;

public class adminBBDD {
	private Connection conexion;
	private String bd, login, pwd, url;
	private int intentos;
	
	
	public C_Login cLogin;
	public C_Principal cPrincipal;
	public C_Descatalogados cDescatalogados;
	public C_RegistroUsuario cRegistroUsuario;
	public C_NuevoEquipo cNuevoEquipo;
	
	
	public adminBBDD(){
		intentos=3;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			bd = "mydb";
			login = "root";
			url = "jdbc:mysql://LocalHost/" + bd;
			pwd = "root";
			try {
				conexion = DriverManager.getConnection(url, login, pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Conexion establecida");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("No tengo el driver cargado");
		}
	}
	
	public void loguearse(String user, String password) {
		try {
			if (conexion != null) {

				String query = "Select * from usuario where Usuario=? and Password=?";
				PreparedStatement pstmt = conexion.prepareStatement(query);
				pstmt.setString(1, user);
				pstmt.setString(2, password);
				ResultSet rset = pstmt.executeQuery();

				if (rset.next() == true) {
					cLogin.loginSuccess();
					intentos = 3;
				} else {
					intentos--;
					System.out.println("Usuario o contraseña incorrecta");
					if (intentos == 0) {
						salir();
					}
					JOptionPane.showMessageDialog(null,
							"Usuario o contraseña incorrecta.\nQuedan "
									+ intentos + " intentos.", "Advertencia",
							JOptionPane.WARNING_MESSAGE);
				}

				pstmt.close();
				rset.close();
			} else {
				System.out.println("conexion nula");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	// TABLA PRINCIPAL
		public void insertarTabla() {
			try {
				Statement stmt;
				if (conexion != null) {
					stmt = conexion.createStatement();
					ResultSet rset = stmt
							.executeQuery("Select codigoEquipo, tipo, marca, modelo, departamento, tipoUso, prestable, estado  from equipos where estado <> 'Descatalogado'; ");
					while (rset.next()) {
						int codigoEquipo = rset.getInt("codigoEquipo");
						String tipo = rset.getString("tipo");
						String marca = rset.getString("marca");
						String modelo = rset.getString("modelo");
						String departamento = rset.getString("departamento");
						String tipoUso = rset.getString("tipoUso");
						String prestable = rset.getString("prestable");
						String estado = rset.getString("estado");
						

						cPrincipal.introducirTabla(codigoEquipo, tipo, marca,
								modelo, departamento, tipoUso, prestable, estado);
					}
					stmt.close();
					rset.close();
				} else {
					System.out.println("conexion Nula");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		//Tabla Usuarios
		public void insertarTablaUsuarios() {
			try {
				Statement stmt;
				if (conexion != null) {
					stmt = conexion.createStatement();
					ResultSet rset = stmt
							.executeQuery("Select * From usuario ; ");
					while (rset.next()) {
						String usuario = rset.getString("Usuario");
						String email = rset.getString("email");
						String nombre = rset.getString("Nombre");
						String apellidos = rset.getString("Apellidos");
						String tipoUsuario = rset.getString("TipoUsuario");
						
						

						cRegistroUsuario.introducirTablaUsuarios(usuario, email, nombre,
								apellidos, tipoUsuario);
					}
					stmt.close();
					rset.close();
				} else {
					System.out.println("conexion Nula");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			
		
		
		
		//Tabla Descatalogados
		public void insertarTablaDescatalogados(){
			try{
				Statement stmt;
				if(conexion!=null){
					stmt=conexion.createStatement();
					ResultSet rset =stmt.executeQuery("SELECT E.codigoEquipo,E.tipo,E.marca,E.modelo,B.fechaBaja,B.horaBaja FROM bajaequipos B,equipos E WHERE B.codigoEquipo=E.codigoEquipo;");
					while(rset.next()){
						int codigoEquipo=rset.getInt("codigoEquipo");
						String tipo=rset.getString("tipo");
						String marca=rset.getString("marca");
						String modelo=rset.getString("modelo");
						String fechaBaja=rset.getString("fechaBaja");
						String horaBaja=rset.getString("horaBaja");
		
						cDescatalogados.introducirTablaDescatalogados(codigoEquipo, tipo, marca, modelo, fechaBaja, horaBaja);
					}
					stmt.close();
					rset.close();
				}else{
					System.out.println("Conexión nula");
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
			
		}
		public void insertarNuevoEquipo(String idEquipo, String tipo, String marca,
				String prestable, String modelo, String departamento,
				String tipoUso, String estado) {
			
			try {
				if (conexion != null) {
					String query = "INSERT INTO `mydb`.`equipos` (`codigoEquipo`, `tipo`, `marca`, `prestable`, `modelo`, `departamento`, `tipoUso`, `estado`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
					PreparedStatement pstmt = conexion.prepareStatement(query);
					pstmt.setString(1, idEquipo);
					pstmt.setString(2, tipo);
					pstmt.setString(3, marca);
					pstmt.setString(4, modelo);
					pstmt.setString(5, departamento);
					pstmt.setString(6, tipoUso);
					pstmt.setString(7, prestable);
					pstmt.setString(8, estado);
					pstmt.executeUpdate();
					if (tipo.equals("Portatil")) {
						cNuevoEquipo.insertarPortatil();
						JOptionPane.showMessageDialog(null,
								"Nuevo Portátil Introducido");
					} 
					pstmt.close();
					

					System.out.println("Insercion Comunes Correcta");
				} else {
					System.out.println("conexion nula");
				}

				cPrincipal.actualizarTablaPrincipal();
				

			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
	
	public void salir() {
		System.exit(0);
	}

	
	
	public void setCLogin(C_Login cLogin) {
		this.cLogin = cLogin;
	}

	public void setCPrincipal(C_Principal cPrincipal) {
		this.cPrincipal = cPrincipal;
	}
	public void setCDescatalogados(C_Descatalogados cDescatalogados){
		this.cDescatalogados = cDescatalogados;
	}
	public void setCRegistroUsuario(C_RegistroUsuario cRegistroUsuario){
		this.cRegistroUsuario = cRegistroUsuario;
	}

	public void setcNuevoEquipo(C_NuevoEquipo cNuevoEquipo) {
		this.cNuevoEquipo = cNuevoEquipo;
	}

	public void insertarNuevoEquipoPortatil(String codigoEquipo,
			String resolPort, String pulgPort, String SSOO, String capacDisc,
			String tipoDisc, String ramVel, String capacRam, String velGraf,
			String marcGraf, String modelGraf, String velProces,
			String marcProces, String modelProces) {
		
		try {
			if (conexion != null) {
				String query = "INSERT INTO `mydb`.`portatil` (`codigoEquipo`, `resolucion`, `pulgadas`, `ssoo`, `discoDuroCapacidad`, `discoDuroTipo`, `ramVelocidad`, `ramCapacidad`, `graficaVelocidad`, `graficaMarca`, `graficaModelo`, `procesadorVelocidad`, `procesadorMarca`, `procesadorModelo`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				;
				PreparedStatement pstmt = conexion.prepareStatement(query);
				pstmt.setString(1, codigoEquipo);
				pstmt.setString(2, resolPort);
				pstmt.setString(3, pulgPort);
				pstmt.setString(4, SSOO);
				pstmt.setString(5, capacDisc);
				pstmt.setString(6, tipoDisc);
				pstmt.setString(7, ramVel);
				pstmt.setString(8, capacRam);
				pstmt.setString(9, velGraf);
				pstmt.setString(10, marcGraf);
				pstmt.setString(11, modelGraf);
				pstmt.setString(12, velProces);
				pstmt.setString(13, marcProces);
				pstmt.setString(14, modelProces);
				pstmt.executeUpdate();

				pstmt.close();
				System.out.println("Insercion Especificas Correcta");
			} else {
				System.out.println("conexion nula");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	
		
		
	}
	


