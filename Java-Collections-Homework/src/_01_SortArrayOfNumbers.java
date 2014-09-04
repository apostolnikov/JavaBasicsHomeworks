import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
			
		}
		Arrays.sort(numbers);
		
		for (int number : numbers) {
			System.out.print(number+ " ");
		}
		
	}

}
