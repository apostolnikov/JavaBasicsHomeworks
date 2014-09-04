import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayStrings {
	
	public static void main(String[] arg) {
		//input
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] cityes = new String[n];
		
		for (int i = 0; i < n; i++) {
			cityes[i] = in.next();
		}
		in.close();
		
		//logic
		Arrays.sort(cityes);
		
		//output
		for (int i = 0; i < n; i++) {
			System.out.println(cityes[i]);
		}
	}
}