package chapter_4;
import java.util.Scanner;
public class EX_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int value, the program exits if the input is 0: ");
        int total = 0;
        int num;
        int positive = 0;
        int negative = 0;
        double average;
        while(true)
        {
            num = input.nextInt();
            if(num == 0) break;
            if(num > 0) positive++;
            else negative++;
            total += num;
        }
        average = total / (double)(positive + negative);
        System.out.println("The number of positives is " + positive
                         + "\nThe number of negatives is " + negative
                         + "\nThe total is " + total
                         + "\nThe average is " + average);
    }
}
