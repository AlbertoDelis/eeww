package ejercicio;

import java.io.IOException;
import java.sql.SQLException;

public class Gestion {
    public static void main(String[] args) {
//		Autor a= new Autor()
//				.setId(1);
//				.setNombre("kjlkjljlk");
        AccesoDisco ad = new AccesoDisco();
        try {
            ad.creaDB("libreria1.ej", "autores.csv");
            ad.inserta("libreria1.sqlite", "autores.csv");
//			ad.leeJSON("libreria_dos.json");
//			ad.toJSON(db: "libreria1.sqlite", json: "libreria_dos_x.json");
        } catch (SQLException | IOException | NombreAutorException e) {
            throw new RuntimeException(e);
        }
//		try {
//			System.out.println(ad.cargaFileTxt("autores.csv"));
//			System.out.println(ad.cargaFileTxt("autores.csv"));
//			ad.creaDB("libreria1.sqlite", "autores.csv");
//			ad.inserta("libreria1.sqlite", "autores.csv");
//			ad.serializa("libreria1.sqlite", "autores.csv");
//			ad.select("libreria1.sqlite");

//		} catch (IOException | SQLException e) {
//			e.printStackTrace();
//		}
    }
}
