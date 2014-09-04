import java.util.Scanner;


public class _08_CountOfEqualBitPair {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		in.close();
		
		String binaryNumber = Integer.toBinaryString(number);
		char[] binaryArray = binaryNumber.toCharArray();
        int count = 0;

        for (int i = 0; i < binaryArray.length - 1; i++) {
            if (binaryArray[i] == binaryArray[i+1]) {
                count++;
            }
        }

        System.out.println(count);

	}

}
