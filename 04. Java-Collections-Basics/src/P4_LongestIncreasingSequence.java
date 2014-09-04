import java.util.Scanner;


public class P4_LongestIncreasingSequence {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		String input = scan.nextLine();
		String[] split = input.split(" ");
		int[] numbers = new int[split.length];
		int temp = 1;
		int sum = 1;
		int chosen = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(split[i]);
			
		}
		
		System.out.print(numbers[0] + " ");
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i-1]) {
				temp++;
				System.out.print(numbers[i] + " ");								
			}
			else {
				temp = 1;
				System.out.print("\n" + numbers[i] + " ");
			}
			if (temp > sum) {
				sum = temp;
				chosen = i;
				
			}
			
		}
		
		System.out.print("\nLongest: ");
		for (int i = 0; i < sum; i++) {
			System.out.print(numbers[chosen - sum + 1 + i] + " ");
		}
		
		

	}

}
