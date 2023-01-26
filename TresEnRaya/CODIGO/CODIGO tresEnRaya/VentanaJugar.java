package tresEnRaya;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaJugar extends JDialog {
	String jugadorQueLeTocaSimbolo;
	static String turnoDelJugadorVariable = "TURNO JUG O";
	static int jugadorQueLeToca = 2;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JSpinner spinner;
	private JButton btnSalir;
	private JSpinner spinner_1;
	private JLabel lblNewLabel_2;
	private static JLabel PUNTOSLABEL;
	private static JLabel Posicion2;
	private JLabel Posicion3_click;
	private JLabel Posicion2_click;
	private JLabel Posicion1_click;
	private static JLabel Posicion1;
	private static JLabel Posicion3;
	private JLabel Posicion4_click;
	private static JLabel Posicion4;
	private JLabel Posicion5_click;
	private static JLabel Posicion5;
	private JLabel Posicion6_click;
	private static JLabel Posicion6;
	private JLabel Posicion7_click;
	private static JLabel Posicion7;
	private JLabel Posicion8_click;
	private static JLabel Posicion8;
	private JLabel Posicion9_click_1;
	private static JLabel Posicion9;
	private JLabel fondoTresEnRaya = new JLabel("");
	private JPanel PANELFONDO = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaJugar dialog = new VentanaJugar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void jugador (int jugadorQueLeToca, String jugadorQueLeTocaSimbolo, JLabel Posicion1) {
	if (jugadorQueLeToca %2 == 0) {
		turnoDelJugadorVariable = "TURNO JUG O";
		jugadorQueLeTocaSimbolo = "O";
	Posicion1.setText(jugadorQueLeTocaSimbolo);
	} else {
		turnoDelJugadorVariable = "TURNO JUG X";
		jugadorQueLeTocaSimbolo = "X";
		Posicion1.setText(jugadorQueLeTocaSimbolo);
	}
}
	public static void REINICIAR () {
		PUNTOSLABEL.setText("<-- PUNTOS -->");
		turnoDelJugadorVariable = "TURNO JUG O";
		jugadorQueLeToca = 2;
		Posicion1.setText("");
		Posicion2.setText("");
		Posicion3.setText("");
		Posicion4.setText("");
		Posicion5.setText("");
		Posicion6.setText("");
		Posicion7.setText("");
		Posicion8.setText("");
		Posicion9.setText("");
	}
	/**
	 * Create the dialog.
	 */
	public VentanaJugar() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				if (ventanaPrincipal.colorBackground == true) {
					PANELFONDO.setBackground(VentanaOpciones.Blanco);
				fondoTresEnRaya.setIcon(new ImageIcon(VentanaJugar.class.getResource("/tresEnRaya/fondo3enrayaNEGRO.png")));
				} else if (ventanaPrincipal.colorBackground == false) {
					PANELFONDO.setBackground(VentanaOpciones.Negro);
				fondoTresEnRaya.setIcon(new ImageIcon(VentanaJugar.class.getResource("/tresEnRaya/fondo3enraya (2).png")));
			}
			}
		});
		setResizable(false);
		setBounds(100, 100, 689, 653);
		getContentPane().setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 689, 653);
			panel.setBackground(new Color(255, 0, 0));
			getContentPane().add(panel);
			PANELFONDO.setBounds(10, 45, 655, 559);
			PANELFONDO.setBackground(new Color(0, 0, 0));
			PANELFONDO.setLayout(null);
			
			Posicion2_click = new JLabel("");
			Posicion2_click.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion2);
				}
			});
			
			Posicion1_click = new JLabel("");
			Posicion1_click.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion1);
				}
			});
			Posicion1_click.setBounds(0, 0, 202, 172);
			PANELFONDO.add(Posicion1_click);
			
			Posicion1 = new JLabel("");
			Posicion1.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion1.setEnabled(false);
			Posicion1.setBounds(85, 66, 29, 41);
			PANELFONDO.add(Posicion1);
			Posicion2_click.setBounds(223, 0, 202, 172);
			PANELFONDO.add(Posicion2_click);
			
			Posicion2 = new JLabel("");
			Posicion2.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion2.setEnabled(false);
			Posicion2.setBounds(309, 66, 29, 41);
			PANELFONDO.add(Posicion2);
			panel.setLayout(null);
			panel.add(PANELFONDO);
			
			Posicion3_click = new JLabel("");
			Posicion3_click.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion3);
				}
			});
			Posicion3_click.setEnabled(false);
			Posicion3_click.setBounds(443, 0, 212, 172);
			PANELFONDO.add(Posicion3_click);
			
			Posicion3 = new JLabel("");
			Posicion3.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion3.setEnabled(false);
			Posicion3.setBounds(537, 66, 29, 41);
			PANELFONDO.add(Posicion3);
			
			Posicion4_click = new JLabel("");
			Posicion4_click.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion4);
				}
			});
			Posicion4_click.setEnabled(false);
			Posicion4_click.setBounds(0, 189, 202, 183);
			PANELFONDO.add(Posicion4_click);
			
			Posicion4 = new JLabel("");
			Posicion4.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion4.setEnabled(false);
			Posicion4.setBounds(85, 258, 29, 41);
			PANELFONDO.add(Posicion4);
			
			Posicion5_click = new JLabel("");
			Posicion5_click.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion5);
				}
			});
			Posicion5_click.setEnabled(false);
			Posicion5_click.setBounds(223, 189, 202, 183);
			PANELFONDO.add(Posicion5_click);
			
			Posicion5 = new JLabel("");
			Posicion5.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion5.setEnabled(false);
			Posicion5.setBounds(308, 258, 29, 41);
			PANELFONDO.add(Posicion5);
			
			Posicion6_click = new JLabel("");
			Posicion6_click.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion6);
				}
			});
			Posicion6_click.setEnabled(false);
			Posicion6_click.setBounds(443, 189, 212, 183);
			PANELFONDO.add(Posicion6_click);
			
			Posicion6 = new JLabel("");
			Posicion6.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion6.setEnabled(false);
			Posicion6.setBounds(528, 258, 46, 41);
			PANELFONDO.add(Posicion6);
			
			Posicion7_click = new JLabel("");
			Posicion7_click.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion7);
				}
			});
			Posicion7_click.setEnabled(false);
			Posicion7_click.setBounds(0, 387, 202, 172);
			PANELFONDO.add(Posicion7_click);
			
			Posicion7 = new JLabel("");
			Posicion7.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion7.setEnabled(false);
			Posicion7.setBounds(85, 456, 29, 49);
			PANELFONDO.add(Posicion7);
			
			Posicion8_click = new JLabel("");
			Posicion8_click.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion8);
				}
			});
			Posicion8_click.setEnabled(false);
			Posicion8_click.setBounds(223, 387, 202, 172);
			PANELFONDO.add(Posicion8_click);
			
			Posicion8 = new JLabel("");
			Posicion8.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion8.setEnabled(false);
			Posicion8.setBounds(308, 456, 29, 49);
			PANELFONDO.add(Posicion8);
			
			Posicion9_click_1 = new JLabel("");
			Posicion9_click_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PUNTOSLABEL.setText(turnoDelJugadorVariable);
					jugadorQueLeToca++;
					jugador(jugadorQueLeToca, jugadorQueLeTocaSimbolo, Posicion9);
				}
			});
			Posicion9_click_1.setEnabled(false);
			Posicion9_click_1.setBounds(443, 382, 212, 177);
			PANELFONDO.add(Posicion9_click_1);
			
			Posicion9 = new JLabel("");
			Posicion9.setFont(new Font("Tahoma", Font.PLAIN, 40));
			Posicion9.setEnabled(false);
			Posicion9.setBounds(538, 445, 29, 41);
			PANELFONDO.add(Posicion9);
			
			fondoTresEnRaya.setIcon(new ImageIcon(VentanaJugar.class.getResource("/tresEnRaya/fondo3enraya (2).png")));
			fondoTresEnRaya.setBounds(0, 0, 665, 559);
			PANELFONDO.add(fondoTresEnRaya);
			
			panel_2 = new JPanel();
			panel_2.setBounds(0, 10, 679, 25);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			btnNewButton = new JButton("REINICIAR");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					REINICIAR();
				}
			});
			btnNewButton.setBounds(0, 0, 103, 25);
			panel_2.add(btnNewButton);
			
			lblNewLabel_1 = new JLabel("<--- JUGADOR X");
			lblNewLabel_1.setBounds(161, 6, 103, 13);
			panel_2.add(lblNewLabel_1);
			
			spinner = new JSpinner();
			spinner.setBounds(113, 3, 38, 20);
			panel_2.add(spinner);
			
			btnSalir = new JButton("SALIR");
			btnSalir.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
		try {
			ventanaPrincipal window = new ventanaPrincipal();
			window.frame.setVisible(true);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		VentanaJugar.this.setVisible(false);
	}
});btnSalir.setBounds(576,0,103,25);panel_2.add(btnSalir);

spinner_1=new JSpinner();spinner_1.setBounds(518,3,38,20);panel_2.add(spinner_1);

lblNewLabel_2=new JLabel("JUGADOR O --->");lblNewLabel_2.setBounds(424,6,84,13);panel_2.add(lblNewLabel_2);

PUNTOSLABEL=new JLabel("<-- PUNTOS -->");PUNTOSLABEL.setBounds(289,6,103,13);panel_2.add(PUNTOSLABEL);}}	
}
