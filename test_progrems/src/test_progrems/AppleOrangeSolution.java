/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 * 
 * 
 * Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.

countApplesAndOranges has the following parameter(s):

    s: integer, starting point of Sam's house location.
    t: integer, ending location of Sam's house location.
    a: integer, location of the Apple tree.
    b: integer, location of the Orange tree.
    apples: integer array, distances at which each apple falls from the tree.
    oranges: integer array, distances at which each orange falls from the tree.

 *
 */
public class AppleOrangeSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countApplesAndOranges(7, 11, 5, 15, new int[] { -2, 2, 1 }, new int[] { 5, -6 });

	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int applesZoneFallen = 0;
		int orangeZoneFallen = 0;

		// scenario a---(apples)---s-<apples,oranges>--t----(Oranges)----b

		// formula s < a+ apples, d+oranges > t

		for (int i = 0; i < apples.length; i++) {
			int appleFallenPoint = a + apples[i];
			if (s <= appleFallenPoint && appleFallenPoint <= t) {
				++applesZoneFallen;
			}
		}

		for (int i = 0; i < oranges.length; i++) {
			int orangeFallenPoint = b + oranges[i];
			if (s <= orangeFallenPoint && orangeFallenPoint <= t) {
				++orangeZoneFallen;
			}
		}

		System.out.println(applesZoneFallen);
		System.out.println(orangeZoneFallen);

	}

}
