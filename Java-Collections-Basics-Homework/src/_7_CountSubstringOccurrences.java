import java.util.ArrayList;
import java.util.Scanner;

public class _7_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputStr = in.nextLine();
		inputStr = inputStr.toLowerCase();
		inputStr = inputStr.replace("-", " ");
		inputStr = inputStr.replace("'", " ");
		String[] inputWords = inputStr.split(" ");
		String targerSubStr = in.next();
		targerSubStr = targerSubStr.toLowerCase();
		int countEqualChars = 0;
		int counter = 0;
		for (int i = 0; i < inputWords.length; i++) { // checking for every word in the input line
			if (inputWords[i].length() >= targerSubStr.length()) { //checking if the current word is longer enough to contain the target 
				char[] currentWordCharArr = inputWords[i].toCharArray();
				char[] targetWordCharArr = targerSubStr.toCharArray();
				for (int j = 0; j < (currentWordCharArr.length - (targetWordCharArr.length - 1)); j++) { //checking the current word char by char if it contain the target
					for (int j2 = j; j2 < targetWordCharArr.length + j; j2++) {
						if (currentWordCharArr[j2] == targetWordCharArr[countEqualChars]) {
							countEqualChars++;
						}
					}
					if (countEqualChars / targetWordCharArr.length == 1) {
						counter++;	
					}
					countEqualChars = 0;
				}
			}
		}
		System.out.println(counter);
	}

}
