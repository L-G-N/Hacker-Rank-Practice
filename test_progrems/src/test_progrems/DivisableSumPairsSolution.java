/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class DivisableSumPairsSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(divisibleSumPairs(6, 3, new int[] {1, 3, 2, 6, 1, 2}));

	}

	
	 static int divisibleSumPairs(int n, int k, int[] ar) {

	        int count = 0;

	        for (int i=0; i < n; i++){
	            if(i != n) {
		            for (int j = i; j < n-1; j++){
		                if((ar[i]+ar[j+1])%k == 0){
		                    ++count;
		                }
		            }
	            }
	        
	        }

	        return count;

	    }
}
