package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Ejemplo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		String url = "jdbc:mariadb://localhost:3306/"; // no hace falta el puerto 3306 que es el por defecto
//		String bd = "bd_empresa";
//		String user = "root";
//		String password = "";
		try {
			Properties prop=new Properties();
			prop.load(new FileInputStream("conexion.props")); //capturar exceptions
			String url=prop.getProperty("url");
			String bd=prop.getProperty("bd");
			Connection dbc = DriverManager.getConnection(url + bd, prop);
//			Connection dbc = DriverManager.getConnection(url + bd, user, password);
			System.out.println("Conectado!!!");
			dbc.close();
		} catch (SQLException e) {
			// System.out.println(e.get); // Cualquier e.get
			e.printStackTrace();
		}
	}
}
