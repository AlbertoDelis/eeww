package agenda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JFGestionAmigo extends JFrame implements ActionListener {
	private Agenda agenda;
	private JPanel contentPane;
	public JPanel panel;
	public JPanel panel_1;
	public JButton btnConsulta;
	public JButton btnAlta;
	public JButton btnBaja;
	public JLabel lblNombre;
	public JTextField nombre;
	public JLabel lblTelefono;
	public JTextField telefono;
	public JLabel lblEdad;
	public JTextField Edad;
	public JMenuBar menuBar;
	public JMenu mnArchivos;
	public JMenu mnAcercaDe;
	public JMenuItem mntmAlumnos;
	public JMenuItem mntmSalir;
	public JMenuItem mntmAcercaDe;
	public JMenu mnNewMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFGestionAmigo frame = new JFGestionAmigo();
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
	public JFGestionAmigo() {
		this.agenda= new Agenda();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 157);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivos = new JMenu("Archivos");
		menuBar.add(mnArchivos);
		
		mntmAlumnos = new JMenuItem("Contactos");
		mntmAlumnos.addActionListener(this);
		mnArchivos.add(mntmAlumnos);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivos.add(mntmSalir);
		
		mnAcercaDe = new JMenu("Acerca");
		menuBar.add(mnAcercaDe);
		
		mntmAcercaDe = new JMenuItem("Acerca de");
		mntmAcercaDe.addActionListener(this);
		mnAcercaDe.add(mntmAcercaDe);
		
		mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{171, 171, 0};
		gbl_panel.rowHeights = new int[]{34, 34, 34, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.BOTH;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		panel.add(lblNombre, gbc_lblNombre);
		
		nombre = new JTextField();
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.fill = GridBagConstraints.BOTH;
		gbc_nombre.insets = new Insets(0, 0, 5, 0);
		gbc_nombre.gridx = 1;
		gbc_nombre.gridy = 0;
		panel.add(nombre, gbc_nombre);
		nombre.setColumns(10);
		
		lblTelefono = new JLabel("Telefono:");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.fill = GridBagConstraints.BOTH;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 1;
		panel.add(lblTelefono, gbc_lblTelefono);
		
		telefono = new JTextField();
		GridBagConstraints gbc_telefono = new GridBagConstraints();
		gbc_telefono.fill = GridBagConstraints.BOTH;
		gbc_telefono.insets = new Insets(0, 0, 5, 0);
		gbc_telefono.gridx = 1;
		gbc_telefono.gridy = 1;
		panel.add(telefono, gbc_telefono);
		telefono.setColumns(10);
		
		lblEdad = new JLabel("Edad:");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.fill = GridBagConstraints.BOTH;
		gbc_lblEdad.insets = new Insets(0, 0, 0, 5);
		gbc_lblEdad.gridx = 0;
		gbc_lblEdad.gridy = 2;
		panel.add(lblEdad, gbc_lblEdad);
		
		Edad = new JTextField();
		GridBagConstraints gbc_Edad = new GridBagConstraints();
		gbc_Edad.fill = GridBagConstraints.BOTH;
		gbc_Edad.gridx = 1;
		gbc_Edad.gridy = 2;
		panel.add(Edad, gbc_Edad);
		Edad.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(this);
		panel_1.add(btnConsulta);
		
		btnAlta = new JButton("Alta");
		btnAlta.addActionListener(this);
		panel_1.add(btnAlta);
		
		btnBaja = new JButton("Baja");
		btnBaja.addActionListener(this);
		panel_1.add(btnBaja);
	}

	public void actionPerformed(ActionEvent e) {
		String txt= e.getActionCommand();
		switch (txt) {
		case "Alta":
			agenda.alta(nombre.getText(), telefono.getText(), Integer.parseInt(Edad.getText()));
			break;
		case "Baja":
			agenda.baja(nombre.getText(), telefono.getText(), Integer.parseInt(Edad.getText()));			
			break;
		case "Consulta":
			System.out.println(agenda.toString());
			break;
		case "Salir":
			this.dispose();
			break;
		case "Acerca de":
			JOptionPane.showMessageDialog(this, "Hola\nHola", "Titulo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Contactos":
			agenda.contactos();
			break;

		default:
			break;
		}
	}
}

