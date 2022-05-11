package za_flujos_object_menu;

public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer anho;
	
	public Fecha(Integer dia, Integer mes, Integer anho) throws FechaIncorrectaException{
		this.setAnho(anho);
		this.setMes(mes);
		
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) throws FechaIncorrectaException {
		if((mes==1 || mes==3 || mes==5|| mes==7|| mes==8||mes==10||mes==12)&&(dia<1 || dia>31)) {
			throw new FechaIncorrectaException();
		}else if((mes==4||mes==6||mes==9||mes==11)&&(dia<1||dia<30)){
			throw new FechaIncorrectaException();
		}
// continuar			
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) throws FechaIncorrectaException {
		if(mes<1 || mes>12)
			throw new FechaIncorrectaException();
		else
			this.mes = mes;
	}
	public Integer getAnho() {
		return anho;
	}
	public void setAnho(Integer anho) throws FechaIncorrectaException {
		if(anho<2000 || anho>2022)
			throw new FechaIncorrectaException();
		else
			this.anho=anho;
		
	}
	
	

}
