
public class ddd {

	public static void main(String[] args) {
		double porcen= 0.2;
		int cat= 2;
		String sql = "UPDATE `EMPRESA`.`EMPLEADO` SET sueldo = sueldo *"
				+ porcen / 100 + " WHERE categoria = " + cat;
	}

}
