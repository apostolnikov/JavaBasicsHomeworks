import java.util.Scanner;


public class P2_SequencesOfEqualStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the words:");
		String str = scan.nextLine();
		String[] words = str.split(" ");
		
		System.out.print(words[0]);
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i - 1])) {
				System.out.print(" " + words[i]);				
			}
			else {
				System.out.print("\n" + words[i]);
			}
			
		}

	}

}
