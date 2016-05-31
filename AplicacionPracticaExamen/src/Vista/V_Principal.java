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
		btnUsuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnDescat = new JButton("Descatalogados");
		
		btnPrest = new JButton("Prestamos");
		
		btnLog = new JButton("Log");
		
		btnBusq = new JButton("Busqueda");
		
		JPanel panel = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblAdmin = new JLabel("Admin");
		
		JLabel lblNombreusuario = new JLabel("NombreUsuario");
		
		btnLogOut = new JButton("Log Out");
		
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
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(20)
							.addComponent(btnNuevoEquip, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(83)
							.addComponent(btnModifEquip, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(82)
							.addComponent(btnEliminEquip, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(btnNuevoEquip))
						.addComponent(btnModifEquip)
						.addComponent(btnEliminEquip)))
		);
		panel.setLayout(gl_panel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addComponent(btnUsuar, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDescat, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPrest, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLog, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(126)
					.addComponent(btnBusq, GroupLayout.PREFERRED_SIZE, 561, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addComponent(lblAdmin))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNombreusuario))
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLogOut))
					.addGap(17)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUsuar)
						.addComponent(btnDescat)
						.addComponent(btnPrest)
						.addComponent(btnLog))
					.addGap(31)
					.addComponent(btnBusq, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(lblAdmin)
							.addGap(18)
							.addComponent(lblNombreusuario)
							.addGap(11)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnLogOut))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
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
	public void IntroducirTablaPrincipal(int codigoEquipo, String tipo, String marca,
			String modelo, String departamento, String tipoUso,
			String prestable, String estado){
		int numCols = table_1.getModel().getColumnCount();
		Object[] fila = new Object[numCols];
		fila[0] = codigoEquipo;
		fila[1] = tipo;
		fila[2] = marca;
		fila[3] = modelo;
		fila[4] = departamento;
		fila[5] = tipoUso;
		fila[6] = prestable;
		fila[7] = estado;
		((DefaultTableModel) table_1.getModel()).addRow(fila);
		
		
		
		
	}
	

}
