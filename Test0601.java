public class Test0601 {
    public static void main(String[] avgs) {
        int row = 0;
        int n;
        int charCount;

        while (row < 9) {
            if (row >= 5) {
                charCount = 8 - row;
            } else {
                charCount = row;
            }
            n = 0;
            while (n <= 4 - charCount) {
                System.out.print(" ");
                n++;
            }
            n = 0;
            while (n <= 2 * charCount) {
                System.out.print("*");
                n++;
            }
            System.out.println();
            row++;
        }
    }
}
