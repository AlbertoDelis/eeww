
public class PrAp0210 {

	public static void main(String[] args) {
		int dia, mes, year;
		boolean correcta;
		dia=1;
		mes=1;
		year=2021;
		correcta=false;
		switch (mes) {

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia>0 &&dia<=31) 
					correcta=true;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia>0 &&dia<=30)
					correcta=true;
				break;
			case 2:
				if (dia>0 &&dia<=28)
					correcta=true;
				break;
				
					
				

		}
		//default:
			//throw new IllegalArgumentException("Unexpected value: " + mes);
		

	}

}

//