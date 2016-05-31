package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Controlador.C_Login;
import Controlador.C_Principal;

public class adminBBDD {
	private Connection conexion;
	private String bd, login, pwd, url;
	private int intentos;
	
	
	public C_Login cLogin;
	public C_Principal cPrincipal;
	
	
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
							.executeQuery("Select codigoEquipo, tipo, marca, modelo, departamento, tipoUso, prestable, estado ,ubicacion,comentarios from equipos where estado <> 'Descatalogado'; ");
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
	
	public void salir() {
		System.exit(0);
	}

	
	
	public void setCLogin(C_Login cLogin) {
		this.cLogin = cLogin;
	}

	public void setCPrincipal(C_Principal cPrincipal) {
		this.cPrincipal = cPrincipal;
	}
	

		
		
		
	}
	


