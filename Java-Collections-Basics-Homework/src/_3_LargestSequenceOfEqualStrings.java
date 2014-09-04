import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class _3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		// input
		Scanner in = new Scanner(System.in);
		String inputStr = in.nextLine();
		// logic & output
		String[] inputArr = inputStr.split(" ");
		ArrayList<String> listA = new ArrayList<>();
		ArrayList<String> listB = new ArrayList<>();
		for (int i = 0; i < inputArr.length; i++) {
			if (i == 0) {
				listA.add(inputArr[i]);
			} else {
				if (inputArr[i].equals(listA.get(0))) {
					listA.add(inputArr[i]);
				}
				else if (!inputArr[i].equals(listA.get(0)) && listB.isEmpty()) {
					listB.add(inputArr[i]);
				}
				else if (inputArr[i].equals(listB.get(0))) {
					listB.add(inputArr[i]);
				} else {
					if (listB.size() > listA.size()) {
						listA = listB;
					}
					listB = new ArrayList<>();
				}
				if (listB.isEmpty()) {
					listB.add(inputArr[i]);
				}
			}
			if (i == (inputArr.length - 1)) {
				if (listA.size() >= listB.size()) {
					System.out.println(listA);
				}
				else {
					System.out.println(listB);
				}
			}
		}

	}

}
