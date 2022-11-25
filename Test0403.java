import java.util.Scanner;

public class Test0403 {
    public static void main(String[] avgs) {
        int grade;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your score: ");
        grade = input.nextInt();
        input.close();

        if (grade >= 0 && grade <= 100) {
            switch (grade / 10) {
                case 9:
                case 10:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
                    break;
            }
        }
        else {
            System.out.println("Input error.");
        }
    }
}
