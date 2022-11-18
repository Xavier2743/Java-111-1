public class Test1003 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 9; i++) {
            if (i > 5) {
                n = 10 - i;
            }
            else {
                n = i;
            }
            for (int j = 1; j <= 11; j++) {
                if (j > 6 - n && j < 6 + n) {
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
