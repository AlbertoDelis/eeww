
// Decir si un n�mero es capic�a o no.
import java.util.Scanner;

public class PrEx0306 {

	public static void main(String[] args) {
		int num, numInv, unid, varTemp;
		num = 100;
		varTemp = num;
		numInv = 0;
		while (num>0) {
			unid = num % 10;
			numInv = numInv * 10 + unid;
			num = num / 10;	
		}
		
		num = varTemp;
		if (num == numInv)
			System.out.println("El n�mero " + varTemp + " es capicua.");
		else
			System.out.println("El n�mero " + varTemp + " NO es capicua.");

	}

}
