public class Test1101 {
    public static void main(String[] args) {
        int width = 0;
        for (int i = -4; i <= 4; i++) {
            for (int j = -5; j <= 5; j++) {
                if (Math.abs(j) > width) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

            if (i < 0) {
                width++;
            }
            else {
                width--;
            }
        }
    }
}
