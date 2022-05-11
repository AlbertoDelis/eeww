package calculadora;


public class Calculadora {
	private double operador1;
	private double operador2;
	
	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	public double getOperador1() {
		return operador1;
	}

	public void setOperador1(double operador1) {
		this.operador1 = operador1;
	}

	public double getOperador2() {
		return operador2;
	}

	public void setOperador2(double operador2) {
		this.operador2 = operador2;
	}
	public double suma() {
		return operador1+operador2;
	}
	public double resta() {
		return operador1-operador2;
	}
	public double multiplicacion() {
		return operador1*operador2;
	}
	public double division() {
		return operador1/operador2;
	}

	@Override
	public String toString() {
		return "Calculadora [operador1=" + operador1 + ", operador2=" + operador2 + "]";
	}
	
	
	
	

}
