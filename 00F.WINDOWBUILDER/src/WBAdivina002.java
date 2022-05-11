import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class WBAdivina002 extends JFrame implements ActionListener {
	static Scanner tc=new Scanner(System.in);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField;
	public JButton btnNewButton;
	public JTextArea textArea;
	public JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBAdivina002 frame = new WBAdivina002();
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
	public WBAdivina002() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		textField.setBounds(31, 24, 380, 81);
		contentPane.add(textField);
		textField.setColumns(1);
		
		btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnNewButton.setBounds(454, 24, 266, 81);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Modern No. 20", Font.PLAIN, 12));
		textArea.setColumns(5);
		textArea.setBounds(41, 201, 361, 107);
		contentPane.add(textArea);
		
		btnNewButton_1 = new JButton("INICIO");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnNewButton_1.setBounds(458, 203, 262, 112);
		contentPane.add(btnNewButton_1);
	}
	static int sumaDivisores(int num) {
		int suma;
		suma = 0;
		for (int divisor = 1; divisor <= num; divisor++)
			if (num % divisor == 0)
				suma += divisor;

		return suma;
	}
	static boolean amigo(int num1, int num2) {
		if (sumaDivisores(num1) - num1 != num2)
			return false;
		if (sumaDivisores(num2) - num2 != num1)
			return false;
		return true;

	}

	
	public void actionPerformed(ActionEvent e) {
		int num1 = 0, num2 = 0;
		do {

			System.out.println("Introduce los números. Si no quiere introducirlos ponga algún 0.");
			System.out.print("Dame un primer número: ");
			num1 = tc.nextInt();
			System.out.print("Dame un segundo número: ");
			num2 = tc.nextInt();
			System.out.println("Los números " + num1 + " y " + num2 + " son o no son amigos: " + amigo(num1, num2));

		} while (num1 != 0 && num2 != 0 && num1 != num2);
		System.out.println("FIN PROGRAMA!!!");
		
		
	}
	
}
