/**
 * 
 */
package test_progrems;

import java.util.Arrays;
import java.util.List;

/**
 * @author logendran.kandasamy
 *
 */
public class BonAppétitSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> bill = Arrays.asList(3, 10, 2, 9);
		int k = 1; // anna's Excluded food bill index
		int b = 12; // total share shared by anna
		bonAppetit(bill, k, b);
	}

	// Complete the bonAppetit function below.
	static void bonAppetit(List<Integer> bill, int k, int b) {

		// add all bill amount
		Integer sumOfBill = bill.stream().reduce(0, Integer::sum);

		// remove the anna's excloded food bill
		sumOfBill = sumOfBill - bill.get(k);

		// anna's share for the food
		Integer share = sumOfBill / 2;

		if (share == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - share);
		}

	}

}
