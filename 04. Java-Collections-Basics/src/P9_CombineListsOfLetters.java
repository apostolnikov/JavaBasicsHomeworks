import java.util.ArrayList;
import java.util.Scanner;


public class P9_CombineListsOfLetters {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		ArrayList<Character> first = new ArrayList<>();
		ArrayList<Character> second = new ArrayList<>();
		
		for (char character : scan.nextLine().toCharArray()) {
			first.add(character);
		}
		
		for (char character : scan.nextLine().toCharArray()) {
			second.add(character);
		}
		
		ArrayList<Character> combine = new ArrayList<>();
		combine.addAll(first);
		for (int i = 0; i < second.size(); i++) {
			if (!first.contains(second.get(i))) {
				combine.add(' ');
				combine.add(second.get(i));
			}
		}
		
		for (char character : combine) {
			System.out.print(character);
		}

	}

}
