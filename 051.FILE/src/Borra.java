import java.io.File;

public class Borra {
	public static void main(String[] args) {
		if(args.length<1)
			System.out.println("Faltan parámetros!!!");
		File f=new File("hola.txt");
		if(f.delete())
			System.out.println("Borrado: "+args[0]);
		else
			System.out.println("NO existe: "+args[0]);
	}

}
