import java.util.Scanner;


public class _01_RectangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int widht = in.nextInt();
		int height = in.nextInt();
		in.close();
		
		int areaOfTheRectangle = widht * height;
		
		System.out.println(areaOfTheRectangle);
		

	}

}
