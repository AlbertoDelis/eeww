package ejemplo;
// POJO

public class Ejemplo {
	private int prop1;
	private String pro2;
	
	public Ejemplo() {
		
	}
	
	public Ejemplo(int prop1, String pro2) {
		super();
		this.prop1 = prop1;
		this.pro2 = pro2;
	}

	public int getProp1() {
		return prop1;
	}

	public void setProp1(int prop1) {
		this.prop1 = prop1;
	}

	public String getPro2() {
		return pro2;
	}

	public void setPro2(String pro2) {
		this.pro2 = pro2;
	}

	@Override
	public String toString() {
		return "Ejemplo [prop1=" + prop1 + ", pro2=" + pro2 + "]";
	}
	
	
	

}
