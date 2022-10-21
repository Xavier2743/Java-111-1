public class Test0606 {
    public static void main(String[] args) {
        String star, number = "";
        for (int i = 1; i <= 6; i++) {
            star = "";
            for (int j = 6 - i; j >= 0; j--) {
                star += "*";
            }
            number += i;
            System.out.print(star + number + "\n");
        }
    }
}