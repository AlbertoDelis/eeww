package main;

import java.sql.Statement;

public class Main {
	public static void consulta() {
		String sql="select*from autores;";
		try(Statement st=DBC.getConexion().createStatement();
			ResultSet rs=st.executeQuery(sql)){
			
		}
	}
	
	public static void creaBD() {
		String
	}

	

}
