import java.util.Scanner;


public class SplitPatern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String inputString = in.nextLine();
		String target = in.nextLine();
		String[] array = inputString.split("[; -,.!()]+");
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(target)) {
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
