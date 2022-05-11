package serializable;

import java.io.*;

public class TestSerializable implements Serializable{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try (FileOutputStream fos = new FileOutputStream("fichero.objetos"); 
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(123); // graba un objeto del tipo que sea
			oos.writeObject("Hola");
			oos.writeObject(new int[] { 1, 2, 3, 4 });
		}
		try (FileInputStream fis = new FileInputStream("fichero.objetos");
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			String s=(String)ois.readObject();
			Integer i=(Integer)ois.readObject();
			//Integer[] a=(Integer[])ois.readObject();
			Integer a0=(Integer)ois.readObject();
			Integer a1=(Integer)ois.readObject();
			Integer a2=(Integer)ois.readObject();
			Integer a3=(Integer)ois.readObject();
			System.out.println(s);
			System.out.println(i);
			System.out.println(a0);
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
		}
	}
}
