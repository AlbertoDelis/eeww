package ex2ev;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GestionCompras {
	private List<Compra> listaFacturas;
	
	public GestionCompras() {
		listaFacturas=new LinkedList<>();
	}
	
	Comparator<Compra>c=new CompararPrecioTotal();
	public void ordenaComprasPorPrecio() {
		listaFacturas.sort(c);
	}
	
	public Producto productoMasComprado() throws ProductoException{
		List<Compra>listaAux=new LinkedList<>();
		
		for (Compra compra : listaAux) {
			listaAux.add(compra.getMasComprado());
		}
		Producto p=listaAux.get(0);
		for (Producto producto : listaAux) {
			if(producto.getUnidades())
			
		}
		
	}

}
