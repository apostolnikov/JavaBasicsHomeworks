import java.util.ArrayList;
import java.util.Scanner;


public class _4_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputStr = in.nextLine();
		String[] inputArr = inputStr.split(" ");
		int[] inputArrInt = new int[inputArr.length];
		for (int i = 0; i < inputArrInt.length; i++) {
			inputArrInt[i] = Integer.parseInt(inputArr[i]);
		}
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		
		for (int i = 0; i < inputArrInt.length; i++) {
			if (i == 0) {
				listA.add(inputArrInt[i]);
			} else {
				if (inputArrInt[i] > inputArrInt[i-1]) {
					listA.add(inputArrInt[i]);
				} else {
					System.out.println(listA);
					if (listA.size() > listB.size()) {
						listB = listA;
					}
					listA = new ArrayList<>();
					inputArrInt[i-1] = Integer.MIN_VALUE;
					i -=1;
					inputArrInt[i] = Integer.MIN_VALUE;
				}
			}
			if (i == inputArrInt.length - 1) {
				System.out.println(listA);
				if (listA.size() > listB.size()) {
					System.out.println("Longest: " + listA);
				} else {
					System.out.println("Longest " + listB);
				}
			}
		}

	}

}
