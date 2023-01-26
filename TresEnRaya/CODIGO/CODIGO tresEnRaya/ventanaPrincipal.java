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

public class ventanaPrincipal {

	public static boolean colorBackground = false; //si está en true, el color es blanco.
	JFrame frame;
	private JPanel panel;
	private JPanel PANELPRINCIPIO;
	private JLabel LOGO;
	private JLabel NOMBRETRESENRAYA;
	private JLabel NOMBRETHEGAME;
	private JSeparator separador;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel NOMBREBYMENGO;
	private JButton JUGAR;
	private JButton OPCIONES;
	private JButton SALIR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal window = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		initialize();
		if (ventanaPrincipal.colorBackground == true) {
			PANELPRINCIPIO.setBackground(VentanaOpciones.Blanco);
			} else if (ventanaPrincipal.colorBackground == false) {
				PANELPRINCIPIO.setBackground(VentanaOpciones.Negro);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaPrincipal.class.getResource("/tresEnRaya/tres-en-raya.png")));
		frame.setResizable(false);
		
		frame.setBounds(100, 100, 689, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		PANELPRINCIPIO = new JPanel();
		PANELPRINCIPIO.setBackground(new Color(0, 0, 0));
		PANELPRINCIPIO.setBounds(10, 10, 655, 594);
		panel.add(PANELPRINCIPIO);
		PANELPRINCIPIO.setLayout(null);
		
		LOGO = new JLabel("");
		LOGO.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/tresEnRaya/tic-tac-toe (3).png")));
		LOGO.setBounds(54, 43, 164, 144);
		PANELPRINCIPIO.add(LOGO);
		
		NOMBRETRESENRAYA = new JLabel("");
		NOMBRETRESENRAYA.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/tresEnRaya/TresEnRaya (3).png")));
		NOMBRETRESENRAYA.setBounds(164, 43, 412, 75);
		PANELPRINCIPIO.add(NOMBRETRESENRAYA);
		
		NOMBRETHEGAME = new JLabel("");
		NOMBRETHEGAME.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/tresEnRaya/The Game (1).png")));
		NOMBRETHEGAME.setBounds(344, 86, 288, 94);
		PANELPRINCIPIO.add(NOMBRETHEGAME);
		
		panel_2 = new JPanel();
		panel_2.setBounds(200, 250, 243, 62);
		PANELPRINCIPIO.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JUGAR = new JButton("");
		JUGAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					VentanaJugar dialog = new VentanaJugar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				ventanaPrincipal.this.frame.setVisible(false);
			}
		});
		JUGAR.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/tresEnRaya/JUGAR (1).png")));
		JUGAR.setBackground(new Color(240, 240, 240));
		JUGAR.setFocusable(false);
		panel_2.add(JUGAR, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setBounds(200, 359, 243, 62);
		PANELPRINCIPIO.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		OPCIONES = new JButton("");
		OPCIONES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					VentanaOpciones window = new VentanaOpciones();
					window.frame.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				ventanaPrincipal.this.frame.setVisible(false);
			}
		});
		OPCIONES.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		OPCIONES.setFocusable(false);
		OPCIONES.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/tresEnRaya/OPCIONES.png")));
		panel_3.add(OPCIONES, BorderLayout.CENTER);
		
		panel_4 = new JPanel();
		panel_4.setBounds(200, 474, 243, 62);
		PANELPRINCIPIO.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		SALIR = new JButton("");
		SALIR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		SALIR.setFocusable(false);
		SALIR.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/tresEnRaya/SALIR.png")));
		panel_4.add(SALIR, BorderLayout.CENTER);
		
		NOMBREBYMENGO = new JLabel("New label");
		NOMBREBYMENGO.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/tresEnRaya/By Mengo (1).png")));
		NOMBREBYMENGO.setBounds(539, 542, 116, 42);
		PANELPRINCIPIO.add(NOMBREBYMENGO);
		
		separador = new JSeparator();
		separador.setBounds(358, 475, 665, 10);
		panel.add(separador);
	}
}
