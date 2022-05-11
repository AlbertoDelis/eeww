package hotel;
/*

10.13. Se desea hacer la gesti�n de las habitaciones de un hotel. Todas las habitaciones tienen un
n�mero de habitaci�n y un proceso de check-in y check-out. En el hotel hay estas habitaciones:
1) 3 habitaciones Lowcost (cuesta 50 euros/dia todo el a�o).
2) 10 habitaciones dobles. Tienen una tarifa normal de 100 euros/dia y un incremento del
20% si el d�a de salida es abril, julio o agosto.
3) 5 habitaciones Suite. 200 euros/d�a con 20% de descuento para estancias de 10 o m�s
d�as.
� El programa inicialmente meter� las 18 habitaciones en un ArrayList y las marcar� como �no
ocupadas�.
� El programa tendr� un men� para hacer check-in entre las habitaciones libres, check-out
entre las ocupadas y listar habitaciones libres y ocupadas.
� El check-in es com�n para todas las habitaciones, consiste en marcar la habitaci�n como
ocupada.
� El check-out consiste en marcar la habitaci�n como libre y calcular el importe a pagar en
funci�n de los d�as de estancia (quiz�s sea necesario almacenar la fecha de llegada en el
momento del check-in)
� Mantener toda la informaci�n en las clases m�s que en el programa que las utiliza.
� Sugerencia: Para probar el programa, al hacer el check-out, puedes considerar cada d�a
como un segundo, para que los datos sean m�s reales, as� han pasado 3 segundos,
considerar 3 d�as.
� La superclase Habitacion debe tener: public abstract double checkOut ();
Cuesti�n 1: �Es �til que el m�todo checkOut sea abstracto o los tres tipos de habitaci�n podr�an
compartir un c�digo com�n?
Cuesti�n 2: �Es �til que el m�todo toString() en la clase Habitacion?
Puedes crear una clase Hotel, que tendr� un ArrayList de Habitaciones, o bien definir
ese ArrayList en el programa como variable global y no tener la clase Hotel. 
*/
