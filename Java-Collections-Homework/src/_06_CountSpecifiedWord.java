import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String target = in.nextLine();
        int countOfRepeats = 0;
       
        String[] words = text.split("\\W+");
       
        for (String word : words) {
                if (word.toLowerCase().equals(target.toLowerCase()))
                        countOfRepeats++;                              
        }
       
        System.out.println(countOfRepeats);

	}

}
