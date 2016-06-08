package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Controlador.C_NuevoEquipo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;

public class V_NuevoEquipo extends JFrame {

	private JPanel contentPane;
	private JTextField textIdEquipo;
	private JTextField textTipo;
	private JTextField textMarca;
	private JTextField textModelo;
	private JTextField textDepartamento;
	private JTextField textTipoUso;
	private JTextField textPrestable;
	private JTextField textEstado;
	private V_Principal vPrincipal;
	public C_NuevoEquipo cNuevoEquipo;
	private JTextField textResolPortatil;
	private JTextField textPulgadasPort;
	private JTextField textCapacDiscoDuro;
	private JTextField textRamVel;
	private JTextField textCapacRam;
	private JTextField textVelGrafica;
	private JTextField textVelProcesador;
	private JTextField textMarcaGrafic;
	private JTextField textMarcaProcesador;
	private JTextField textModelGrafica;
	private JTextField textModelProcec;
	private JComboBox comboBoxTipoDisc;
	private JComboBox comboBoxSSOO;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public V_NuevoEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdequipo = new JLabel("IdEquipo");
		lblIdequipo.setBounds(26, 87, 70, 14);
		contentPane.add(lblIdequipo);
		
		textIdEquipo = new JTextField();
		textIdEquipo.setBounds(94, 84, 86, 20);
		contentPane.add(textIdEquipo);
		textIdEquipo.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(26, 132, 46, 14);
		contentPane.add(lblTipo);
		
		textTipo = new JTextField();
		textTipo.setBounds(94, 129, 86, 20);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(26, 178, 46, 14);
		contentPane.add(lblMarca);
		
		textMarca = new JTextField();
		textMarca.setBounds(94, 175, 86, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(21, 266, 75, 14);
		contentPane.add(lblModelo);
		
		textModelo = new JTextField();
		textModelo.setBounds(94, 263, 86, 20);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setBounds(26, 302, 85, 14);
		contentPane.add(lblDepartamento);
		
		textDepartamento = new JTextField();
		textDepartamento.setBounds(104, 299, 86, 20);
		contentPane.add(textDepartamento);
		textDepartamento.setColumns(10);
		
		JLabel lblTipouso = new JLabel("TipoUso");
		lblTipouso.setBounds(26, 345, 67, 14);
		contentPane.add(lblTipouso);
		
		textTipoUso = new JTextField();
		textTipoUso.setBounds(104, 342, 86, 20);
		contentPane.add(textTipoUso);
		textTipoUso.setColumns(10);
		
		JLabel lblPrestable = new JLabel("Prestable");
		lblPrestable.setBounds(26, 224, 70, 14);
		contentPane.add(lblPrestable);
		
		textPrestable = new JTextField();
		textPrestable.setBounds(94, 221, 86, 20);
		contentPane.add(textPrestable);
		textPrestable.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(26, 387, 46, 14);
		contentPane.add(lblEstado);
		
		textEstado = new JTextField();
		textEstado.setBounds(104, 384, 86, 20);
		contentPane.add(textEstado);
		textEstado.setColumns(10);
		
		JButton btnDarDeAlta = new JButton("Dar de alta nuevo equipo");
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cNuevoEquipo.NuevoEquipo(textIdEquipo.getText(),textTipo.getText(),textMarca.getText(),
						textPrestable.getText(),textModelo.getText(),textDepartamento.getText(),
						textTipoUso.getText(),textEstado.getText());
				setVisible(false);
				vPrincipal.setVisible(true);
				
				
			}
		});
		btnDarDeAlta.setBounds(254, 510, 197, 23);
		contentPane.add(btnDarDeAlta);
		
		JTextPane txtpnComunes = new JTextPane();
		txtpnComunes.setText("COMUNES");
		txtpnComunes.setBounds(26, 38, 167, 20);
		contentPane.add(txtpnComunes);
		
		JLabel lblEspecificas = new JLabel("ESPECIFICAS");
		lblEspecificas.setBounds(432, 44, 133, 14);
		contentPane.add(lblEspecificas);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(283, 72, 365, 384);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Resolucion");
		label.setBounds(24, 27, 70, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Pulgadas");
		label_1.setBounds(24, 58, 61, 14);
		panel.add(label_1);
		
		textResolPortatil = new JTextField();
		textResolPortatil.setColumns(10);
		textResolPortatil.setBounds(95, 24, 86, 20);
		panel.add(textResolPortatil);
		
		textPulgadasPort = new JTextField();
		textPulgadasPort.setColumns(10);
		textPulgadasPort.setBounds(95, 55, 86, 20);
		panel.add(textPulgadasPort);
		
		JLabel label_2 = new JLabel("SS.OO");
		label_2.setBounds(246, 24, 57, 14);
		panel.add(label_2);
		
		comboBoxSSOO = new JComboBox();
		comboBoxSSOO.setActionCommand("comboBoxSSOO");
		comboBoxSSOO.setModel(new DefaultComboBoxModel(new String[] {"Windows ", "Mac"}));
		comboBoxSSOO.setToolTipText("");
		comboBoxSSOO.setBounds(226, 40, 77, 20);
		panel.add(comboBoxSSOO);
		
		JLabel label_3 = new JLabel("DiscoDuro");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(46, 99, 91, 20);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("RAM");
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(246, 100, 57, 19);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Capacidad");
		label_5.setBounds(10, 130, 60, 14);
		panel.add(label_5);
		
		textCapacDiscoDuro = new JTextField();
		textCapacDiscoDuro.setColumns(10);
		textCapacDiscoDuro.setBounds(70, 130, 78, 20);
		panel.add(textCapacDiscoDuro);
		
		JLabel label_6 = new JLabel("Velocidad");
		label_6.setBounds(203, 130, 63, 14);
		panel.add(label_6);
		
		textRamVel = new JTextField();
		textRamVel.setColumns(10);
		textRamVel.setBounds(272, 130, 70, 20);
		panel.add(textRamVel);
		
		JLabel label_7 = new JLabel("Tipo");
		label_7.setBounds(10, 164, 34, 14);
		panel.add(label_7);
		
		comboBoxTipoDisc = new JComboBox();
		comboBoxTipoDisc.setModel(new DefaultComboBoxModel(new String[] {"HDD", "SSD"}));
		comboBoxTipoDisc.setMaximumRowCount(2);
		comboBoxTipoDisc.setBounds(70, 161, 78, 20);
		panel.add(comboBoxTipoDisc);
		
		JLabel label_8 = new JLabel("Capacidad");
		label_8.setBounds(203, 164, 63, 14);
		panel.add(label_8);
		
		textCapacRam = new JTextField();
		textCapacRam.setColumns(10);
		textCapacRam.setBounds(272, 161, 70, 20);
		panel.add(textCapacRam);
		
		JLabel label_9 = new JLabel("Tarjeta Grafica");
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_9.setBounds(30, 216, 118, 20);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Procesador");
		label_10.setForeground(Color.BLUE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(226, 216, 102, 20);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Velocidad");
		label_11.setBounds(10, 259, 60, 14);
		panel.add(label_11);
		
		textVelGrafica = new JTextField();
		textVelGrafica.setColumns(10);
		textVelGrafica.setBounds(70, 256, 78, 20);
		panel.add(textVelGrafica);
		
		JLabel label_12 = new JLabel("Velocidad");
		label_12.setBounds(203, 259, 60, 14);
		panel.add(label_12);
		
		textVelProcesador = new JTextField();
		textVelProcesador.setColumns(10);
		textVelProcesador.setBounds(272, 250, 70, 20);
		panel.add(textVelProcesador);
		
		JLabel label_13 = new JLabel("Marca");
		label_13.setBounds(10, 287, 49, 14);
		panel.add(label_13);
		
		textMarcaGrafic = new JTextField();
		textMarcaGrafic.setColumns(10);
		textMarcaGrafic.setBounds(70, 284, 78, 20);
		panel.add(textMarcaGrafic);
		
		JLabel label_14 = new JLabel("Marca");
		label_14.setBounds(203, 287, 50, 14);
		panel.add(label_14);
		
		textMarcaProcesador = new JTextField();
		textMarcaProcesador.setColumns(10);
		textMarcaProcesador.setBounds(272, 281, 70, 20);
		panel.add(textMarcaProcesador);
		
		JLabel label_15 = new JLabel("Modelo");
		label_15.setBounds(10, 317, 50, 14);
		panel.add(label_15);
		
		textModelGrafica = new JTextField();
		textModelGrafica.setColumns(10);
		textModelGrafica.setBounds(70, 314, 78, 20);
		panel.add(textModelGrafica);
		
		JLabel label_16 = new JLabel("Modelo");
		label_16.setBounds(203, 317, 59, 14);
		panel.add(label_16);
		
		textModelProcec = new JTextField();
		textModelProcec.setColumns(10);
		textModelProcec.setBounds(272, 314, 70, 20);
		panel.add(textModelProcec);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				vPrincipal.setVisible(true);
			}
		});
		btnVolver.setBounds(69, 510, 89, 23);
		contentPane.add(btnVolver);
	}

	public void setcNuevoEquipo(C_NuevoEquipo cNuevoEquipo) {
		this.cNuevoEquipo = cNuevoEquipo;
	}
	public void setvPrincipal(V_Principal vPrincipal) {
		this.vPrincipal = vPrincipal;
	}

	public void insertarPortatil() {
		
		cNuevoEquipo.InsertarNuevoEquipoPortatil(textIdEquipo.getText(),
				textResolPortatil.getText(),textPulgadasPort.getText(),
				(String) comboBoxSSOO.getSelectedItem(),
				textCapacDiscoDuro.getText(),(String) comboBoxTipoDisc.getSelectedItem(),
				textRamVel.getText(),textCapacRam.getText(),
				textVelGrafica.getText(),textMarcaGrafic.getText(),
				textModelGrafica.getText(),textVelProcesador.getText(),
				textMarcaProcesador.getText(),textModelProcec.getText());
	     
		
	}
}
