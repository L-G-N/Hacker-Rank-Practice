/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class GanagarooJumpingSoulution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(kangaroo(0, 2, 5, 3));

	}
	
	 static String kangaroo(int x1, int v1, int x2, int v2) {
		 
//		 for (int i = 0; i < 100; i++) {
//			 if(x1+v1 == x2+v2) {
//				 return "YES";
//			 }
//			 
//			 x1 = x1 + v1;
//			 x2 = x2 + v2;
//		}
		 
		 
/* 
 * Formula creation basic v=d/t (velocity = distance / time)
 * here v = d / j (velocity = distance / jump)
 * 		d = vj
 * 	applying this in our values
 * 		d = vj + x (starting point distance)
 * 		d1 = v1j + x1
 * 		d2 = v2j + x2
 * the solution point is d1 = d2
 * hence 	v1j + x1 = v2j + x2
 * 			x1 - x2 = v2j - v1j
 * 			x1 - x2 = j(v2 - v1)
 * 			x1 - x2
 * 			------- = j
 * 			v2 - v1
 * mathematically j should be integer not a float value.
 * to achieve as a integer the modular of (x1-x2)/(v2-v1) should be 0
 *  
 */

			 if(v1 > v2 ) {
				 int reminder = (x1-x2) % (v2-v1);
				 if(reminder == 0)
					 return "YES";
			 }
	        return "NO";
	    }

}
