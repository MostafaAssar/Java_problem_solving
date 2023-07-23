package chapter_3;
import java.util.Scanner;
public class EX_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("Is " + num + " an even number? " + ((num % 2 == 0)? "true" : "false"));
    }
}
