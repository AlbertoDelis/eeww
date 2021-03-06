package ejdaw12;

public class Articulo implements Comparable<Elemento> {
	private Integer codigo;
	private String nombre;
	private String descripcion;
	private Integer unidades;
	private Integer grupo;
	private Integer anho;
	
	public Articulo(Integer codigo, String nombre, String descripcion, Integer unidades, Integer grupo, Integer anho) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.grupo = grupo;
		this.anho = anho;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getUnidades() {
		return unidades;
	}

	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}

	public Integer getGrupo() {
		return grupo;
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

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", unidades="
				+ unidades + ", grupo=" + grupo + ", anho=" + anho + "]";
	}
	
	@Override
	public int compareTo(Articulo o) {
		return 0;
	}
	

}
