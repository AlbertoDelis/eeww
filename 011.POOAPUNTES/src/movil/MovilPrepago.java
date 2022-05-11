package movil;

public class MovilPrepago {
	private int numeroMovil;
	private float costeEstablecLlamada;
	private float costeMinutoLlamada;
	private float costeConsumoMB;
	private float saldo;

	public MovilPrepago(int numeroMovil, float costeEstablecLlamada, float costeMinutoLlamada, float costeConsumoMB,
			float saldo) {
		super();
		this.numeroMovil = numeroMovil;
		this.costeEstablecLlamada = costeEstablecLlamada;
		this.costeMinutoLlamada = costeMinutoLlamada;
		this.costeConsumoMB = costeConsumoMB;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "MovilPrepago [numeroMovil=" + numeroMovil + ", costeEstablecLlamada=" + costeEstablecLlamada
				+ ", costeMinutoLlamada=" + costeMinutoLlamada + ", costeConsumoMB=" + costeConsumoMB + ", saldo="
				+ saldo + "]";
	}

	public int getNumeroMovil() {
		return numeroMovil;
	}

	public void setNumeroMovil(int numeroMovil) {
		this.numeroMovil = numeroMovil;
	}

	public float getCosteEstablecLlamada() {
		return costeEstablecLlamada;
	}

	public void setCosteEstablecLlamada(float costeEstablecLlamada) {
		this.costeEstablecLlamada = costeEstablecLlamada;
	}

	public float getCosteMinutoLlamada() {
		return costeMinutoLlamada;
	}

	public void setCosteMinutoLlamada(float costeMinutoLlamada) {
		this.costeMinutoLlamada = costeMinutoLlamada;
	}

	public float getCosteConsumoMB() {
		return costeConsumoMB;
	}

	public void setCosteConsumoMB(float costeConsumoMB) {
		this.costeConsumoMB = costeConsumoMB;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
