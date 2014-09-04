import java.util.Scanner;

public class TheExplorer {
	
	public static String repeat(String str, int times){
		   StringBuilder ret = new StringBuilder();
		   for(int i = 0;i < times;i++) ret.append(str);
		   return ret.toString();
		}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int innerDash = 1;
		int outerDash = n/2 -1;
		
		//fist line
		System.out.print(repeat("-", n/2));
		System.out.print("*");
		System.out.print(repeat("-", n/2));
		System.out.println();
		
		
		//body part one
		for (int i = 0; i < n/2; i++) {
			System.out.print(repeat("-", outerDash));
			System.out.print("*");
			System.out.print(repeat("-", innerDash));
			System.out.print("*");
			System.out.print(repeat("-", outerDash));
			System.out.println();
			outerDash--;
			innerDash += 2;
		}
		
		
		int innerDashBottom = n - 4;
		int outerDashBottom = 1;
		
		//body part two
		for (int i = 0; i < n/2 - 1; i++) {
			 System.out.print(repeat("-", outerDashBottom));
			 System.out.print("*");
			 System.out.print(repeat("-", innerDashBottom));
			 System.out.print("*");
			 System.out.print(repeat("-", outerDashBottom));
			 System.out.println();
			 outerDashBottom++;
			 innerDashBottom -= 2;
			 
		}
		 
		//last line
		System.out.print(repeat("-", n/2));
		System.out.print("*");
		System.out.print(repeat("-", n/2));
		System.out.println();
	 
		 

	}

}
