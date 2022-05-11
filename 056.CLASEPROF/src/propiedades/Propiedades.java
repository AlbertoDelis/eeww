package propiedades;

import java.io.*;
import java.util.*;

public class Propiedades extends HashMap<Object, Object> {

	public Propiedades() {
	}

	public Propiedades(Propiedades propiedades) {
		this.putAll(propiedades);
//		for (Entry<Object, Object> propiedad : propiedades.entrySet()) {
//		this.put(propiedad.getKey(), propiedad.getValue());
//		}
//		for (Object k : propiedades.keySet()) {
//			this.put(k, propiedades.get(k));
//		}
	}

	public void setPropiedades(Object k, Object v) {
		this.put(k, v);
	}

	public void graba(String nombre) throws IOException {
		try (FileWriter fw=new FileWriter(nombre);
			BufferedWriter bw=new BufferedWriter(fw)){
			for (Entry<Object, Object> prop : this.entrySet()) {
				String cadena= String.format("%s=%s\n",prop.getKey(),prop.getValue());
				bw.append(cadena);	
			}	
		}	
	}
	
	public void carga(String nombre) throws IOException {
		try (FileReader fr=new FileReader(nombre);
			BufferedReader br=new BufferedReader(fr)){
			String linea= br.readLine();
			while(linea !=null) {
				this.put(linea.split("=")[0], linea.split("=")[1]);
				linea=br.readLine();
			}	
		}	
	}
}
