public class Test0604 {
    public static void main(String[] args) {
        int n;
        int charCount;
    
        for (int row = 0; row < 9; row++) {
            if (row >= 5) {
                charCount = 8 - row;
            } else {
                charCount = row;
            }
            for (n = 0; n <= 4 - charCount; n++) {
                System.out.print(" ");
            }
            for (n = 0; n <= 2 * charCount; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
