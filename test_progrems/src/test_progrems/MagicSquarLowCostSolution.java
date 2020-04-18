/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class MagicSquarLowCostSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(formingMagicSquare(new int[][] {
			{4, 8, 2},
			{4, 5, 7},
			{6, 1, 6}
		}));
	}

	// Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {

    	// Possible cubes are 8 
    	int q[][] = 
    	    {
   	    		{6,1,8,7,5,3,2,9,4},
    	        {4,9,2,3,5,7,8,1,6},
    	        {4,3,8,9,5,1,2,7,6},
    	        {2,7,6,9,5,1,4,3,8},
    	        {8,3,4,1,5,9,6,7,2},
    	        {8,1,6,3,5,7,4,9,2},
    	        {2,9,4,7,5,3,6,1,8},
    	        {6,7,2,1,5,9,8,3,4},
    	    };
    	int max = Integer.MAX_VALUE;
    	
    	
    	for (int i = 0; i < 8; i++) {
    		int count = 0;
    		count = count + Math.abs(q[i][0] - s[0][0]);
    		count = count + Math.abs(q[i][1] - s[0][1]);
    		count = count + Math.abs(q[i][2] - s[0][2]);
    		count = count + Math.abs(q[i][3] - s[1][0]);
    		count = count + Math.abs(q[i][4] - s[1][1]);
    		count = count + Math.abs(q[i][5] - s[1][2]);
    		count = count + Math.abs(q[i][6] - s[2][0]);
    		count = count + Math.abs(q[i][7] - s[2][1]);
    		count = count + Math.abs(q[i][8] - s[2][2]);
    		
    		if(count < max)
    			max = count;
			
		}
    	
    	return max;
    }
	
	
}
