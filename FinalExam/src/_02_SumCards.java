import java.util.Scanner;


public class _02_SumCards {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] input = in.nextLine().split(" ");
		int[] numbers = new int[input.length];
		
		
		for (int i = 0; i < input.length; i++) {
			switch (input[i]) {
			case "2S":
			case "2H":
			case "2D":
			case "2C": numbers[i] = 2; break;
			case "3S":
			case "3H":
			case "3D":
			case "3C": numbers[i] = 3; break;
			case "4S":
			case "4H":
			case "4D":
			case "4C": numbers[i] = 4; break;
			case "5S":
			case "5H":
			case "5D":
			case "5C": numbers[i] = 5; break;
			case "6S":
			case "6H":
			case "6D":
			case "6C": numbers[i] = 6; break;
			case "7S":
			case "7H":
			case "7D":
			case "7C": numbers[i] = 7; break;
			case "8S":
			case "8H":
			case "8D":
			case "8C": numbers[i] = 8; break;
			case "9S":
			case "9H":
			case "9D":
			case "9C": numbers[i] = 9; break;
			case "10S":
			case "10H":
			case "10D":
			case "10C": numbers[i] = 10; break;
			case "JS":
			case "JH":
			case "JD":
			case "JC": numbers[i] = 12; break;
			case "QS":
			case "QH":
			case "QD":
			case "QC": numbers[i] = 13; break;
			case "KS":
			case "KH":
			case "KD":
			case "KC": numbers[i] = 14; break;
			case "AS":
			case "AH":
			case "AD":
			case "AC": numbers[i] = 15; break;
			default:
				break;
			}
		}
		
		
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numbers[i + 1] && numbers[i + 2] != numbers[i]) {
				numbers[i] *= 2;
				numbers[i + 1] *= 2;
				i += 2;
			}
			if (numbers[i] == numbers[i + 1] && numbers[i + 2] == numbers[i] && numbers[i+3] != numbers[i]) {
				numbers[i] *= 2;
				numbers[i + 1] *= 2;
				numbers[i + 2] *= 2;
				i += 3;
			}
			if (numbers[i] == numbers[i + 1] && numbers[i + 2] == numbers[i] && numbers[i+3] == numbers[i]) {
				numbers[i] *= 2;
				numbers[i + 1] *= 2;
				numbers[i + 2] *= 2;
				numbers[i + 3] *= 2;
				i += 4;
				
			}
		}
	
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			
		}
		System.out.println(sum);
		
	}
		
}
