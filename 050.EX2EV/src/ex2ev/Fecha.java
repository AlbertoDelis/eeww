package ex2ev;

public class Fecha {
	private Integer day;
	private Integer month;
	private Integer year;

	public Fecha(Integer day, Integer month, Integer year) throws FechaIncorrectaException {
		super();
		if (day > 31 || day < 1) {
			throw new FechaIncorrectaException("Dia no v�lido!!!");
		} else if ((month==2 ||month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			throw new FechaIncorrectaException("Ese mes NO tiene 31 d�as!!!");
		} else if (day > 29 && year % 4 == 0 && month == 2) {
			throw new FechaIncorrectaException("Este a�o Febrero NO tiene 29 d�as!!!");
		} else if (day > 28 && year % 4 != 0 && month == 2) {
			throw new FechaIncorrectaException("A�o no bisiesto!!!");
		} else {
			this.day = day;
		}

		if (month > 12 || month < 1)
			throw new FechaIncorrectaException("Mes no v�lido!!!");
		else
			this.month = month;
		if (year < 2000)
			throw new FechaIncorrectaException("A�o no v�lido!!!");
		else
			this.year = year;
	}

	@Override
	public String toString() {
		return "Fecha correcta: "+ day + "/" + month + "/" + year;
	}
	
	
	
}
