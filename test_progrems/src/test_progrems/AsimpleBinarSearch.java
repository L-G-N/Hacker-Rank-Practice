/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class AsimpleBinarSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(binarSearch(new int[] {100, 95, 80, 75, 60, 55, 53, 51, 40, 
				33, 28, 21, 19, 17, 14, 11, 8, 1}, 95));

	}

	public static int binarSearch(int[] array, int value) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			
			int mid = low + (high - low) / 2;
			
			System.out.println( "mid : "+mid +" -  value : "+array[mid] );
			
			if(array[mid] == value) {
				System.out.println( "return mid : "+mid );
				return mid;
			}

			else if (array[mid] > value) {
				System.out.println( "mid : "+mid +" -  value : "+array[mid] +" - high : "+high );
				low = mid + 1 ;
			}

			else if (array[mid] < value) {
				System.out.println( "mid : "+mid +" -  value : "+array[mid] +" - low : "+low );
				high = mid -1;
			}
		}
		
		return 0;
	}
}
