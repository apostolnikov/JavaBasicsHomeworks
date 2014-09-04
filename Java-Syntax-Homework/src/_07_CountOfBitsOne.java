import java.util.Scanner;


public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		in.close();
		
		int count = 0;
		
		while (number != 0 ) {
			if ((number & 1) == 1) {
				count++;
			}
			number >>= 1;
		}
		System.out.println(count);

	}

}
