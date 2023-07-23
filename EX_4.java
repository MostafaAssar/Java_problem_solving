package chapter_3;
import java.util.Scanner;
public class EX_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int) ((Math.random() * 100));
        int num2 = (int) ((Math.random() * 100));
        System.out.println("Enter the sum of (" + num1 + " + " + num2 + "): ");
        int answer = input.nextInt();
        int result = num1 + num2;
        if(answer == result)
            System.out.println("Excellent your answer is true.");
        else
            System.out.println("Oops your answer is false, The True answer is " + result);
    }
}
