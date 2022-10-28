public class Test0702 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = i - 4;j <= i + 1; j++) {
                if (j <= 0) {
                        System.out.print("*");
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}