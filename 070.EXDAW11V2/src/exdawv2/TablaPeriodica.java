package exdawv2;

import java.util.ArrayList;

public class TablaPeriodica {
	private ArrayList<Elemento> listaElementos; // estructura de datos lista

	public TablaPeriodica(ArrayList<Elemento> listaElementos) {
		super();
		this.listaElementos = new ArrayList<>();
	}

	public ArrayList<Elemento> getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(ArrayList<Elemento> listaElementos) {
		this.listaElementos = listaElementos;
	}
	
	public void anadirElemento(Elemento e) {
		listaElementos.add(e);
	}
	/*
	Codifica un método que retorne un conjunto con los elementos del “grupo” pasado
	como parámetro clasificados por orden natural. Codifica todos los métodos que
	necesites en la clase “Elementos”.
	*/
	
}
