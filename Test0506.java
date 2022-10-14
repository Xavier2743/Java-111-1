public class Test0506 {
    public static void main(String[] avgs) {
        int num = 0;
        int n;
        
        while (num < 5) {
            n = 0;
            while (n <= 4 - num) {
                System.out.print(" ");
                n ++;
            }
            n = 0;
            while (n <= 2 * num) {
                System.out.print("*");
                n ++;
            }
            System.out.println();
            num ++;
        }
    }
}
