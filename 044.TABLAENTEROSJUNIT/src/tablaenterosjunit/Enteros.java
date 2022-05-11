package tablaenterosjunit;

import java.util.Arrays;

public class Enteros {
	public static void main(String[] args) {
		int array[]=new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*100+1);
		}
		System.out.println(Arrays.toString(array));
	}

}
