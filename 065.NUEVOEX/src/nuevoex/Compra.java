package nuevoex;

import java.time.LocalDate;

public class Compra {
	private static Integer identificador=0;
	private String empresa;
	private LocalDate fecha;
	private Producto []producto;
	
	public Compra(String empresa, LocalDate fecha, Producto[] producto) {
		super();
		this.identificador++;
		this.empresa = empresa;
		this.fecha = fecha;
		this.producto = new Producto[20];
	}
	


}