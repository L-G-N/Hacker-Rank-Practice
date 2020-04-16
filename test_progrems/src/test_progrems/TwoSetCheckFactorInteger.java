/**
 * 
 */
package test_progrems;

import java.util.List;

/**
 * @author logendran.kandasamy
 * 
 * Need to spend time on understanding
 *
 */
public class TwoSetCheckFactorInteger {

	public static void main(String[] args) {

	}

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	static int getTotalX(List<Integer> a, List<Integer> b) {
		boolean var, var2;
		int i;
		int j;
		int m = 0;
		for (i = a.get(a.size() - 1); i <= b.get(0); i++) {
			var = false;
			for (j = 0; j < a.size(); j++) {
				if (i % a.get(j) == 0) {
					var = true;
				} else {
					var = false;
					break;
				}
			}
			if (var == true) {
				var2 = false;
				for (int k = 0; k < b.size(); k++) {
					if (b.get(k) % i == 0) {
						var2 = true;
					} else {
						var2 = false;
						break;
					}

				}
				if (var2 == true) {
					m++;
				}
			}
		}
		return m;
	}
}
