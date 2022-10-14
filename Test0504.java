public class Test0504 {
    public static void main(String[] avgs) {
        int num = 0;
        int n;
        
        while (num < 5) {
            n = 0;
            while (n <= num) {
                System.out.print("*");
                n ++;
            }
            System.out.println();
            num ++;
        }
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