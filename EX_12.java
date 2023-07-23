package chapter_3;
import java.util.Scanner;
public class EX_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if(num % 5 == 0 && num % 6 == 0)
        {
            System.out.println(num + " is divisible by both 5 and 6");
        }
        else
        {
            if(num % 5 != 0 && num % 6 != 0)
            {
                System.out.println(num + " is not divisible by either 5 or 6");
            }
            else
                System.out.println(num + " is divisible by 5 or 6, but not both");
        }
    }
}
