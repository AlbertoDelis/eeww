package exdawv2;

public class Elemento implements Comparable<Elemento> {
	private Integer numero; // número atómico
	private String simbolo; // símbolo químico
	private String nombre; // nombre del elemento
	private Integer periodo;// periodo
	private Integer grupo; // grupo
	private Integer anho; // año de descubrimiento
	
	public Elemento(Integer numero, String simbolo, String nombre, Integer periodo, Integer grupo, Integer anho) throws ElementoException {
		super();
		this.numero = numero;
		this.simbolo = simbolo;
		this.nombre = nombre;
		this.periodo = periodo;
		setGrupo(grupo);
		this.anho = anho;
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
		return grupo;
	}

	public void setGrupo(Integer grupo) throws ElementoException {
		if(this.grupo<=0)
			throw new ElementoException("Valor incorrecto, tiene que ser positivo!!!");
		else
			this.grupo=grupo;
	}

	public Integer getAnho() {
		return anho;
	}

	public void setAnho(Integer anho) {
		this.anho = anho;
	}
	
	public boolean getIguales(Elemento o) {
		boolean estado=false;
		if(this.grupo.equals(o.grupo)&& this.numero.equals(o.numero)&&this.simbolo.equals(o.simbolo))
			estado=true;
		return estado;
	}

	@Override
	public int compareTo(Elemento o) {
		int estado;
		if(this.grupo>o.grupo) {
			estado=1;
		}else if(this.grupo<o.grupo){
			estado=-1;	
		}else {
			estado=0;
			if(this.numero>o.numero) {
				estado=1;
			}else if(this.numero<o.numero) {
				estado=1;
			}else {
				estado=0;
			}
		}	
		return estado;
	}
}
