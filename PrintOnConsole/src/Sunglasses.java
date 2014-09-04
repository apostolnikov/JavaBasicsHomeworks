import java.util.Scanner;


public class Sunglasses {
	
	public static String repeat(String str, int times){
		   StringBuilder ret = new StringBuilder();
		   for(int i = 0;i < times;i++) ret.append(str);
		   return ret.toString();
		}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.close();
		
		//first line
		System.out.print(repeat("*", n * 2));
		System.out.print(repeat(" ", n));
		System.out.print(repeat("*", n * 2));
		System.out.println();
				
		
		//body
		for (int i = 1; i < n; i++) {
			if (i == n/2) {
				System.out.print("*");
				System.out.print(repeat("/", n * 2 - 2));
				System.out.print("*");
				
				System.out.print(repeat("|", n));
				
				System.out.print("*");
				System.out.print(repeat("/", n * 2 - 2));
				System.out.print("*");
				
				
				System.out.println();
				
			} else if (i == n-1) {
				
			
				System.out.print(repeat("*", n * 2));
				System.out.print(repeat(" ", n));
				System.out.print(repeat("*", n * 2));
				System.out.println();
			}
			else {
				System.out.print("*");
				System.out.print(repeat("/", n * 2 - 2));
				System.out.print("*");
				
				System.out.print(repeat(" ", n));
				
				System.out.print("*");
				System.out.print(repeat("/", n * 2 - 2));
				System.out.print("*");
				
				
				System.out.println();
			}

			
		}
		

	}

}
