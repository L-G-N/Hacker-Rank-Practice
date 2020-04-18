/**
 * 
 */
package test_progrems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author logendran.kandasamy
 *
 */
public class BirthdayChocolateSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(birthday(s, 3, 2));

	}
	
	 // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	int result = 0;
        int sum=0;
        for(int i=0;i<s.size()-(m-1);i++){
            for(int j=i;j<i+(m);j++){
                sum+=s.get(j);
               System.out.println("Sum -"+sum+" m-"+m+" j-"+j +" i+(m-1)- "+(i+(m)));
            }
            if(sum==d ){
                result++;
            }
            sum=0;
           
        }
        return result;
    }

}
