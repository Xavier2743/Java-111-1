import java.util.Scanner;

public class Test0301 {
    public static void main(String[] avgs) {
        int num1;
        int num2;
        int sum;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first integer: ");
        num1 = input.nextInt();
        System.out.printf("Enter second integer: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
        input.close();
    }

    public static void printStr(String str) {
        System.out.println(str);
    }
}