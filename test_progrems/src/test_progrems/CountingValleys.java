/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class CountingValleys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(countingValleys(8, "UDDDUDUU"));

	}

	static int countingValleys(int n, String s) {
		int valleysCount = 0;
		int seaLevel = 0;
		boolean enterValley = false;
		boolean exitValley = false;
		// iterating the steps walked
		for (int i = 0; i < n; i++) {

			// U up means climbing up +ve number
			if (s.charAt(i) == 'U') {
				seaLevel = seaLevel + 1;
			}

			// D down means going down -ve number
			else if (s.charAt(i) == 'D') {
				seaLevel = seaLevel - 1;
			}

			// check gray entered valley
			if (seaLevel < 0) {
				enterValley = true;
			}

			// check gray exit valley
			if (enterValley && seaLevel == 0) {
				exitValley = true;
			}

			// check gray crossed valley
			if (enterValley && exitValley) {
				++valleysCount;
				enterValley = false;
				exitValley = false;
			}
		}

		return valleysCount;
	}

	static int countingValleysFaster(int n, String s) {

		int valleyCounter = 0, altitude = 0;

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			// gray can't cross a valley without Up claiming
			if (ch == 'U') {
				altitude++;
				if (altitude == 0) {
					valleyCounter++;
				}

			} else {

				altitude--;
			}
		}
		return valleyCounter;
	}

}
