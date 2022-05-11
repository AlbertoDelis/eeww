package fb_encuesta;

import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

public class ParticionPorCategorias implements Constantes{
	static public boolean primerVoto(int voto, List<Exito> exitos){
		boolean entreLosPrimeros= false;
		int n= 0;
		while(!entreLosPrimeros && n < ENTREPRIMEROS)
			if(voto == exitos.get(n).getNumero())
				entreLosPrimeros= true;
			else
				n++;
		return entreLosPrimeros;
	}
	static public void particiona() throws IOException {
		PrintWriter mMenor20= null;
		PrintWriter mMayor20= null;
		PrintWriter hMenor20= null;
		PrintWriter hMayor20= null;
		// leer exitos ordenados
		ExitoAccesoDatos gestionE = null;
		List <Exito> listaExitos;
		gestionE = new ExitoAccesoDatos(false);
		listaExitos = gestionE.lee();
		Collections.sort(listaExitos, new ComparadorVotosObtenidos());
		PersonaAccesoDatos gestion = null;
		Persona p = null;
		boolean fF = false;
		try {
			mMayor20 = new PrintWriter("mmayor20.txt");
			mMenor20 = new PrintWriter("mmenor20.txt");
			hMayor20 = new PrintWriter("hmayor20.txt");
			hMenor20 = new PrintWriter("hmenor20.txt");
			gestion = new PersonaAccesoDatos('r');
			p = gestion.leeRegistro();
			while (!fF) {
				boolean primero = primerVoto(p.getVotos()[0], listaExitos);
				if (primero) {
					switch (p.getSexo()) {
					case 'm':
					case 'M':
						if (p.getEdad() >= 20)
							mMayor20.print(p);
						else
							mMenor20.print(p);
						break;
					case 'h':
					case 'H':
						if (p.getEdad() >= 20)
							hMayor20.print(p);
						else
							hMenor20.print(p);
					}
				}
				p = gestion.leeRegistro();
			}
		} catch (EOFException end) {
			fF = true;
		} catch (IOException e) {
			throw new IOException();
		} finally {
				gestion.cierra();
				mMayor20.close();
				mMenor20.close();
				hMayor20.close();
				hMenor20.close();
		}
	}
}