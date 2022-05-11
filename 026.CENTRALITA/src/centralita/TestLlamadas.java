package centralita;

import javax.swing.JOptionPane;

public class TestLlamadas {

	public static void main(String[] args) {
		Centralita centralita01= new Centralita(0, 0, null);
		Local local01=new Local("916254545", "915454754", 30);
		centralita01.registra(local01);
		Provincial provincial01=new Provincial("912345678", "921212121", 20, 1);
		centralita01.registra(provincial01);
		JOptionPane.showMessageDialog(null, provincial01);
		
		
	}

}
