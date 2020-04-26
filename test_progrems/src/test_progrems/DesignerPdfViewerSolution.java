/**
 * 
 */
package test_progrems;

/**
 * @author logendran.kandasamy
 *
 */
public class DesignerPdfViewerSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String word = "zaba";
		int[] h = new int[] {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
		System.out.println(designerPdfViewer(h, word));
	}
	
	 static int designerPdfViewer(int[] h, String word) {

	        // get small alphabets in a line to the hiegh of the word
	        // asci values 97 - a to 122 - z 

	        int largeHightLetter = Integer.MIN_VALUE;
	        
	        for(int i=0; i<word.length(); i++) {
	        	int asci = word.charAt(i);
	        	int hight = h[asci - 97];
	        	if(largeHightLetter < hight)
	        		largeHightLetter = hight;
	        }

	        return largeHightLetter*word.length();
	    }

}
