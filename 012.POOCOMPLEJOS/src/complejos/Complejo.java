package complejos;

public class Complejo {
	private int real;
	private int imaginaria;

	public Complejo() {
		this(0, 0);
		// this.real=0;
		// this.imaginaria=0;
	}

	public Complejo(int real, int imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public int getReal() {
		return real;
	}

	public int getImaginaria() {
		return imaginaria;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public void setImaginaria(int imaginaria) {
		this.imaginaria = imaginaria;
	}

	public void suma(Complejo a) {
		this.real = this.real + a.real;
		this.imaginaria = imaginaria + a.imaginaria;

	}

	static public Complejo suma(Complejo a, Complejo b) {
		Complejo c = new Complejo();
		c.real = a.real + b.real;
		c.imaginaria = a.imaginaria + b.imaginaria;
		return c;
	}

	@Override
	public String toString() {
		return getReal() + (getImaginaria() < 0 ? "" : "+") + getImaginaria() + "i";
	}

}

