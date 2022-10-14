public class Test0502 {
    public static void main(String[] avgs) {
        int num = 0;
        int n;
        String ch = "*";
        
        while (num < 5) {
            n = 0;
            while (n <= num) {
                System.out.print(ch);
                n ++;
            }
            System.out.println();
            num ++;
        }
    }
}




