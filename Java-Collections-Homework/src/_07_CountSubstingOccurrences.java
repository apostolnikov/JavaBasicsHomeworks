import java.util.Scanner;

public class _07_CountSubstingOccurrences {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        String text = in.nextLine().toLowerCase();
        String target = in.nextLine().toLowerCase();
       
        int countOfRepeats = 0;
       
        for (int i = 0; i <= text.length() - target.length(); i++) {
                if (text.substring(i, i + target.length()).equals(target))
                        countOfRepeats++;
        }
       
        System.out.println(countOfRepeats);

	}

}
