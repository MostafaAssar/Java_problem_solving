package chapter_4;
public class EX_03 {
    public static void main(String[] args) {
        System.out.println("Kilograms       Pounds");
        int num = 1;
        while(num < 200)
        {
            System.out.printf("%1d %18.1f", num, (num * 2.2));
            System.out.println("");
            num += 2;
        }
    }
}
