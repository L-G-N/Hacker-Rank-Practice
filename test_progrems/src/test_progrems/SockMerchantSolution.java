/**
 * 
 */
package test_progrems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author logendran.kandasamy
 *
 */
public class SockMerchantSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(sockMerchant(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 }));
		System.out.println(sockMerchantFaster(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 }));

	}

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> pairs = new HashMap<>();
		int pairsCount = 0;
		// finding the pairs and adding to hash map
		for (int i = 0; i < ar.length; i++) {
			if (pairs.get(ar[i]) == null) {
				pairs.put(ar[i], 1);
			} else {
				pairs.put(ar[i], pairs.get(ar[i]) + 1);
			}
		}

		// finding the number of pairs
		for (Entry<Integer, Integer> entry : pairs.entrySet()) {
			if (entry.getValue() > 1) {
				pairsCount = pairsCount + entry.getValue() / 2;
			}
		}

		return pairsCount;
	}
	
	// Complete the sockMerchant function below.
		static int sockMerchantFaster(int n, int[] ar) {

			Set<Integer> stack = new HashSet<>();
			int count = 0;
			
			for (int i = 0; i < ar.length; i++) {
				if(stack.contains(ar[i])) {
					stack.remove(ar[i]);
					++count;
				}
				else {
					stack.add(ar[i]);
				}
			}
			
			return count;
		}


}
