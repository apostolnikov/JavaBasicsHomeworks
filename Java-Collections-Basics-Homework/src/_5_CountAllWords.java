import java.util.Scanner;


public class _5_CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputStr = in.nextLine();
		inputStr = inputStr.replace("-", " ");
		inputStr = inputStr.replace("'", " ");
		String[] inputWords = inputStr.split(" ");
		int counterWords = inputWords.length;
		System.out.println(counterWords);

	}

}
