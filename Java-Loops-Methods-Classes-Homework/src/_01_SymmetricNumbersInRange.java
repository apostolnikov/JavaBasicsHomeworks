import java.util.Scanner;

public class _01_SymmetricNumbersInRange {
 
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int start = in.nextInt();
    	int end = in.nextInt();
    	in.close();
    	
    	for (int i = start; i <= end; i++) {
		     char[] arr = Integer.toString(i).toCharArray();
		     boolean symmetric = true;

		     for (int j = 0, m = 1; j < arr.length/2; j++, m++) {
		          if (symmetric) {
		        	  
		        	  if (arr[j] != arr[arr.length-m]) {
		        		  symmetric = false;
		        	  }
		          }
		      }

		     if (symmetric) {
			 System.out.print(i + " ");
		     }
		}
    	
    	
    	
    	
    }
 
}