/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 * 
 * 12:45:54PM -> 12:45:54
 * 12:45:54AM -> 00:45:54
 * 04:45:54PM -> 16:45:54
 *  *
 */
public class StringHour12to24HourChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String output = get24Hour("12:45:54PM");
		System.out.println(output);
	}

	private static String get24Hour(String input) {
		String hour12 = "12";
		String hour00 = "00";
		String AM = "AM";
		String PM = "PM";
		String empty = "";
		String colon = ":";

		if (input.contains(AM) && !input.startsWith(hour12)) {
			return input.replace(AM, empty);
		} 
		else if (input.contains(AM) && input.startsWith(hour12)) {
			input = input.replace(AM, empty);
			return input.replaceFirst(hour12, hour00);
		} 
		else if (input.contains(PM) && input.startsWith(hour12)) {
			return input.replace(PM, empty);
		} 
		else {
			input = input.replace(PM, empty);
			int hour24 = 0;

			// extract the hour from the string
			String hour = input.split(colon)[0];

			// check am or pm and update number to the hour
			hour24 = Integer.parseInt(hour) + 12;

			// append the updated hour and replace in hour string
			input = input.replaceFirst(hour, hour24 + empty);

			// return
			return input;
		}
	}

}
