package agenda;

public class GestionAgenda {
	static public void menu() {
		Agenda2 agenda = new Agenda2();
		alta();
		
		agenda.consulta("Antonio");
		Amigo a = agenda.consulta("Antonio");
		if (a != null)
			visualiza(a);

	}

	static void visualiza(Amigo amigo) {
		System.out.println(amigo);
	}

	public static void main(String[] args) {

	}

}
