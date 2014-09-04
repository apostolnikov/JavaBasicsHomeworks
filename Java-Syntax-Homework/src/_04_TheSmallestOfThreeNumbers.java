import java.util.Scanner;

public class _04_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		in.close();
		
		float smallestNum = Math.min(a, Math.min(b, c));
        System.out.println(smallestNum);
		
		

	}

}
