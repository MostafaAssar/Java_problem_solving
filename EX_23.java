package chapter_3;
import java.util.Scanner;
public class EX_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distanceOfWidth = Math.pow(((x - 0) * (x - 0)), 0.5);
        double distanceOfHeight = Math.pow(((y - 0) * (y - 0)), 0.5);
        if(distanceOfWidth > (10 / 2.0) || distanceOfHeight > (5 / 2.0))
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
        else
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
    }
}
