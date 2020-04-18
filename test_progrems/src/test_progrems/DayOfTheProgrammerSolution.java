/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 * Complete the dayOfProgrammer function in the editor below. It should return a string representing the date of the
 * 256th day of the year given.
 * dayOfProgrammer has the following parameter(s):
 * input:   year: an integer
 */
public class DayOfTheProgrammerSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
    	String leapYerDate = "12.09.";
    	String nonLeapYearDate = "13.09.";
    	
    	
    	// 1. less than 1918
    	if (year < 1918){
    		if(year % 4 == 0) {
    			return leapYerDate+year;
    		}else {
    			return nonLeapYearDate+year;
    		}
    	}
    	// 2. equals 1918 - for this year 13 days shortage on calendar changes
    	else if (year == 1918){
    		return "26.09."+year;
    	}
    	
    	// after 1918
    	else {
	    	if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
	            return leapYerDate+year;
	        }
	        else {
	            return nonLeapYearDate+year;
	        }
    	}

    }
}
