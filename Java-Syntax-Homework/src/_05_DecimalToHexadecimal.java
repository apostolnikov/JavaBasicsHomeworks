import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		in.close();
		
		String numInHex = Integer.toHexString(num);
		System.out.println(numInHex.toUpperCase());
		
		

	}

}
