public class Test1703 {
    public static void main(String[] args) {
        int total = 0;
        for (String str : args) {
            total += Integer.parseInt(str);
            System.out.println("Input: " + str);
        }
        System.out.println("Total: " + total);
    }
}