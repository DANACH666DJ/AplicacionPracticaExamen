package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import Controlador.C_RegistroUsuario;

public class V_RegistroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuarios;
	private JTable table;
	public C_RegistroUsuario cRegistroUsuario;
	private V_Principal vPrincipal;
	private DefaultTableModel dtm;
	private V_Descatalogados vDescatalogados;
	
	
	

	/**
	 * Launch the application.
	 */
	


	/**
	 * Create the frame.
	 */
	public V_RegistroUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		setResizable(false);
		
		JButton btnPrincipal = new JButton("Principal");
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				vPrincipal.setVisible(true);
			}
		});
		
		JButton btnNewButton = new JButton("Descatalogados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				vDescatalogados.setVisible(true);
			}
		});
		
		JButton btnPrestamos = new JButton("Prestamos");
		
		JButton btnLog = new JButton("Log");
		
		txtUsuarios = new JTextField();
		txtUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuarios.setText("Usuarios");
		txtUsuarios.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		
		JButton btnNewButton_2 = new JButton("Alta Nuevo Usuario");
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		dtm=(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Usuario", "Email", "Nombre", "Apellidos", "TipoUsuario"
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
							.addComponent(btnPrincipal, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(btnPrestamos, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnLog, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtUsuarios, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPrincipal)
						.addComponent(btnNewButton)
						.addComponent(btnPrestamos)
						.addComponent(btnLog))
					.addGap(66)
					.addComponent(txtUsuarios, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnModificar)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_1)))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public void setcRegistroUsuario(C_RegistroUsuario cRegistroUsuario) {
		this.cRegistroUsuario = cRegistroUsuario;
	}


	public void setvPrincipal(V_Principal vPrincipal) {
		this.vPrincipal = vPrincipal;
	}
	public void setvDescatalogados(V_Descatalogados vDescatalogados) {
		this.vDescatalogados = vDescatalogados;
	}
	

	public void introducirTablaUsuarios(String usuario, String email,
			String nombre, String apellidos, String tipoUsuario) {
		// TODO Auto-generated method stub
		int numCols = table.getModel().getColumnCount();
		Object[] fila = new Object[numCols];
		fila[0] = usuario;
		fila[1] = email;
		fila[2] = nombre;
		fila[3] = apellidos;
		fila[4] = tipoUsuario;
		((DefaultTableModel) table.getModel()).addRow(fila);
		
	}

}
