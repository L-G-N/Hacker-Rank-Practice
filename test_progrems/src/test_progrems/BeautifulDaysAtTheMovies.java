/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class BeautifulDaysAtTheMovies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(beautifulDays(20, 23, 6));
	}

	// Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int count = 0;

        for(int l = i; l<=j; l ++ ){
            if((l - revers(l))%k == 0){
                count++;
            }
        }

        return count;
    }

    public static int revers(int a){
        int reversedA = 0;
        while(a != 0){
            int reminder = a % 10;
            reversedA = reversedA * 10 + reminder;
            a = a/10;
        }
        System.out.println("reversedA : "+reversedA);
        return reversedA;
    }
    
}
