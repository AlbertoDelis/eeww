package centralita;

import java.util.ArrayList;

public class Centralita {
	private int nLlamadas;
	private double costeTotal;
	private ArrayList<Llamada> lista;

	public Centralita(int nLlamadas, double costeTotal, ArrayList<Llamada> llamadas) {
		// nLlamadas = 0;
		costeTotal = 0;
		lista = new ArrayList<>();
	}

	public int getnLlamadas() {
		return this.lista.size();
	}

	public void setnLlamadas(int nLlamadas) {
		this.nLlamadas = nLlamadas;
	}

	public double getCosteTotal() {
		return costeTotal;
	}

	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}

	public ArrayList<Llamada> getLlamadas() {
		return lista;
	}

	public void setLlamadas(ArrayList<Llamada> llamadas) {
		this.lista = getLlamadas();
	}

	public void registra(Llamada llamada) {
		this.lista.add(llamada);
		nLlamadas++;
		costeTotal += llamada.calculaPrecio();
	}

	public void registra(String or, String des, int dur) {
		registra(new Llamada(des, des, dur) {
			
			@Override
			public double calculaPrecio() {
				return costeTotal;
			}
		});
		}


	public double costeLocales() {
		double total = 0;
		for (Llamada llamada : this.lista) {
			if(llamada instanceof Local)
			total += llamada.calculaPrecio();
		}
		return total;
	}
	
	public double costeProvinciales() {
		return costeTotal-costeLocales();
	}

	public void registra(String or, String des, int dur, int pr) {
		nLlamadas++;
	}

	@Override
	public String toString() {
		return "Centralita [nLlamadas=" + nLlamadas + ", costeTotal=" + costeTotal + ", lista=" + lista + "]";
	}

}
