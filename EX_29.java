package chapter_3;
import java.util.Scanner;
public class EX_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();
        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();
        double distanceBetweenTowPionts = Math.pow(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)), 0.5);
        //if(radius1 - radius2 < 0)
        //{
        //    System.out.println("invalid");
        //    System.exit(0);
        //}
        if(distanceBetweenTowPionts <= (radius1 - radius2))
            System.out.println("circle2 is inside circle1");
        else 
            if(distanceBetweenTowPionts <= (radius1 + radius2))
                System.out.println("circle2 overlaps circle1");
            else
                System.out.println("circle2 does not overlap circle1");
    }
}
