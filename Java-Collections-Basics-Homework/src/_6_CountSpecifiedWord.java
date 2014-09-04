import java.util.Scanner;


public class _6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputStr = in.nextLine().toLowerCase();
		String targetWord = in.next().toLowerCase();
		int counter = 0;
		inputStr = inputStr.replace("-", " ");
		inputStr = inputStr.replace("'", " ");
		String[] inputWords = inputStr.split(" ");
		for (int i = 0; i < inputWords.length; i++) {
			if (inputWords[i].equals(targetWord)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
