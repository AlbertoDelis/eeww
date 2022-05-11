package videojuego;

public class Serie implements Entregable{

	private String titulo;
	private final int numeroTemporadas = 3;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {

	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, String genero, String creador) {
		this.titulo = titulo;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public boolean getEntregado() {
		return this.entregado;
	}
	public int getnumeroTemporadas() {
		return this.numeroTemporadas;
	}

	@Override
	public String toString() {
		return "Serie{" + "titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + '}';
	}
	
	@Override
	public void entregar() {
		this.entregado=true;
	}
	
	@Override
	public void devolver() {
		this.entregado=false;
	}
	
	@Override
	public boolean isEntregado() {
		if (this.entregado==true)
			return true;
		else
			return false;
	}
	
	@Override
	public int compareTo (Object obj) {
		int estado=-1;
		Serie obj2=(Serie) obj;
		if(this.numeroTemporadas>obj2.getnumeroTemporadas()) {
			estado=1;
		}else if(this.numeroTemporadas==obj2.getnumeroTemporadas()) {
			estado=0;
		}
		return estado;
	}


}
