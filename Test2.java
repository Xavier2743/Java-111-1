import java.util.Scanner;

public class Test2 {
    public static void main(String[] avgs) {
        int num1;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first integer: ");
        num1 = input.nextInt();

        if (num1 >= 60 & num1 <= 70) {
                System.out.println("60-70");
        }
        else {
            System.out.println("<60");
        }
    }
}