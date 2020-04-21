/**
 * 
 */
package test_progrems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author logendran.kandasamy
 *
 */
public class ClimbingTheLeaderboardSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] result = climbingLeaderboard(new int[] {100, 100, 50, 40, 40, 20, 10}, new int[] {5, 25, 50, 120});
		System.out.println(Arrays.toString(result));
	}
	
	 static int[] climbingLeaderboard(int[] scores, int[] alice) {
	        int[] aliceRank = new int[alice.length];

	        List<Integer> scoreRank = new ArrayList<>();
	        
	        for(int i=0; i<scores.length; i++){
	            if(!scoreRank.contains(scores[i])){
	                scoreRank.add(scores[i]);
	            }
	        }
	        
	        for(int i=0; i<alice.length; i++){
	            int rank = 0;
	            for(int j=0; j<scoreRank.size(); j++){
	                if(scoreRank.get(j) <= alice[i]){
	                    rank = j+1;
	                    break;
	                }
	            }
	            if(rank == 0){
	                rank = scoreRank.size() + 1;
	            }
	            aliceRank[i] = rank;
	        }

	        return aliceRank;
	    }

}
