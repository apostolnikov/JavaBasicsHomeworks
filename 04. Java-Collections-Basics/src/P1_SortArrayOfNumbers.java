import java.util.Arrays;
import java.util.Scanner;


public class P1_SortArrayOfNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers will you enter:");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter them:");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();			
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}
