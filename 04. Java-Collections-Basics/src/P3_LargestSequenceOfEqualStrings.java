import java.util.Scanner;


public class P3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the words:");
		String str = scan.nextLine();
		String[] words = str.split(" ");
		
		int temp = 1;
		int chosen = 0;	
		int sum = 1;
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i - 1])) {
				temp++;
				
			}
			else {
				temp = 1;
				
			}
			if (temp > sum) {
				sum = temp;
				chosen = i;
			}
			
		}
		for (int i = 0; i < sum; i++) {
			System.out.print(words[chosen] + " ");
		}

	}

}
