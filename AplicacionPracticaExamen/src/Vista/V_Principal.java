package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import Controlador.C_Principal;
import Modelo.adminBBDD;

public class V_Principal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JButton btnLogOut;
	private JButton btnNuevoEquip;
	private JButton btnModifEquip;
	private JButton btnEliminEquip;
	private JButton btnBusq;
	private JButton btnUsuar;
	private JButton btnDescat;
	private JButton btnPrest;
	private JButton btnLog;
	private V_Login login;
	
	public C_Principal cPrincipal;
	public adminBBDD bbdda;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public V_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnUsuar = new JButton("Usuarios");
		btnUsuar.setBounds(22, 24, 148, 23);
		btnUsuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnDescat = new JButton("Descatalogados");
		btnDescat.setBounds(188, 24, 146, 23);
		
		btnPrest = new JButton("Prestamos");
		btnPrest.setBounds(352, 24, 159, 23);
		
		btnLog = new JButton("Log");
		btnLog.setBounds(529, 24, 146, 23);
		
		btnBusq = new JButton("Busqueda");
		btnBusq.setBounds(131, 78, 561, 31);
		
		JPanel panel = new JPanel();
		panel.setBounds(135, 127, 557, 370);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setBounds(39, 150, 29, 14);
		
		JLabel lblNombreusuario = new JLabel("NombreUsuario");
		lblNombreusuario.setBounds(22, 182, 73, 14);
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(15, 459, 71, 23);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"IdEquipo", "Tipo", "Marca", "Modelo", "Departamento", "TipoUso", "Prestable", "Estado"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNuevoEquip = new JButton("Nuevo Equipo");
		
		btnModifEquip = new JButton("Modificar Equipo");
		
		btnEliminEquip = new JButton("Eliminar Equipo");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(btnNuevoEquip, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(83)
					.addComponent(btnModifEquip, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(btnEliminEquip, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(btnNuevoEquip))
						.addComponent(btnModifEquip)
						.addComponent(btnEliminEquip)))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(null);
		contentPane.add(btnBusq);
		contentPane.add(lblNombreusuario);
		contentPane.add(lblAdmin);
		contentPane.add(panel);
		contentPane.add(btnUsuar);
		contentPane.add(btnDescat);
		contentPane.add(btnPrest);
		contentPane.add(btnLog);
		contentPane.add(btnLogOut);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 207, 103, 234);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Piso"},
				{"Despacho"},
				{null},
			},
			new String[] {
				"Edificio"
			}
		));
		scrollPane_1.setViewportView(table_1);
	}
	public void setCPrincipal(C_Principal cPrincipal) {
		this.cPrincipal = cPrincipal;
	}
	public void setBBDD(adminBBDD bbdda) {
		this.bbdda = bbdda;
	}
	public void setLogin(V_Login login) {
		this.login = login;
	}
	

}
