import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class P8_ExtractEmails {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		String input = scan.nextLine();
		
		Pattern email = Pattern.compile("[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}");
		
		Matcher ematcher = email.matcher(input); 
		while (ematcher.find()) {
			System.out.println(ematcher.group());
		}

	}

}
