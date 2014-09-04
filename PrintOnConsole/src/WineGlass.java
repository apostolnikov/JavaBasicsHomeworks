import java.util.Scanner;


public class WineGlass {
	public static String repeat(String str, int times){
		   StringBuilder ret = new StringBuilder();
		   for(int i = 0;i < times;i++) ret.append(str);
		   return ret.toString();
		}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int dots = 0;
		int stars = n -2;
		
		for (int i = 0; i < n / 2; i++) {
			System.out.print(repeat(".", dots));
			System.out.print("\\");
			System.out.print(repeat("*", stars));
			System.out.print("/");
			System.out.print(repeat(".", dots));
			System.out.println();
			dots++;
			stars-=2;
			
		}
		
		if (n < 12) {
			for (int i = 0; i < n / 2 - 1; i++) {
				System.out.print(repeat(".", n / 2 - 1));
				System.out.print("||");
				System.out.print(repeat(".", n / 2 - 1));
				System.out.println();
			}
			System.out.print(repeat("-", n));
			
			
		} else if (n >= 12) {
			for (int i = 0; i < n / 2 - 2; i++) {
				System.out.print(repeat(".", n / 2 - 1));
				System.out.print("||");
				System.out.print(repeat(".", n / 2 - 1));
				System.out.println();
			}
			System.out.print(repeat("-", n));
			System.out.println();
			System.out.print(repeat("-", n));
		}
		

	}

}
