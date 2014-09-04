import java.util.Scanner;


public class P6_CountSpecifiedWord {

	public static void main(String[] args) {

		System.out.println("Enter the text: ");
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String lower = input.toLowerCase();		
		String[] words = lower.split("[ -9,`'.!?)(]+");	
		
		System.out.print("Enter the target word: ");
		String target = scan.next();
		
		int sum = 0;
			
		for (int i = 0; i < words.length; i++) {						
			if (words[i].equals(target)) {
				sum++;
			}
		}
		System.out.println("The words are: " + sum);
		

	}

}
