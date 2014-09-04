import java.util.Scanner;


public class BiggestTriple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] numbers = input.split(" ");
		
		int index = 0;
		int maxSum = Integer.MIN_VALUE;
		int start = 0;
		
		while (index < numbers.length) {
			int num1 = Integer.parseInt(numbers[index]);
			
			int num2 = 0;
			if (index + 1 < numbers.length) {
				num2 = Integer.parseInt(numbers[index + 1]);
				
			}
			
			int num3 = 0;
			if (index + 2 < numbers.length) {
				num3 = Integer.parseInt(numbers[index + 2]);
				
			}
			
			int sum = num1 + num2 + num3;
			if (sum > maxSum) {
				maxSum = sum;
				start = index;
			}
			index +=3;
			
			
		}
		
		
		
		while (maxSum != 0) {
			System.out.print(numbers[start] + " ");
			maxSum = maxSum - Integer.parseInt(numbers[start]);
			start++;
			
		}
		
		
		
		
		

	}

}
