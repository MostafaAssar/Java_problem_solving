package chapter_3;
import java.util.Scanner;
public class EX_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer that you want to sort: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1 > num2 && num1 > num3){
            if(num2 > num3)
                System.out.println("The sort is: " + num1 + " " + num2 + " " + num3);
            else
                System.out.println("The sort is: " + num1 + " " + num3 + " " + num2);
        }
        if(num2 > num1 && num2 > num3){
            if(num1 > num3)
                System.out.println("The sort is: " + num2 + " " + num1 + " " + num3);
            else
                System.out.println("The sort is: " + num2 + " " + num3 + " " + num1);
        }
        if(num3 > num1 && num3 > num2){
            if(num1 > num2)
                System.out.println("The sort is: " + num3 + " " + num1 + " " + num2);
            else
                System.out.println("The sort is: " + num3 + " " + num2 + " " + num1);
        }
    }
}
