package loteria;

public abstract class Sorteo {
	protected int posibilidades;
	

	public Sorteo(int posibilidades) {
		this.posibilidades = posibilidades;
	}

	public int getPosibilidades() {
		return posibilidades;
	}

	public void setPosibilidades(int posibilidades) {
		this.posibilidades = posibilidades;
	}

	public abstract String lanzar();

	@Override
	public String toString() {
		return "Sorteo [posibilidades=" + posibilidades + "]";
	}

}
