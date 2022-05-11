package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
Haced una clase Calculadora que realice operaciones sencillas como suma, resta, multiplicación y división de enteros. 
Haced que se lancen las excepciones oportunas encaso de operaciones conflictivas. 
Recordad lo que es un método estático y usadlos siempre que podáis.
Implementad ahora una clase PruebaCalculadora que se encargue de tratar las posibles excepciones que se puedan producir 
sin abortar la ejecución del programa. 
Ayudaos de la clase Scanner para realizar la entrada/salida de PruebaCalculadora.
 */

public class JFCalculadora extends JFrame {

	private JPanel contentPane;
	public JTextField operador1;
	public JTextField operador2;
	public JTextField resultado;
	public JButton opSuma;
	public JButton opResta;
	public JButton opMultiplicacion;
	public JButton opDivision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFCalculadora frame = new JFCalculadora();
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
	public JFCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		operador1 = new JTextField();
		operador1.setBounds(10, 10, 187, 53);
		contentPane.add(operador1);
		operador1.setColumns(10);
		
		operador2 = new JTextField();
		operador2.setBounds(207, 10, 194, 53);
		contentPane.add(operador2);
		operador2.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(411, 10, 182, 53);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		opSuma = new JButton("SUMA");
		opSuma.addActionListener(new OpSumaActionListener());
		opSuma.setBounds(10, 87, 260, 127);
		contentPane.add(opSuma);
		
		opResta = new JButton("RESTA");
		opResta.addActionListener(new OpRestaActionListener());
		opResta.setBounds(333, 87, 260, 127);
		contentPane.add(opResta);
		
		opMultiplicacion = new JButton("MULTIPLICACION");
		opMultiplicacion.addActionListener(new OpMultiplicacionActionListener());
		opMultiplicacion.setBounds(10, 224, 260, 127);
		contentPane.add(opMultiplicacion);
		
		opDivision = new JButton("DIVISION");
		opDivision.addActionListener(new OpDivisionActionListener());
		opDivision.setBounds(333, 224, 260, 127);
		contentPane.add(opDivision);
	}
	
	public JTextField getOperador1() {
		return operador1;
	}
	public JTextField getOperador2() {
		return operador2;
	}
	public JTextField getResultado() {
		return resultado;
	}
}
	private class OpSumaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class OpRestaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class OpMultiplicacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class OpDivisionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	
