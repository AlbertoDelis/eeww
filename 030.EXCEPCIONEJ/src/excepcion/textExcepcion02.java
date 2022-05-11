package excepcion;

	public class textExcepcion02 {
		public static void main(String[]args){
			int i = 0;
			String saludos = {"Hola mundo!"+ "este es el segundo mensaje","y este el tercero"};
			while (i<4){
				try {
					System.out.println(saludos[i]);
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println(“Te pasaste...”);
				}finally {
					System.out.println(“Siempre toca”);
				}
				i++;
			}
		}
	}
