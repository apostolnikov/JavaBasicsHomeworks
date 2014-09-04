import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class P10_ExtractAllUniqueWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text:");
		String input = scan.nextLine().toLowerCase();
		String[] text = input.split("([()!?:;',.//\"-]|\\s)+");
		
		Set<String> words = new TreeSet<>();
		for (String str : text) {
			words.add(str);
		}
		for (String string : words) {
			System.out.println(string + " ");
		}
	}

}
