/**
 * 
 */
package appli;

/**
 * @author emile
 *
 */

public class CalculMath {

	/**
	 * Calcule la factorielle d'une entier
	 * @param val l'entier
	 * @return la factorielle
	 */
	public int fac(int val) {
		int result = 1;
		for (int k = val; k > 0; k--) {
			result *= k;
		}
		return result;
	}

}
