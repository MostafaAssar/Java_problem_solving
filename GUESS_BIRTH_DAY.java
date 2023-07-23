package chapter_3;
import javax.swing.JOptionPane;
public class GUESS_BIRTH_DAY {
    public static void main(String[] args) {
        int day = guessDay();
        String month = nameOfMonth(guessMonth());
        JOptionPane.showConfirmDialog(null, "Your Birthday is "+day+" / "+month, "Guess Birthday Game", 0, 0);
    }
    
    public static int guessDay()
    {
        int birthDay = 0;
        String box1 = JOptionPane.showInputDialog(null, "Is your birthday here?\n" + "1   3   5   7\n"
                                                                                               + "9 11 13 15\n"
                                                                                               + "17 19 21 22\n"
                                                                                               + "25 27 29 31\n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box1.equals("y"))
            birthDay += 1;
        String box2 = JOptionPane.showInputDialog(null, "Is your birthday here?\n" + "2   3   9   7\n"
                                                                                               + "10 11 14 15\n"
                                                                                               + "18 19 22 23\n"
                                                                                               + "26 27 30 31\n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box2.equals("y"))
            birthDay += 2;
        String box3 = JOptionPane.showInputDialog(null, "Is your birthday here?\n" + "4   5   6   7\n"
                                                                                               + "12 13 14 15\n"
                                                                                               + "20 21 22 23\n"
                                                                                               + "28 29 30 31\n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box3.equals("y"))
            birthDay += 4;
        String box4 = JOptionPane.showInputDialog(null, "Is your birthday here?\n" + "8   9   10   11\n"
                                                                                               + "12 13 14 15\n"
                                                                                               + "24 25 26 27\n"
                                                                                               + "28 29 30 31\n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box4.equals("y"))
            birthDay += 8;
        String box5 = JOptionPane.showInputDialog(null, "Is your birthday here?\n" + "16   17   18   19\n"
                                                                                               + "20 21 22 23\n"
                                                                                               + "24 25 26 27\n"
                                                                                               + "28 29 30 31\n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box5.equals("y"))
            birthDay += 16;
        return birthDay;
    }
    
    public static int guessMonth()
    {
        int month = 0;
        String box1 = JOptionPane.showInputDialog(null, "Is your month here?\n" + "1   3   5   7\n"
                                                                                               + "9  11 \n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box1.equals("y"))
            month += 1;
        
        String box2 = JOptionPane.showInputDialog(null, "Is your month here?\n" + "2   3   6   7\n"
                                                                                               + "10  11 \n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box2.equals("y"))
            month += 2;
        
        String box3 = JOptionPane.showInputDialog(null, "Is your month here?\n" + "4   5   6   7\n"
                                                                                               + "12 \n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box3.equals("y"))
            month += 4;
        
        String box4 = JOptionPane.showInputDialog(null, "Is your month here?\n" + "8   9   10   11\n"
                                                                                               + "12 \n"
                                                                                               + "If here enter y, if not enter n"
                                                                                               , "Guess Birthday Game", 0);
        if(box4.equals("y"))
            month += 8;
        
        return month;
    }
    
    public static String nameOfMonth(int numOfMonth)
    {
        String monthName ;
        switch(numOfMonth)
        {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: return "";
        }
        return monthName;
    }
}
