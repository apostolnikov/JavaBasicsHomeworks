import java.util.Scanner;


public class P7_CountSubstringOccurrences {

	public static void main(String[] args) {

		System.out.println("Enter the text: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String lower = input.toLowerCase();
		String target = scan.nextLine();
		int sum = 0;
		
		for (int i = 0; i <= lower.length() - target.length(); i++) {
			if (lower.substring(0 + i, target.length() + i).contains(target)) {
				sum++;
			}
			
		}
		
		
		System.out.println("Result: " + sum);

	}

}
