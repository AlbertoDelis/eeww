/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gb_ficheroDirectoMenu;

class ValidacionEntradaNR extends ValidacionEntradaNP {

	public ValidacionEntradaNR(long rMax) {
		super("Número de registro no válido: [0-" + rMax + "]");
	}
}
