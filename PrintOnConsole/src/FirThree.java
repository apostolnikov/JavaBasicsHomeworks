import java.util.Scanner;

public class FirThree {
	
	public static String repeat(String str, int times){
		   StringBuilder ret = new StringBuilder();
		   for(int i = 0;i < times;i++) ret.append(str);
		   return ret.toString();
		}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.close();
		
		int stars = 1;
		int empty = n + 2;
		
		for (int i = 0; i < n; i++) {
			System.out.print(repeat(" ", empty));
			System.out.print(repeat("*", stars));
			System.out.print(repeat(" ", empty));
			System.out.println();
			stars += 2;
			empty--;
			
		}
		

	}

}