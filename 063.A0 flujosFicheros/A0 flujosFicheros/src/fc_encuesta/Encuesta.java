package fc_encuesta;

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
		DAOExito gestion = new DAOExito(EXITOS, false);
		for (int e = 0; e < NEXITOS; e++){
			int n= e + 1; // * 2 + 1;
			exito = new Exito(n, "Título Álbum " + n, new Fecha(n, n, 2015));
			gestion.grabaRegistro(exito);
		}
		gestion.close();
	}
	/**
	 * Recorridos secuenciales completo de un archivo
	 * @throws ClassNotFoundException 
	 */	
	// Lista el fichero
	public void listadoSimpleExitos() throws ClassNotFoundException {
		Exito e = null;
		boolean fF = false;
		try (DAOExito gestion = new DAOExito(EXITOS);){
			//e = gestion.leeRegistro();
			while (!fF) {
				e = gestion.leeRegistro();
				System.out.println(e);
			}
		} catch (EOFException end) {
			fF = true;
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	// Listado lista
	public void listadoSimpleExitos01() throws IOException, ClassNotFoundException {
		DAOExito gestion = null;
		List <Exito> listaExitos;
		gestion = new DAOExito(EXITOS);
		listaExitos = gestion.lee();
		for (Exito exito : listaExitos) {
			System.out.println(exito);
		}
		//gestion.cierra();
	}
	// Listado el Map
	public void listadoSimpleExitos02() throws IOException, ClassNotFoundException {
		DAOExito gestion = null;
		Map <Integer, Exito> listaExitos;
		gestion = new DAOExito(EXITOS);
		listaExitos = gestion.leeMap();
		for (Exito e : listaExitos.values()) {
			System.out.println(e);
		}
		System.out.println(listaExitos);
		//gestion.cierra();
	}
	// Listado el Map. Usando for
	public void listadoSimpleExitosOrdenPopularidad() throws IOException, ClassNotFoundException {
		DAOExito gestion = null;
		List <Exito> listaExitos;
		gestion = new DAOExito(EXITOS);
		listaExitos = gestion.lee();
		Collections.sort(listaExitos, new ComparadorVotosObtenidos());
		for (Exito e : listaExitos) {
			System.out.println(e);
		}
		System.out.println(listaExitos);
		//gestion.cierra();
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
		try (DAOPersona gestion = new DAOPersona(ENCUESTADOS, false);){
			
			for (Persona p : encuestado)
				// Toma la información, array, teclado, archivo, ...
				// Validar los votos emitidos
				gestion.grabaRegistro(p);
			//gestion.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Recorrido secuencial completo de un archivo
	 */
	public void listadoSimpleEncuestados() {
		Persona p = null;
		boolean fF = false;
		try (DAOPersona gestion = new DAOPersona(ENCUESTADOS);){
			p = gestion.leeRegistro();
			while (!fF) {
				System.out.println(p);
				p = gestion.leeRegistro();
			}
		} catch (EOFException end) {
			fF = true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Proceso de los encuestados
	 * @throws ClassNotFoundException 
	 */
	public void procesaEncuesta() throws IOException, ClassNotFoundException {
		// Leemos a un Map todo el fichero
		Map <Integer, Exito> listaExitos= null;
		Persona p = null;
		boolean fF = false;
		
		try (DAOPersona gestionP = new DAOPersona(ENCUESTADOS);
			DAOExito gestionE= new DAOExito(EXITOS);){
			listaExitos = gestionE.leeMap();
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
		}
		DAOExito gestionE = new DAOExito(ENCUESTADOS, false);
		gestionE.graba(listaExitos.values());
		gestionE.close();
	}


	public static void main(String[] s) throws IOException, ClassNotFoundException {
		Encuesta encuesta = new Encuesta();
		encuesta.creaExitos();
		encuesta.listadoSimpleExitos();
		//encuesta.creaEncuestados();
		//encuesta.listadoSimpleEncuestados();
		//encuesta.listadoSimpleExitos02();
		//encuesta.procesaEncuesta();
		//encuesta.listadoSimpleExitos02();
		//encuesta.listadoSimpleExitosOrdenPopularidad();
		//ParticionPorCategorias.particiona();
	}
}
