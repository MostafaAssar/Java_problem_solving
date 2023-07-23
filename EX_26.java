package chapter_3;
import java.util.Scanner;
public class EX_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        if(num % 5 == 0 && num % 6 == 0)
            flag1 = true;
        if(num % 5 == 0 || num % 6 == 0)
            flag2 = true;
        if(num % 5 == 0 ^ num % 6 == 0)
            flag3 = true;
        System.out.println("Is " + num + "divisible by 5 and 6? " + flag1);
        System.out.println("Is " + num + " divisible by 5 or 6? " + flag2);
        System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + flag3);
    }
}
