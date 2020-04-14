/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class FindNoOfLargeIntInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandlesFail(int[] ar) {
		int count = 0;
		int largeNumber = Integer.MIN_VALUE;

		for (int i = 0; i < ar.length; i++) {

			if (largeNumber == ar[i]) {
				count = count + 1;
			}

			if (ar[i] > largeNumber) {
				count = 1;
				largeNumber = ar[i];
			}
		}

		return count;
	}

}
