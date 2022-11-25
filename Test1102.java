public class Test1102 {
    public static void main(String[] args) {
        for (int i = -4; i <= 4; i++) {
            for (int j = -5; j <= 5; j++) {
                if (4 - Math.abs(j) < Math.abs(i)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
