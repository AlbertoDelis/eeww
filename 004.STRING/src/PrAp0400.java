// Programa de ejemplo para ver funciones.
public class PrAp0400 {

	public static void main(String[] args) {
		String c1= "Casa";
		String c2= "casa";
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equalsIgnoreCase(c2));
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.compareToIgnoreCase(c2));
		System.out.println();
		String c3=new String("Casa");
		String c4=new String("casa");
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
		System.out.println(c3.equalsIgnoreCase(c4));
		System.out.println(c3.compareTo(c4));
		System.out.println(c3.compareToIgnoreCase(c4));
		System.out.println(c1.length());
		String c5=new String (c1.concat(c2));
		System.out.println(c5);
		

	}

}
