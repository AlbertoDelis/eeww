package ejdaw11;

import java.util.*;

public class TablaPeriodica {
	private ArrayList<Elemento> elementos;
	private HashMap<Integer, String> mapaElementos;

	public TablaPeriodica() {
		this.elementos = new ArrayList<Elemento>();
		this.mapaElementos = new HashMap<Integer, String>();
	}

	public HashMap<Integer, String> anadeElemento(Elemento o) {
		if (!this.elementos.contains(o))
			this.elementos.add(o);
		return mapaElementos;
	}

	public ArrayList<Elemento> getClasifica(ArrayList<Elemento> nuevaLista) {
		Collections.sort(nuevaLista, new Comparator<Elemento>() {
			@Override
			public int compare(Elemento p1, Elemento p2) {
				return new Integer(p2.getGrupo()).compareTo(new Integer(p1.getGrupo()));
				//return Integer.parseInt(p2.getGrupo()).compareTo(Integer.parseInt(p1.getGrupo()));
			}
		});
		return nuevaLista;
	}

	public HashMap<Integer, String> getOrdena() {
		for (Elemento elemento : elementos) {
			this.mapaElementos.put(elemento.getNumero(), elemento.getNombre());
		}
		return mapaElementos;
	}
}
