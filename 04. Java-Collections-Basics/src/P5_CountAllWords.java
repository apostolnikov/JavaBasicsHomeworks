import java.util.Scanner;


public class P5_CountAllWords {

	public static void main(String[] args) {

		System.out.println("Enter the text: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split("[ -9,`'.!?)(]+");
		
		int sum = 0;
		
		for (String word : words) {
			sum++;
		}
		
		System.out.println("The words are: " + sum);
		

	}

}
