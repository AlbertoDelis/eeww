package videojuego;

public class VideoJuego implements Entregable{
    
    /*
    Crearemos una clase Videojuego con las siguientes características:

Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
Por defecto, las horas estimadas serán de 10 horas y entregado false. 
   El resto de atributos serán valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
        - Un constructor por defecto.
        - Un constructor con el titulo y horas estimadas. El resto por defecto. 
        - Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:
Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
    */
    
    private String titulo;
    private int horasEstimadas=10;
    private boolean entregado=false;
    private String genero;
    private String compa�ia;
    
    public VideoJuego() {	
	}
    
	public VideoJuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public VideoJuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return "VideoJuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compa�ia=" + compa�ia + "]";
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
		VideoJuego obj2=(VideoJuego) obj;
		if(this.horasEstimadas>obj2.getHorasEstimadas()) {
			estado=1;
		}else if(this.horasEstimadas==obj2.getHorasEstimadas()) {
			estado=0;
		}
		return estado;
	}
	
    
	
    
    
    
}

