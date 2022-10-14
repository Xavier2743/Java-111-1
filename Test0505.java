public class Test0505 {
    public static void main(String[] avgs) {
        int num = 0;
        int n;
        boolean change = false;
        
        while (num >= 0 && num < 5) {
            n = 0;
            while (n <= num) {
                System.out.print("*");
                n ++;
            }
            System.out.println();
            if (num == 4) {
                change = true;
            }
            if (change) {
                num --;
            }
            else {
                num ++;
            }
        }
    }
}