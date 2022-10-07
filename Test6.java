import java.util.Scanner;

public class Test6 {
    public static void main(String[] avgs) {
        int num;
        int grade = 0;
        
        while (grade < 10) {
            num = 0;
            while (num < grade) {
                System.out.printf(" ");
                num ++;
            }

            System.out.println(grade);
            grade ++;
        }
    }
}
