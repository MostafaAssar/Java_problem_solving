package chapter_3;
import javax.swing.JOptionPane;
public class PRACTICE_SUBTRACTING {
    public static void main(String[] args) {
        int num1 = (int) ((Math.random() * 10) + 1);
        int num2 = (int) ((Math.random() * 10) + 1);
        int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the sum of ("+num1+" - "+num2+")", "Subtraction", 0));
        int result = num1 - num2;
        if(answer == result)
            JOptionPane.showConfirmDialog(null, "Excellent your answer is true.", "Subtraction", 0, 0);
        else
            JOptionPane.showConfirmDialog(null, "Oops your answer is false, The True answer is "+result, "Subtraction", 0, 0);
    }
}