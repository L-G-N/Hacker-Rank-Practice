/**
 * 
 */
package test_progrems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author logendran.kandasamy
 *
 */
public class MigoratoryBirds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> migratoryBirds = new ArrayList<>();
		//1 2 3 4 5 4 3 2 1 3 4
		migratoryBirds.add(1);
		migratoryBirds.add(2);
		migratoryBirds.add(3);
		migratoryBirds.add(4);
		migratoryBirds.add(5);
		migratoryBirds.add(4);
		migratoryBirds.add(3);
		migratoryBirds.add(2);
		migratoryBirds.add(1);
		migratoryBirds.add(3);
		migratoryBirds.add(4);
		migratoryBirds.add(1);
		System.out.println(migratoryBirdsFaster(migratoryBirds));

	}

	// own method which have more time complexity and looping.
	static int migratoryBirds(List<Integer> arr) {

	      SortedSet<Integer> sigtingListIndex = new TreeSet<>(); 
	       List<Integer> duplicateBirdIndex = new ArrayList<>();
	        int oldSightingCount = 0;        

	        for(int i=0; i<arr.size(); i++){
	        	if(!duplicateBirdIndex.contains(arr.get(i))) {
		            int newSightingCount = 1;
		            if(i != arr.size()){
		                for(int j=i+1; j< arr.size() ; j++){
		                    if(arr.get(i)==arr.get(j))
		                        ++newSightingCount;
		                }
		            }
		            if(oldSightingCount < newSightingCount){
		                sigtingListIndex = new TreeSet<>(); 
		                sigtingListIndex.add(arr.get(i));
		                oldSightingCount = newSightingCount;
		                duplicateBirdIndex.add(arr.get(i));
		            }
		            else if(oldSightingCount == newSightingCount){
		                sigtingListIndex.add(arr.get(i));
		            }
	        	}
	        }
	        
	        return sigtingListIndex.first();
    }
	
	// get it from Internet for quick operation
	static int migratoryBirdsFaster(List<Integer> arr) {
		
		// starting the max value is 0
		int max = 0;
		
		// creating count array to store the sighted counts
		int[] countArray = new int[3 << 1];
		
		System.out.println("Starting : "+Arrays.toString(countArray));
		
		for (int value : arr) {
			countArray[value]++;
			System.out.println(Arrays.toString(countArray));
			max = Math.max(max, countArray[value]);
			System.out.println("Max : "+max);
			
		}
		
		for (int i = 0; i < countArray.length; i++) {
			if(countArray[i] == max)
				return i;
		}
		
		return 0;
	}
}
