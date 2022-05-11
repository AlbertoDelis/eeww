package fecha;

public class Fecha {
	private Integer day;
	private Integer month;
	private Integer year;

	public Fecha(Integer day, Integer month, Integer year) throws FechaIncorrectaException {
		super();
		if (day > 31) {
			throw new FechaIncorrectaException();
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			throw new FechaIncorrectaException();
		} else if (day > 29 && year % 4 == 0 && month == 2) {
			throw new FechaIncorrectaException();
		} else if (day > 28 && year % 4 != 0 && month == 2) {
			throw new FechaIncorrectaException();
		} else {
			this.day = day;
		}

		if (month > 12)
			throw new FechaIncorrectaException();
		else
			this.month = month;
		if (year < 2000)
			throw new FechaIncorrectaException();
		else
			this.year = year;
	}

	

}
