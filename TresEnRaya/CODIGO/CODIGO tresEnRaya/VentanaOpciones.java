package tresEnRaya;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOpciones {

	JFrame frame;
	public static Color Blanco = new Color(255, 255, 255);
	public static Color Negro = new Color(0, 0, 0);
	private JPanel panel;
	private JPanel PANELOPCIONES;
	private JLabel LOGO;
	private JLabel NOMBREOPCIONES;
	private JSeparator separador;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel NOMBREBYMENGO;
	private JButton JUGAR;
	private JButton OPCIONES;
	private JButton SALIR;
	private JLabel NOMBREDELJUEGOOPCIONES;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOpciones window = new VentanaOpciones();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaOpciones() {
		initialize();
		if (ventanaPrincipal.colorBackground == true) {
			PANELOPCIONES.setBackground(Blanco);
			} else if (ventanaPrincipal.colorBackground == false) {
				PANELOPCIONES.setBackground(Negro);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaOpciones.class.getResource("/tresEnRaya/tres-en-raya.png")));
		frame.setResizable(false);
		
		frame.setBounds(100, 100, 689, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		PANELOPCIONES = new JPanel();
		
		PANELOPCIONES.setBackground(new Color(0, 0, 0));
		PANELOPCIONES.setBounds(10, 10, 655, 594);
		panel.add(PANELOPCIONES);
		PANELOPCIONES.setLayout(null);
		
		LOGO = new JLabel("");
		LOGO.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/tresEnRaya/configuraciones (3) (1).png")));
		LOGO.setBounds(54, 34, 164, 164);
		PANELOPCIONES.add(LOGO);
		
		NOMBREOPCIONES = new JLabel("");
		NOMBREOPCIONES.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/tresEnRaya/Opciones (1).png")));
		NOMBREOPCIONES.setBounds(200, 45, 412, 75);
		PANELOPCIONES.add(NOMBREOPCIONES);
		
		panel_2 = new JPanel();
		panel_2.setBounds(200, 250, 243, 62);
		PANELOPCIONES.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JUGAR = new JButton("");
		JUGAR.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/tresEnRaya/MODO CLARO.png")));
		JUGAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.colorBackground = true;
				PANELOPCIONES.setBackground(Blanco);
				
			}
		});
		JUGAR.setBackground(new Color(240, 240, 240));
		JUGAR.setFocusable(false);
		panel_2.add(JUGAR, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setBounds(200, 359, 243, 62);
		PANELOPCIONES.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		OPCIONES = new JButton("");
		OPCIONES.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/tresEnRaya/MODO OSCURO.png")));
		OPCIONES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.colorBackground = false;
				PANELOPCIONES.setBackground(Negro);
			}
		});
		OPCIONES.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		OPCIONES.setFocusable(false);
		panel_3.add(OPCIONES, BorderLayout.CENTER);
		
		panel_4 = new JPanel();
		panel_4.setBounds(200, 474, 243, 62);
		PANELOPCIONES.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		SALIR = new JButton("");
		SALIR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ventanaPrincipal window = new ventanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				VentanaOpciones.this.frame.setVisible(false);
			}
		});
		SALIR.setFocusable(false);
		SALIR.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/tresEnRaya/SALIR.png")));
		panel_4.add(SALIR, BorderLayout.CENTER);
		
		NOMBREBYMENGO = new JLabel("New label");
		NOMBREBYMENGO.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/tresEnRaya/By Mengo (1).png")));
		NOMBREBYMENGO.setBounds(539, 542, 116, 42);
		PANELOPCIONES.add(NOMBREBYMENGO);
		
		NOMBREDELJUEGOOPCIONES = new JLabel("");
		NOMBREDELJUEGOOPCIONES.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/tresEnRaya/Del Juego.png")));
		NOMBREDELJUEGOOPCIONES.setBounds(364, 108, 226, 62);
		PANELOPCIONES.add(NOMBREDELJUEGOOPCIONES);
		
		separador = new JSeparator();
		separador.setBounds(358, 475, 665, 10);
		panel.add(separador);
	}
}
