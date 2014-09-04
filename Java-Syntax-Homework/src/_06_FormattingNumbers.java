import java.util.Scanner;

public class _06_FormattingNumbers {

    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        float b = Float.parseFloat(in.next());
        float c = Float.parseFloat(in.next());
        in.close();
        
        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|%n", a, Integer.parseInt(Integer.toBinaryString(a)), b, c);
         
        
    }
}