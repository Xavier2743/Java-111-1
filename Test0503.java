public class Test0503 {
    public static void main(String[] avgs) {
        int num = 1;
        String ch = "*";
        
        while (num < 6) {
            System.out.println(ch);
            ch += "*";
            num ++;
        }

        num = 5;
        int n;
        
        while (num >= 0) {
            n = 0;
            while (n <= num) {
                System.out.print("*");
                n ++;
            }
            System.out.println();
            num --;
        }
    }
}