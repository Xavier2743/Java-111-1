import java.util.Scanner;

public class Test3 {
    public static void main(String[] avgs) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your score: ");
        num = input.nextInt();

        if (num >= 0 && num <= 100) {
            if (num >= 90) {
                System.out.println("A");
            }
            else if (num >= 80) {
                System.out.println("B");
            }
            else if (num >= 70) {
                System.out.println("C");
            }
            else if (num >= 60) {
                System.out.println("D");
            }
            else {
                System.out.println("E");
            }
        }
        else {
            System.out.println("Input error.");
        }
    }
}
