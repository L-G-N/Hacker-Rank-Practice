/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class BreakingTheRecordSolution {

	public static void main(String[] args) {
		
		int[] resutl = breakingRecords(new int[] {10,5,20,20,4,5,2,25,1});
		
		System.out.println(resutl);
		
	}

	// Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int maxCount = 0;
        int minCount = 0;
        int maxScore = scores[0];
        int minScore = scores[0];

        for(int i=1; i < scores.length ; i++){
            // for max score record break
            if(maxScore < scores[i]){
                maxScore = scores[i];
                ++maxCount;
            }
            // for minimum score record break
            if(minScore > scores[i]){
                minScore = scores[i];
                ++minCount;
            }
        }

        return new int[]{maxCount,minCount};


    }
	
	
}
