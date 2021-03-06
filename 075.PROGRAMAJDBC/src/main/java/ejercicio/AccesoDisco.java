package ejercicio;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AccesoDisco {
	private Map<Integer, Autor> hash = new HashMap<>();

	public void cargaFileTxt(String fileTxt) throws IOException, NombreAutorException {
		File f = new File(fileTxt);
		String linea;
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			linea = br.readLine();
			linea = br.readLine();
			while (linea != null) {
				Autor autor = new Autor(linea);
				hash.put(autor.getId(), autor);
				linea = br.readLine();
			}
		}
	}

	private String[] getColumnas(String file) throws IOException {
		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
			return br.readLine().split(",");
		}

	}

	public void creaDB(String db, String fileTxt) throws SQLException, IOException {
		try (Connection cnn = DriverManager.getConnection("jdbc:sqlite:" + db); Statement st = cnn.createStatement();) {
			String columna[] = getColumnas(fileTxt);
			String create = String.format("create table %s (" + "%s integer primary key autoincrement,"
					+ "%s varchar(30)," + "%s varchar(20)," + "%s text);", "autor", columna[0], columna[1], columna[2],
					columna[3]);
			// System.out.println(create);
			int n = st.executeUpdate(create);
			System.out.println(n);
		}
	}

	public void inserta(String db, String fileTxt) throws SQLException, IOException, NombreAutorException {
		/*
		 * cargaFileTxt(fileTxt); String insert =
		 * "insert into autor values (?, ?, ?, ?)"; // String query=
		 * "select * from autores"; try ( Connection cnn =
		 * DriverManager.getConnection("jdbc:sqlite:" + db); PreparedStatement st =
		 * cnn.prepareStatement(query ResultSet.TYPE_SCROLL_SENSITIVE,
		 * ResultSet.CONCUR_UPDATABLE); ResultSet rs= st.executeQuery();) { for
		 * (Entry<Integer, Autor> autor : hash.entrySet()) { // st.setInt(1,
		 * autor.getKey()); if (autor.getKey() < 0) st.setObject(1, null); else
		 * st.setInt(1, autor.getValue().getId()); st.setString(2,
		 * autor.getValue().getNombre()); st.setString(3,
		 * autor.getValue().getNacionalidad()); st.setString(4,
		 * autor.getValue().getBlog()); try { st.executeUpdate(); } catch (SQLException
		 * e) { System.out.println("repetido: " + autor.getKey()); }
		 * 
		 * } }
		 */
		String q = " INSERT INTO  autores ( " + "id" + "nombre" + "nacionalidad" + "blog" + ",ValorUnitario ) VALUES ( "
				+ "1" + ",'123' " + ",123" + ",'sa'" + ",1) ";
		// se ejecuta la consulta
		try {
			Connection cnn = DriverManager.getConnection("jdbc:sqlite:" + db);
			PreparedStatement pstm = cnn.prepareStatement(q);
			pstm.execute();
			pstm.close();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public void serializa(String db, String fSer) throws SQLException, IOException, NombreAutorException {
		String query = "select * from autor";
		try (Connection cnn = DriverManager.getConnection("jdbc:sqlite:" + db);
				PreparedStatement st = cnn.prepareStatement(query);
				ResultSet rs = st.executeQuery();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fSer))) {
			while (rs.next()) {
				Autor autor = new Autor(rs.getInt("id"), rs.getString(1), rs.getString(2), rs.getString(3));
				oos.writeObject(autor);
			}
		}

	}

	public void select(String db) throws SQLException, NombreAutorException {
		String query = "select * from autor";
		try (Connection cnn = DriverManager.getConnection("jdbc:sqlite:" + db);
				PreparedStatement st = cnn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = st.executeQuery();) {
			ResultSetMetaData rsmd = rs.getMetaData();
//			rsmd.getColumnName(1);
//			rs.getInt(1);
			while (rs.next()) {
				Autor autor = new Autor(rs.getInt("id"), rs.getString(2), rs.getString(3), rs.getString(4));
				System.out.println(autor);

			}
		}
	}

	public String leeFichero(String nombre) throws IOException {
		StringBuilder sb = new StringBuilder();
		String linea;
		try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
			linea = br.readLine();
			while (linea != null) {
				sb.append(linea);
				linea = br.readLine();
			}
		}
		return sb.toString();

	}

	public void leeJSON(String fiJSON) throws IOException, JSONException, NombreAutorException {
		String json = leeFichero(fiJSON);
		System.out.println(json);
		JSONArray listaAutores = new JSONArray(json);
		// Autor a1=Autor.getInstancia(listaAutores.get(0).toString());
		// Autor a2=Autor.getInstancia((JSONObject)listaAutores.get(0));
		// System.out.println(a1);
		// System.out.println(((JSONObject)listaAutores.get(0)).toString(2));
		for (Object object : listaAutores) {
			JSONObject ojson = (JSONObject) object;
			Autor a1 = Autor.getInstancia(ojson);
			JSONArray listaLibros = ojson.getJSONArray("libros");
			for (Object object2 : listaLibros) {
				System.out.println(((JSONObject) object2).toString(3));
			}

			// System.out.println(a1.toString());
		}
	}
}
