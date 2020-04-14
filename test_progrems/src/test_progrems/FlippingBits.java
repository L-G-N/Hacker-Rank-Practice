/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 * input:
 * 2147483647, 1, 0
 *
 * output :
 * 2147483648, 4294967294, 4294967295
 *
 */
public class FlippingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(flippingBits(-2147483647L));

	}

	static long flippingBits(long n) {
		
		n = ~n;

		n = n & 0xffffffffL;

		return n;
	}

}
