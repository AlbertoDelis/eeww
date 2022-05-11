package propiedades;

import java.io.IOException;

public class TestProp {

	public static void main(String[] args) {
		Propiedades propiedades= new Propiedades();
		
		propiedades.setPropiedades("uno", "primero");
		propiedades.setPropiedades("dos", "segundo");
		propiedades.setPropiedades("tres", "tercero");
		try {
			propiedades.graba("fichero.propiedades");
//			p2.carga("fichero.propiedades");
			Propiedades p2=new Propiedades(propiedades);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
