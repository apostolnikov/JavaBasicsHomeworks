import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().toLowerCase()
			.split("([().,!?:;'\"-]|\\s)+");
		Set<String> words = new TreeSet<>();
		for (String string : input) {
		    words.add(string);
		}
		for (String string : words) {
		    System.out.print(string + " ");
		}

	}

}
