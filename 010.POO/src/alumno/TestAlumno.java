package alumno;

import java.util.Arrays;

public class TestAlumno {
	static public void visualiza(Alumno alumno01) {
		System.out.println("Id: " + alumno01.getId());
		System.out.println(alumno01.getNombre());
		int[] notas = alumno01.getNotas();
		for (int n = 0; n < notas.length; n++) {
			System.out.print(alumno01.getNotas()[n] + " ");
		}
		System.out.println(Arrays.toString(alumno01.getNotas()));
	}

	public static void main(String[] args) {
		Alumno[] alumno = new Alumno[3];
		Alumno alumno01 = new Alumno(1, "Ana", new int[] { 5, 8, 9 });
		Alumno alumno02 = new Alumno(2, "Alberto", new int[] { 7, 10, 9 });
		int notas[] = { 5, 8, 8, 5, 3 };
		for (int n = 0; n < alumno01.getNotas().length; n++)
			alumno01.getNotas()[n] = n * 3;
		System.out.println(alumno01.getId());
		System.out.println(alumno01.getNombre());
		System.out.println(alumno01.getNotas());
		for (int n = 0; n < args.length; n++)
			System.out.print(alumno01.getNotas()[n] + " ");
		visualiza(alumno01);
		visualiza(alumno02);
		System.out.println(alumno01);
		System.out.println(alumno02);
		System.out.println(alumno01.getId());
		System.out.println(alumno01.getMediaNotas());
		alumno[0] = alumno01;
		alumno[1] = alumno02;
		// alumno[2]=new Alumno(17, "Delis");
		System.out.println(alumno[0]);
		System.out.println(alumno[1]);
		System.out.println(alumno[2]);
		for (Alumno a : alumno) {
			visualiza(a);
		}
	}
}
