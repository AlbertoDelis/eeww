package conexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBC {
	private Connection dbc;
	public DBC() throws FileNotFoundException, IOException {
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
