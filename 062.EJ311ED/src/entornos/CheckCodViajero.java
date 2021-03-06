package entornos;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class CheckCodViajero extends JFrame {

	// Panel:
	private JPanel panelDatos;
	private JScrollPane scrollPane; // Panel de resultados.

	// Campos:
	private JTextField tfCV; // Canmpo de codigo de viajero.
	private JTextField tfNombre; // Campo nombre del viajero.
	private JTextField tfEdad; // Edad del viajero.
	@SuppressWarnings("rawtypes")
	private JComboBox cbDestino; // Campo de Destino;

	// Etiquetas:
	private JLabel etqPanel; // Etiqueta de panel.
	private JLabel etqScrollPane; // Etiqueta de panel de resultado.
	private JLabel etqCV; // Etiqueta campo codigo viajero.
	private JLabel etqNombre;
	private JLabel etqEdad;
	private JLabel etqDestino;
	private JTextArea textArea; // Etiqueta de resultados:

	// Botones:
	private JButton btnGuardar; // Botón guardar datos
	private JButton btnReset; // Botón borrar campos.

	// Array destinos:
	String destinos[] = { "Talavera", "Toledo", "Madrid" };

	CheckCodViajero() {
		// Creación del marco principal:
		pMarco();
		pPanelDatos();
		ptfCodViajero();
		ptfNombre();
		ptfEdad();
		pcbDestino();
		pbtnGuardar();
		pbtnReset();
		pspResultado();

	}

	// Metodos de propiedades:
	// ---------------------------------------------------
	private void pMarco() {
		// Propiedades del marco:
		setTitle("Formulario de cliente");
		setSize(393, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

	}

	private void pPanelDatos() {
		// propiedades Panel de datos:
		panelDatos = new JPanel();
		etqPanel = new JLabel("Panel de datos de cliente:");
		panelDatos.setSize(380, 160);
		panelDatos.setLocation(6, 33);
		etqPanel.setSize(380, 26);
		etqPanel.setLocation(6, 6);

		panelDatos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelDatos.setLayout(null);
		getContentPane().add(panelDatos);
		getContentPane().add(etqPanel);
	}

	public int ptfCodViajero() {
		// propiedades campo de codigo viajero:
		tfCV = new JTextField("999999");
		etqCV = new JLabel("Cod. Viajero:");
		tfCV.setSize(70, 26);
		tfCV.setLocation(100, 6);
		etqCV.setSize(89, 26);
		etqCV.setLocation(6, 6);
		panelDatos.add(tfCV);
		panelDatos.add(etqCV);
		return 0;
	}

	public void ptfNombre() {
		tfNombre = new JTextField("1234567890" + "1234567890" + "1234567890");
		etqNombre = new JLabel("Nombre:");
		tfNombre.setSize(270, 26);
		tfNombre.setLocation(100, 46);
		etqNombre.setSize(109, 26);
		etqNombre.setLocation(6, 46);
		panelDatos.add(tfNombre);
		panelDatos.add(etqNombre);
	}

	public void ptfEdad() {
		tfEdad = new JTextField("99");
		etqEdad = new JLabel("Edad:");
		tfEdad.setSize(35, 26);
		tfEdad.setLocation(100, 86);
		etqEdad.setSize(109, 26);
		etqEdad.setLocation(6, 86);
		panelDatos.add(tfEdad);
		panelDatos.add(etqEdad);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void pcbDestino() {
		String destinos[] = { "Talavera", "Toledo", "Madrid" };
		cbDestino = new JComboBox();
		etqDestino = new JLabel("Destino: ");
		// Construyo el combo box.
		cbDestino.addItem("Seleccionar..."); // Valor inicial del combo.
		for (int i = 0; i < destinos.length; i++) {
			cbDestino.addItem(destinos[i]);
		}
		cbDestino.setSize(123, 26);
		cbDestino.setLocation(100, 126);
		etqDestino.setSize(70, 26);
		etqDestino.setLocation(6, 126);
		panelDatos.add(cbDestino);
		panelDatos.add(etqDestino);
	}

	public void pbtnGuardar() {
		btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new BtnGuardarMouseListener()); // Oyente de guardar.
		btnGuardar.setSize(104, 26);
		btnGuardar.setLocation(128, 205);
		getContentPane().add(btnGuardar);
	}

	public void pbtnReset() {
		btnReset = new JButton("Reiniciar");
		btnReset.addMouseListener(new BtnResetMouseListener());
		btnReset.setSize(104, 26);
		btnReset.setLocation(282, 205);
		getContentPane().add(btnReset);

	}

	public void pspResultado() {
		scrollPane = new JScrollPane();
		etqScrollPane=new JLabel("Resultado:");
		scrollPane.setBounds(6, 235, 380, 131);
		etqScrollPane.setBounds(6, 205, 104, 26);
		getContentPane().add(scrollPane);
		getContentPane().add(etqScrollPane);
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	// Metodos de procesos:
	// ---------------------------------------------------
	public void inicializa() {
		// Valores para la primera ejecución de la interfaz.
		reset();
		setVisible(true);
	}

	public void textoInicial() {
		String msg = "Formulario inicializado:";
		setTextArea(msg);
		msg = "----------------------------";
		setAddTextArea(msg);
		msg = "Cod. Cliente numerico entre 100000 y 999999.";
		setAddTextArea(msg);
		msg = "Nombre, máximo 30 caracteres.";
		setAddTextArea(msg);
		msg = "Edad, entre 10 y 99 años.";
		setAddTextArea(msg);
		msg = "Elegir destino.";
		setAddTextArea(msg);
		msg = "----------------------------";
		setAddTextArea(msg);
	}

	public void reset() {
		// Reinicio de campos.
		setTfCV(null);
		setTfNombre(null);
		setTfEdad(null);
		setcbDestino(0); // Valor inicial.
		textoInicial();
		tfCV.requestFocus();
	}

	// Setters & Getters:
	// ---------------------------------------------------
	public String getTfCV() {
		return tfCV.getText();
	}

	public void setTfCV(String tfCV) {
		this.tfCV.setText(tfCV);
	}

	public String getTfNombre() {
		return tfNombre.getText();
	}

	public void setTfNombre(String tfNombre) {
		this.tfNombre.setText(tfNombre);
	}

	public String getTfEdad() {
		return tfEdad.getText();
	}

	public void setcbDestino(int index) {
		cbDestino.setSelectedIndex(index);
	}

	public String getcbDestino() {
		return cbDestino.getSelectedItem().toString();
	}

	public void setTfEdad(String tfEdad) {
		this.tfEdad.setText(tfEdad);
	}

	public String getTextArea() {
		return textArea.getText();
	}

	public void setTextArea(String textArea) {
		this.textArea.setText(textArea);
	}

	public void setAddTextArea(String textArea) {
		String actual = this.textArea.getText();
		this.textArea.setText(actual + "\n" + textArea);
	}

	// Oyente de eventos:
	// ---------------------------------------------------
	public class BtnGuardarMouseListener extends MouseAdapter {
		@Override
		public void mouseReleased(MouseEvent e) {
			// Crea objeto para guardado de datos:
			Guardado g = new Guardado(CheckCodViajero.this,destinos);
			boolean[] errores = g.getErrores();
			System.err.println(errores[0] + "," + errores[1] + "," + errores[2] + "," + errores[3]);
		}
	}

	public class BtnResetMouseListener extends MouseAdapter {
		@Override
		public void mouseReleased(MouseEvent e) {
			reset();
		}
	}
	// ---------------------------------------------------

	
}
