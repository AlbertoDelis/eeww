package fecha;

public class Fecha {
	private Integer day;
	private Integer month;
	private Integer year;

	public Fecha(Integer day, Integer month, Integer year) throws FechaIncorrectaException {
		super();
		if (day > 31 || day < 1) {
			throw new FechaIncorrectaException("Dia no válido!!!");
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			throw new FechaIncorrectaException("Dia mayor que 30!!!");
		} else if (day > 29 && year % 4 == 0 && month == 2) {
			throw new FechaIncorrectaException("Dia para febrero mayor de 29!!!");
		} else if (day > 28 && year % 4 != 0 && month == 2) {
			throw new FechaIncorrectaException("Dia incorrecto para febrero!!!");
		} else {
			this.day = day;
		}

		if (month > 12 || month < 1)
			throw new FechaIncorrectaException("Mes incorrecto!!!");
		else
			this.month = month;
		if (year < 2000)
			throw new FechaIncorrectaException("Año incorrecto!!!");
		else
			this.year = year;
	}

	@Override
	public String toString() {
		return "Fecha correcta: "+ day + "/" + month + "/" + year;
	}
	
	
	
}
