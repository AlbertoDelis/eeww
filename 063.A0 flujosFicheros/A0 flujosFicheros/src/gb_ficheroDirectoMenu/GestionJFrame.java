package gb_ficheroDirectoMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class GestionJFrame extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivos;
	private JMenuItem mntmPersonas;
	private JMenuItem mntmCategoras;
	private JMenuItem mntmSalir;
	private JMenu mnListados;
	private JMenu mnOperaciones;
	private JMenuItem mntmCrearFicheroDe;
	private JMenuItem mntmPersonas2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionJFrame frame = new GestionJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionJFrame() {
		setTitle("Gestión de archivos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArchivos = new JMenu("Archivos");
		menuBar.add(mnArchivos);

		mntmPersonas = new JMenuItem("Personas");
		mntmPersonas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmPersonasActionPerformed(e);
			}
		});
		mnArchivos.add(mntmPersonas);

		mntmPersonas2 = new JMenuItem("Personas 2");
		mntmPersonas2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmPersonas2ActionPerformed(e);
			}
		});
		mnArchivos.add(mntmPersonas2);

		mntmCategoras = new JMenuItem("Categorías");
		mnArchivos.add(mntmCategoras);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmSalirActionPerformed(e);
			}
		});
		mnArchivos.add(mntmSalir);

		mnListados = new JMenu("Listados");
		menuBar.add(mnListados);

		mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);

		mntmCrearFicheroDe = new JMenuItem("Crear fichero de Personas");
		mntmCrearFicheroDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmCrearFicheroDeActionPerformed(e);
			}
		});
		mnOperaciones.add(mntmCrearFicheroDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	protected void mntmPersonasActionPerformed(ActionEvent e) {
		new PersonaJDialogNB(this, true);
	}

	protected void mntmSalirActionPerformed(ActionEvent e) {
		this.dispose();
	}

	protected void mntmCrearFicheroDeActionPerformed(ActionEvent e) {
		try {
			int o = JOptionPane.showConfirmDialog(null, "¿Seguro?", "Cuidado", JOptionPane.YES_NO_OPTION);
			if (o == 0)
				new PersonaAccesoDatos(true);
		} catch (ValidacionFichero ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Cuidado", JOptionPane.INFORMATION_MESSAGE);
		} catch (ValidacionEntrada ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	protected void mntmPersonas2ActionPerformed(ActionEvent e) {
		new PersonaJFrameNB();
	}

}
