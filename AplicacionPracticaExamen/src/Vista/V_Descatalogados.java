package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.C_Descatalogados;
import Controlador.C_Login;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class V_Descatalogados extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private V_Principal vPrincipal;
	private DefaultTableModel dtm;
	private V_RegistroUsuario vRegistroUsuario;
	
	
	
	public C_Descatalogados cDescatalogados;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public V_Descatalogados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		setResizable(false);
		
		JButton btnPrincipal = new JButton("Principal");
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				vPrincipal.setVisible(true);
			}
		});
		
		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				vRegistroUsuario.setVisible(true);
			}
		});
		
		JButton btnPrestamos = new JButton("Prestamos");
		
		JButton btnLog = new JButton("Log");
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		dtm=(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"IdEquipo", "Tipo", "Marca", "Modelo", "Fecha de baja", "Hora de baja"
			}
		));
		table.setModel(dtm);
		scrollPane.setViewportView(table);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnPrincipal, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnUsuarios, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnPrestamos, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnLog, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 597, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPrincipal)
						.addComponent(btnUsuarios)
						.addComponent(btnPrestamos)
						.addComponent(btnLog))
					.addGap(48)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void setCDescatalogados(C_Descatalogados cDescatalogados){
		this.cDescatalogados = cDescatalogados;
	}
	public void setPrincipal (V_Principal VPrincipal){
		this.vPrincipal = VPrincipal;
	}
	public void setvRegistroUsuario(V_RegistroUsuario vRegistroUsuario) {
		this.vRegistroUsuario = vRegistroUsuario;
	}
	
	public void introducirTablaDescatalogados(int codigoEquipo, String tipo,
			String marca, String modelo, String fechaBaja, String horaBaja) {
		// TODO Auto-generated method stub
		int numCols = table.getModel().getColumnCount();
		Object[] fila = new Object[numCols];
		fila[0] = codigoEquipo;
		fila[1] = tipo;
		fila[2] = marca;
		fila[3] = modelo;
		fila[4] = fechaBaja;
		fila[5] = horaBaja;
		((DefaultTableModel) table.getModel()).addRow(fila);
		
	}
	public void actualizarTabla() {
		// TODO Auto-generated method stub
		dtm = new DefaultTableModel(new Object[][] {}, new String[] {
				"IdEquipo", "Equipo", "Marca", "Modelo", "Fecha de Baja",
				"Hora de Baja" });
		table.setModel(dtm);
		cDescatalogados.actualizarTablaDescatalogados();
		
	}
	
	
	
}
