import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P11_MostFrequentWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text:");
		String input = scan.nextLine().toLowerCase();
		String[] text = input.split("([()!?:;',.//\"-]|\\s)+");

		int sum = 0;
		
		Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
		
		for (String word : text) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			if (count + 1 > sum) {
				sum = count + 1;
			}
			wordsCount.put(word, count + 1);
		}

		for (Map.Entry<String, Integer> max : wordsCount.entrySet()) {
			if (max.getValue() == sum) {
				System.out.printf("%s -> %d times\n", max.getKey(),
						max.getValue());
			}
		}

	}

}
