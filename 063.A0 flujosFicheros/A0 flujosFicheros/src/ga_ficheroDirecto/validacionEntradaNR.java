/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_ficheroDirecto;

class validacionEntradaNR extends validacionEntradaNP {

	public validacionEntradaNR(long rMax) {
		super("Número de registro no válido: [0-" + rMax + "]");
	}
}
