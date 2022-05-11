package fc_encuesta;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Fecha implements Comparable<Fecha>, Serializable{
	private int dia;
	private int mes;
	private int anho;
	
	public Fecha(Calendar fecha){
		this(fecha.get(Calendar.DAY_OF_MONTH), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR));
	}
	public Fecha(){
		setFecha();
	}

	public Fecha(int dia, int mes, int anho) {
		setFecha(dia, mes, anho);
	}
	public void setFecha(){
		Calendar c= Calendar.getInstance();
		dia= c.get(Calendar.DAY_OF_MONTH);
		mes= c.get(Calendar.MONTH) + 1;
		anho= c.get(Calendar.YEAR);
	}
	public void setFecha(int dia, int mes, int anho) {
		if(isCorrecta(dia, mes, anho)){
			this.dia = dia;
			this.mes = mes;
			this.anho = anho;
		}
		else
			setFecha();		/// o bien lanzar una excepción
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnho() {
		return anho;
	}
    public boolean esBisiesto(int anho) {
    	boolean bisiesto = false;
    	bisiesto = (anho % 4 == 0) && !(anho % 100 == 0) || (anho % 400 == 0);
    	return bisiesto;
    }

	public boolean isCorrecta(int dia, int mes, int anho) {
		boolean fechaCorrecta = true;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia < 1 || dia > 31)
				fechaCorrecta = false;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia < 1 || dia > 30)
				fechaCorrecta = false;
			break;
		case 2:
			if (dia < 1 || (dia > 28 && !(dia == 29 && esBisiesto(anho))))
				fechaCorrecta = false;
			break;
		default:
			fechaCorrecta = false;
			break;
		}
		return fechaCorrecta;
	}
	@Override
	public String toString() {
		return dia + "/" + (mes) + "/" + anho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anho;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Fecha))
			return false;
		Fecha other = (Fecha) obj;
		if (anho != other.anho)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	@Override
	public int compareTo(Fecha f) {
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(anho, mes - 1, dia);
		Calendar fecha2 = Calendar.getInstance();
		fecha2.set(f.anho, f.mes - 1, f.dia);
		return fecha1.compareTo(fecha2);
		/*
		if(fecha1.before(fecha2))
			return -1;
		else if(fecha1.after(fecha2))
			return 1;
		else			
			return 0;
			*/
	}
	
}
