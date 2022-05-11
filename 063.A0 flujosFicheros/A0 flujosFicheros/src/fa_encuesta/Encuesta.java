package fa_encuesta;

import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Encuesta implements Constantes {

	/**
	 * Crea el archivo con los éxitos. Consecutivos desde el uno a un valor
	 * @throws IOException
	 */
	public void creaExitos() throws IOException {
		Exito exito;
		Random r= new Random();
		ExitoAccesoDatos gestion = new ExitoAccesoDatos('w');
		for (int e = 0; e < NEXITOS; e++){
			int n= e + 1; // * 2 + 1;
			exito = new Exito(n, "Título Álbum " + n);
			gestion.grabaRegistro(exito);
		}
		gestion.cierra();
	}
	/**
	 * Recorridos secuenciales completo de un archivo
	 */
	// Listado lista
	public void listadoSimpleExitos01() throws IOException {
		ExitoAccesoDatos gestion = null;
		List <Exito> listaExitos;
		gestion = new ExitoAccesoDatos('r');
		listaExitos = gestion.lee();
		for (Exito exito : listaExitos) {
			System.out.println(exito);
		}
		//gestion.cierra();
	}
	// Listado el Map
	public void listadoSimpleExitos02() throws IOException {
		ExitoAccesoDatos gestion = null;
		Map <Integer, Exito> listaExitos;
		gestion = new ExitoAccesoDatos('r');
		listaExitos = gestion.leeMap();
		for (Exito e : listaExitos.values()) {
			System.out.println(e);
		}
		System.out.println(listaExitos);
		//gestion.cierra();
	}
	// Listado el Map. Usando for
	public void listadoSimpleExitosOrdenPopularidad() throws IOException {
		ExitoAccesoDatos gestion = null;
		List <Exito> listaExitos;
		gestion = new ExitoAccesoDatos('r');
		listaExitos = gestion.lee();
		Collections.sort(listaExitos, new ComparadorVotosObtenidos());
		for (Exito e : listaExitos) {
			System.out.println(e);
		}
		System.out.println(listaExitos);
		//gestion.cierra();
	}
	// Lista el fichero
	public void listadoSimpleExitos() {
		ExitoAccesoDatos gestion = null;
		Exito e = null;
		boolean fF = false;
		try {
			gestion = new ExitoAccesoDatos('r');
			e = gestion.leeRegistro();
			while (!fF) {
				System.out.println(e);
				e = gestion.leeRegistro();
			}
		} catch (EOFException end) {
			fF = true;
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				if (gestion != null)
					gestion.cierra();
			} catch (IOException ex) {
			}
		}
	}

	/**  
	 * Crea el fichero de encuestados
	 */
	public void creaEncuestados() {
		// Debería introducirse porteclado
		Persona[] encuestado = { 
				new Persona(1, "Uno", 18, 'H', new int[] { 5, 2, 3 }),
				new Persona(3, "Dos", 18, 'M', new int[] { 3, 4, 5 }), 
				new Persona(5, "Tres", 19, 'H', new int[] { 5, 6, 7 }),
				new Persona(7, "Cuatro", 19, 'M', new int[] { 7, 8, 9 }),
				new Persona(9, "Cinco", 20, 'M', new int[] { 1, 2, 3 }), 
				new Persona(11, "Seis", 20, 'H', new int[] { 3, 4, 5 }),
				new Persona(14, "Siete", 21, 'M', new int[] { 5, 6, 7 }),
				new Persona(16, "Ocho", 21, 'M', new int[] { 7, 8, 9 }),
				new Persona(18, "Nueve", 18, 'H', new int[] { 3, 4, 5 }),
				new Persona(20, "Diez", 21, 'M', new int[] { 9, 4, 1 }), 
				new Persona(21, "Once", 18, 'H', new int[] { 4, 1, 6 }),
				new Persona(23, "Doce", 25, 'M', new int[] { 3, 4, 2 }),
				new Persona(25, "Trece", 22, 'M', new int[] { 7, 3, 5 }),
				new Persona(27, "Catorce", 21, 'M', new int[] { 3, 2, 5 }),
				new Persona(29, "Quince", 20, 'H', new int[] { 8, 4, 9 }),
				new Persona(30, "Dieciseis", 18, 'M', new int[] { 7, 3, 1 }),
				new Persona(32, "Diecisiete", 19, 'H', new int[] { 9, 1, 3 }),
				new Persona(34, "Dieciocho", 21, 'H', new int[] { 2, 4, 1 }),
				new Persona(36, "Diecinueve", 21, 'M', new int[] { 1, 7, 6 }),
				new Persona(38, "Veinte", 18, 'M', new int[] { 3, 6, 5 }) };
		try {
			PersonaAccesoDatos gestion = new PersonaAccesoDatos('w');
			
			for (Persona p : encuestado)
				// Toma la información, array, teclado, archivo, ...
				// Validar los votos emitidos
				gestion.grabaRegistro(p);
			gestion.cierra();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Recorrido secuencial completo de un archivo
	 */
	public void listadoSimpleEncuestados() {
		PersonaAccesoDatos gestion = null;
		Persona p = null;
		boolean fF = false;
		try {
			gestion = new PersonaAccesoDatos('r');
			p = gestion.leeRegistro();
			while (!fF) {
				System.out.println(p);
				p = gestion.leeRegistro();
			}
		} catch (EOFException end) {
			fF = true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (gestion != null)
					gestion.cierra();
			} catch (IOException e) {
			}
		}
	}

	/**
	 * Proceso de los encuestados
	 */
	public void procesaEncuesta() throws IOException {
		// Leemos a un Map todo el fichero
		ExitoAccesoDatos gestionE = null;
		Map <Integer, Exito> listaExitos;
		gestionE = new ExitoAccesoDatos('r');
		listaExitos = gestionE.leeMap();
		PersonaAccesoDatos gestionP = null;
		Persona p = null;
		boolean fF = false;
		try {
			gestionP = new PersonaAccesoDatos('r');
			p = gestionP.leeRegistro();
			while (!fF) {
				for (int ve : p.getVotos())
					try{ // o si retorna null
						listaExitos.get(ve).incrementaVotos();
					}catch(NullPointerException e){
						
					}
				p = gestionP.leeRegistro();
			}
		} catch (EOFException end) {
			fF = true;
		} catch (IOException e) {
			throw new IOException();
		} finally {
			try {
				if (gestionP != null)
					gestionP.cierra();
			} catch (IOException e) {
			}
		}

		gestionE = new ExitoAccesoDatos('w');
		gestionE.graba(listaExitos.values());
		gestionE.cierra();
	}


	public static void main(String[] s) throws IOException {
		Encuesta encuesta = new Encuesta();
		encuesta.creaExitos();
		encuesta.creaEncuestados();
		//encuesta.listadoSimpleEncuestados();
		//encuesta.listadoSimpleExitos02();
		encuesta.procesaEncuesta();
		//encuesta.listadoSimpleExitos02();
		encuesta.listadoSimpleExitosOrdenPopularidad();
		ParticionPorCategorias.particiona();
	}
}
