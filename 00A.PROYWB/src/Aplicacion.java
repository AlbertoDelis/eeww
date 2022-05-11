import javax.swing.JOptionPane;

public class Aplicacion {
	OperacionesMatematicas misOperaciones;

	public Aplicacion() {
		misOperaciones = new OperacionesMatematicas();

		presentarMenu();
	}

	private void presentarMenu() {
		String menu = "Operaciones Matematicas:\n"+"1. Sumar\n"+"2. Restar\n"+"3. Multiplicar\n"+"4. Dividir\n"+"5. Salir\n\n"+"Ingrese una opción\n";
		int cod = 0;

		do {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));

			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (cod) {
			case 1:
				int resp = misOperaciones.sumar(num1, num2);
				JOptionPane.showMessageDialog(null, "La suma es: "+resp);
				break;
			case 2:
				int rest = misOperaciones.restar(num1, num2);
				JOptionPane.showMessageDialog(null, "La resta es: "+rest);
				break;
			case 3:
				int mult = misOperaciones.multiplicar(num1, num2);
				JOptionPane.showMessageDialog(null, "La multiplicación es: "+mult);
				break;
			case 4:
				String div = misOperaciones.dividir(num1, num2);
				JOptionPane.showMessageDialog(null, div);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Hasta Pronto!!!");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
			}
		} while (cod != 5);

	}

}
