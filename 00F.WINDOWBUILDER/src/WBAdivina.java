import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class WBAdivina extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int NINTMAX = 2;
	static int nPensado, nIntentos, numero;
	

	private JPanel contentPane;
	public JLabel lblNewLabel;
	public JTextField textNumero;
	public JButton btnComprobar;
	public JTextField textInfo;
	public JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBAdivina frame = new WBAdivina();
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
	public WBAdivina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(41, 48, 45, 13);
		contentPane.add(lblNewLabel);

		textNumero = new JTextField();
		textNumero.setBounds(89, 45, 96, 19);
		contentPane.add(textNumero);
		textNumero.setColumns(10);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(this);
		btnComprobar.setBounds(211, 44, 110, 21);
		contentPane.add(btnComprobar);

		textInfo = new JTextField();
		textInfo.setEditable(false);
		textInfo.setBounds(41, 107, 305, 40);
		contentPane.add(textInfo);
		textInfo.setColumns(10);

		btnNewButton = new JButton("INICIA");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(211, 188, 157, 40);
		contentPane.add(btnNewButton);
		inicializa();
	}

	public void actionPerformed(ActionEvent e) {
		String opcion = e.getActionCommand();
		switch (opcion) {
		case "Inicia":
			inicializa();
			break;

			String texto = textNumero.getText();
			numero = Integer.parseInt(texto);
			if (numero < 1 || numero > 100)
				textInfo.setText("Error: 1..100");
			else if (numero > nPensado)
				textInfo.setText("El número es menor. " + numero);
			else if (numero < nPensado)
				textInfo.setText("El número es mayor. " + numero);
			else {
				textInfo.setText("Acertado. " + numero);
				btnComprobar.setEnabled(false);
			}
			
		}
		
		textInfo.setText(texto);

	}

	public void inicializa() {
		nPensado = (int) (Math.random() * 10 + 1);
		nIntentos = 0;
	}
}
