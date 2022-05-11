package a0_dialogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ea_ficheroData_AD.AccesoDatos;
import ea_ficheroData_AD.Alumno;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;

public class Ver {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JLabel lblNmero;
	private JTextField textNAlumno;
	private JLabel lblNombre;
	private JTextField textNombre;
	private JPanel panel_2;
	private JTextField textN0;
	private JTextField textN1;
	private JTextField textN2;
	private JTextField textN3;
	private JLabel lblNotas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ver window = new Ver();
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
	public Ver() {
		initialize();
		try {
			AccesoDatos.abreSalida(true);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 604, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		lblNmero = new JLabel("Número: ");
		lblNmero.setBounds(58, 58, 61, 16);
		
		textNAlumno = new JTextField();
		textNAlumno.setBounds(125, 53, 43, 26);
		textNAlumno.setColumns(10);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(191, 58, 61, 16);
		
		textNombre = new JTextField();
		textNombre.setBounds(258, 53, 130, 26);
		textNombre.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBounds(96, 137, 270, 30);
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(2);
		flowLayout.setHgap(2);
		
		textN0 = new JTextField();
		panel_2.add(textN0);
		textN0.setColumns(4);
		
		textN1 = new JTextField();
		panel_2.add(textN1);
		textN1.setColumns(4);
		
		textN2 = new JTextField();
		panel_2.add(textN2);
		textN2.setColumns(4);
		
		textN3 = new JTextField();
		panel_2.add(textN3);
		textN3.setColumns(4);
		
		lblNotas = new JLabel("Notas: ");
		lblNotas.setBounds(58, 115, 61, 16);
		panel.setLayout(null);
		panel.add(lblNmero);
		panel.add(textNAlumno);
		panel.add(lblNombre);
		panel.add(textNombre);
		panel.add(lblNotas);
		panel.add(panel_2);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("Graba");
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		panel_1.add(btnNewButton);
	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				Integer n= new Integer(textNAlumno.getText());
				String nombre= textNombre.getText();
				// 
				AccesoDatos.grabaAlumno(new Alumno());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
