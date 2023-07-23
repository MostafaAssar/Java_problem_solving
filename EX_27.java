package chapter_3;
import java.util.Scanner;
public class EX_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.pow(((x - 0) * (x - 0)) + ((y - 0) * (y - 0)), 0.5);
        if ( distance > 111.8033989) //111.8033989 this number is length of middle of hypotenuse
            System.out.println("The point is not in the triangle");
        else
            System.out.println("The point is in the triangle");
    }
}
