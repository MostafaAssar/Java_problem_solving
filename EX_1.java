package chapter_3;
import java.util.Scanner;
public class EX_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if((b * b) - (4 * a * c) > 0)
        {
            double r1 = (-b + Math.pow((b * b) - (4 * a * c), 0.5)) / (2 * a);
            double r2 = (-b - Math.pow((b * b) - (4 * a * c), 0.5)) / (2 * a);
            System.out.println("The roots are "+r1+" and "+r2);
            System.exit(0);
        }
        if((b * b) - (4 * a * c) == 0)
        {
            double r1 = (-b + Math.pow((b * b) - (4 * a * c), 0.5)) / (2 * a);
            System.out.println("The root is "+r1);
            System.exit(0);
        }
        else
            System.out.println("The equation has no real roots.");
    }
}
