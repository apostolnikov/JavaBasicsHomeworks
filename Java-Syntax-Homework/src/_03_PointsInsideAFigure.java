import java.util.Scanner;

public class _03_PointsInsideAFigure {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String inputStr = in.nextLine();
        String cordinates[] = inputStr.split(" ");
        
        float x = Float.parseFloat(cordinates[0]);
        float y = Float.parseFloat(cordinates[1]);
        in.close();
        
        if((x >= 12.5 && x <= 22.5) && y >= 6.0 && y <= 13.5) {
            
            if(y > 8.5 && x > 17.5 && x < 20) {
                System.out.println("Outside");
            } else {
                System.out.println("Inside");
            }
        } else {
            System.out.println("Outside");
        }
    }
}