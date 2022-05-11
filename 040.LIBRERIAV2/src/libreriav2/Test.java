package libreriav2;

import java.io.*;
import java.util.*;

public class Test {
	public static void main(String[] args) throws IOException {
		/*
[Código, Autor, Título, Nº páginas, Nº copias vendidas, Precio*, true/false**, Tipo préstamo]
978842, Charles Dickens, Historia de dos ciudades, 482, 200000000, 9.00, true, MENSUAL
482873, Roald Dahl, Matilda, 248, 800000, 14.95, false, QUINCENAL
198385, Bram Stoker, Drácula, 560, 1500000, 25.00, true, MENSUAL
474589, Arturo Pérez-Reverte, La piel del tambor, 250, 250000, 15.55, false, SEMANAL
789852, Arturo Pérez-Reverte,El Italiano, 500, 500000, 20.86, false, MENSUAL
942310, Charles Dickens, Casa Desolada, 250, 160000, 21.20, false, QUINCENAL 
178956, Dan Brown, El código Da Vinci, 656, 80000000, 9.45, true, MENSUAL
666888, Paulo Coelho, El alquimista, 192, 530000, 15.25, true, TRIMESTRAL
		 
		Map<Integer, String>lista=new HashMap<>();
		ImplLibro libro01=new ImplLibro(978842, "Charles Dickens", "Historia de dos ciudades", 482, 200000000, 9.00, true, MENSUAL);
		ImplLibro libro02=new ImplLibro(482873, "Roald Dahl", "Matilda", 248, 800000, 14.95, false, QUINCENAL);
		ImplLibro libro03=new ImplLibro(198385, "Bram Stoker", "Drácula", 560, 1500000, 25.00, true, MENSUAL);
		ImplLibro libro04=new ImplLibro(474589, "Arturo Pérez-Reverte", "La piel del tambor", 250, 250000, 15.55, false, SEMANAL);
		ImplLibro libro05=new ImplLibro(789852, "Arturo Pérez-Reverte", "El Italiano", 500, 500000, 20.86, false, MENSUAL);
		ImplLibro libro06=new ImplLibro(942310, "Charles Dickens", "Casa Desolada", 250, 160000, 21.20, false, QUINCENAL);
		ImplLibro libro07=new ImplLibro(178956, "Dan Brown", "El código Da Vinci", 656, 80000000, 9.45, true, MENSUAL);
		ImplLibro libro08=new ImplLibro(666888, "Paulo Coelho", "El alquimista", 192, 530000, 15.25, true, TRIMESTRAL);
		
		for (int i = 0; i < args.length; i++) {
			
			
		}
	}
	*/
		
		String archivo = "C:\\Users\\alber\\eclipse-workspace\\04.LIBRERIAV2\\src\\libreriav2\\libros.txt";
        String cadena;  // 1111,diego,alberto,00202002
        
        FileReader f = new FileReader(archivo); 
        BufferedReader b = new BufferedReader(f); 
        
        while( (cadena = b.readLine()) != null) { // En este bucle cogemos linea por linea en cada vuelta
        	System.out.println(cadena); 
        String array[]=cadena.split(",");
        Integer codigo=Integer.parseInt(array[0]);
        String autor=array[1];
        String titulo=array[2];
        Integer numPaginas=Integer.parseInt(array[3]);
        Integer numCopiasVendidas=Integer.parseInt(array[4]);
        Double precio=Double.parseDouble(array[5]);
        Boolean bestSeller=Boolean.parseBoolean(array[6]);
        ImplLibro libro1= new ImplLibro(codigo, autor, titulo, numPaginas, numCopiasVendidas, precio, false, null);
        System.out.println(libro1);
        	
               
        } 
        
        b.close(); 
        f.close();
	}
}
