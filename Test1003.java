public class Test1003 {
    public static void main(String[] args) {
        int row = 5, n;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + 2; j++) {
                if (i > (row + 1) / 2) {
                    n = row + 1 - i;
                }
                else {
                    n = i;
                }
                if (j > (row + 3) / 2 - n && j < (row + 3) / 2 + n) {
                    System.out.print(" ");                    
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
