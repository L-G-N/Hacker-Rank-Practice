/**
 * 
 */
package test_progrems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author logendran.kandasamy
 *
 */
public class PickingNumbersSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));

	}

	// input size 2-100 and list value 0-100
	public static int pickingNumbers(List<Integer> a) {

		int maxValue = 0;
		int[] countArray = new int[Collections.max(a)+1];

		// iterate over given lit
		for (int i = 0; i < a.size(); i++) {
			countArray[a.get(i)]++;
		}
		
		// System.out.println(Arrays.toString(countArray));
		
		for (int i = 0; i < countArray.length-1; i++) {
			 int count = countArray[i] + countArray[i+1];
			if(count > maxValue) {
				maxValue = count;
			}
		}
		
		return maxValue;
	}
}
