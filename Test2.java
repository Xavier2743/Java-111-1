import java.util.Scanner;

public class Test2 {
    public static void main(String[] avgs) {
        int num1;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first integer: ");
        num1 = input.nextInt();

        if (num1 >= 80) {
            System.out.println("Excellent!");
        }
        else if (num1 >= 60) {
            System.out.println("Pass!");
        }
        else {
            System.out.println("Fail!");
        }
    }
}