import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
        String text = in.nextLine();
       
        Pattern emailPattern = Pattern.compile("[A-Za-z]+[.-_]*[A-Za-z]+@[A-Za-z]+[-]*[.A-Za-z]+[A-Za-z]");
        Matcher matcher = emailPattern.matcher(text);
        while(matcher.find()) {
                System.out.println(matcher.group());
        }

	}

}
