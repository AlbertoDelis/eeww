package libro;

public class TestLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   /*
   Crear una clase Libro que contenga los siguientes atributos:
ISBN

Titulo

Autor

NÃºmero de pÃ¡ginas

Crear sus respectivos mÃ©todos get y set correspondientes para cada atributo. 
        Crear el mÃ©todo toString() para mostrar la informaciÃ³n relativa al libro con el siguiente formato:

â€œEl libro con ISBN creado por el autor tiene pÃ¡ginasâ€�

En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.

Por Ãºltimo, indicar cuÃ¡l de los 2 tiene mÃ¡s pÃ¡ginas.
   
   */
   
   Libro l1 = new Libro(91919191, "Titulo de prueba", "Alberto", 180);
   Libro l2 = new Libro(28138128, "Titulo 2", "Diego", 12120);
   
   if(l1.getNumeroPaginas() > l2.getNumeroPaginas()){
       System.out.println("El libro " + l1.toString() + " tiene mas hojas.");
   }else if (l1.getNumeroPaginas() == l2.getNumeroPaginas()){
       System.out.println("Tienen el mismo numero de hojas");
   }else{
       System.out.println("El libro " + l2.toString() + " tiene mas hojas.");
   }
   
  
    }
    
}
