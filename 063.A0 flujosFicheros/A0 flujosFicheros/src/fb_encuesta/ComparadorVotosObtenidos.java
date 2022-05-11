package fb_encuesta;

import java.util.Comparator;

public class ComparadorVotosObtenidos implements Comparator<Exito> {

	@Override
	public int compare(Exito o1, Exito o2) {
		return o2.getVotos() - o1.getVotos();
	}

}
