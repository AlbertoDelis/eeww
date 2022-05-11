package ejdaw11;

public class Elemento implements Comparable<Elemento> {
	private Integer numero;
	private String simbolo;
	private String nombre;
	private Integer periodo;
	private Integer grupo;
	private Integer anho;

	public Elemento(Integer numero, String simbolo, String nombre, Integer periodo, Integer grupo, Integer anho)
			throws NumeroException {
		super();
		this.numero = numero;
		this.simbolo = simbolo;
		this.nombre = nombre;
		this.periodo = periodo;
		this.anho = anho;

		if (grupo < 0) {
			throw new NumeroException();
		} else {
			this.grupo = grupo;
		}

	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Integer getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	public Integer getAnho() {
		return anho;
	}

	public void setAnho(Integer anho) {
		this.anho = anho;
	}

	public Integer validarGrupo(Integer grupo) {
		if (grupo < 0)
			System.out.println("El valor no es válido!!!");
		return grupo;
	}

	@Override
	public int compareTo(Elemento o) {
		if (this.grupo == o.grupo && this.numero == o.numero && this.simbolo.equals(o.simbolo)) {
			return 0;
		}
		int valor = -1;
		int valor2;
		if (this.grupo < o.grupo) {
			valor = 1;
		} else if (this.grupo == o.grupo) {
			if (this.numero < o.numero) {
				valor2 = 1;
			} else if (this.numero > o.numero) {
				valor2 = -1;
			} else {
				valor2 = 0;
			}
			return valor2;
		}
		return valor;

	}

	@Override
	public String toString() {
		return "Elemento [numero=" + numero + ", simbolo=" + simbolo + ", nombre=" + nombre + ", periodo=" + periodo
				+ ", grupo=" + grupo + ", anho=" + anho + "]";
	}
	
	

}