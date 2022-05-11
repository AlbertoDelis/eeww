package hotel;
/*

10.13. Se desea hacer la gestión de las habitaciones de un hotel. Todas las habitaciones tienen un
número de habitación y un proceso de check-in y check-out. En el hotel hay estas habitaciones:
1) 3 habitaciones Lowcost (cuesta 50 euros/dia todo el año).
2) 10 habitaciones dobles. Tienen una tarifa normal de 100 euros/dia y un incremento del
20% si el día de salida es abril, julio o agosto.
3) 5 habitaciones Suite. 200 euros/día con 20% de descuento para estancias de 10 o más
días.
• El programa inicialmente meterá las 18 habitaciones en un ArrayList y las marcará como “no
ocupadas”.
• El programa tendrá un menú para hacer check-in entre las habitaciones libres, check-out
entre las ocupadas y listar habitaciones libres y ocupadas.
• El check-in es común para todas las habitaciones, consiste en marcar la habitación como
ocupada.
• El check-out consiste en marcar la habitación como libre y calcular el importe a pagar en
función de los días de estancia (quizás sea necesario almacenar la fecha de llegada en el
momento del check-in)
• Mantener toda la información en las clases más que en el programa que las utiliza.
• Sugerencia: Para probar el programa, al hacer el check-out, puedes considerar cada día
como un segundo, para que los datos sean más reales, así han pasado 3 segundos,
considerar 3 días.
• La superclase Habitacion debe tener: public abstract double checkOut ();
Cuestión 1: ¿Es útil que el método checkOut sea abstracto o los tres tipos de habitación podrían
compartir un código común?
Cuestión 2: ¿Es útil que el método toString() en la clase Habitacion?
Puedes crear una clase Hotel, que tendrá un ArrayList de Habitaciones, o bien definir
ese ArrayList en el programa como variable global y no tener la clase Hotel. 
*/
