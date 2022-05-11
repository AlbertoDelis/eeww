package calcjunit;

import java.lang.ref.Cleaner;

public class Calculadora {
	private int ans;
	private int num1;
	private int num2;

	public Calculadora(int ans, int num1, int num2) {
		super();
		this.ans = ans;
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int add(int a, int b) {
		return a + b;

	}

	public int resta() {
		int resul;
		if (resta2())
			resul = num1 - num2;
		else
			resul = num2 - num1;
		return resul;

	}

	public boolean resta2() {
		if (num1 >= num2)
			return true;
		else
			return false;
	}

	public Integer divide2() {
		if (num2 == 0)
			return null;
		int resul = num1 / num2;
		return resul;
	}

	public int mult(int a, int b) {
		return a * b;

	}

	public int div(int a, int b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException();
		else
			return a / b;

	}

	public void clear() {
		ans=0;
	}

	public int add(int v) {
		return ans += v;
	}

	public int sub(int v) {
		return ans -= v;

	}

	public int ans() {
		return ans;
	}

	@Override
	public String toString() {
		return "Calculadora [ans=" + ans + "]";
	}

}
