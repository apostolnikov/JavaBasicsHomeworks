import java.util.Scanner;


public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double ax = in.nextDouble();
		double ay = in.nextDouble();
		double bx = in.nextDouble();
		double by = in.nextDouble();
		double cx = in.nextDouble();
		double cy = in.nextDouble();
		in.close();
		
		double distanceFromAtoB = Math.sqrt((bx - ax) * (bx - ax) + (by - ay) * (by - ay));
        double distanceFromBtoC = Math.sqrt((cx - bx) * (cx - bx) + (cy - by) * (cy - by));
        double distanceFromCtoA = Math.sqrt((ax - cx) * (ax - cx) + (ay - cy) * (ay - cy));
        
        
        double a = distanceFromAtoB;
        double b = distanceFromBtoC;
        double c = distanceFromCtoA;
        
        if ((a + b > c) && (b + c > a) && (a + c > b))
        {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a)* (p - b) * (p - c));
            System.out.println(Math.round(area));
            
        } else {
			
        	System.out.println(0);
		}
        
	}

}
