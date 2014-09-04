import java.util.Scanner;


public class _01_StuckNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String inputString = in.nextLine();
		String[] input = inputString.split(" ");
		int count = 0;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				for (int j2 = 0; j2 < input.length; j2++) {
					for (int k = 0; k < input.length; k++) {
						if (i != j && i != j2 && i != k && j != j2 && j != k && j2 != k) {
							String strA = (String)input[i] + (String)input[j];
							String strB = (String)input[j2] + (String)input[k];
							
							if (strA.equals(strB)) {
								System.out.println(input[i] + "|" + input[j] + "==" + input[j2] + "|" + input[k]);
								count++;
							}
						}
					}
				}
			}
		}
		
		if (count == 0) {
			System.out.println("No");
		}

	}

}
