public class Test1702 {
    public static void main(String[] args) {
        int x = 10;
        double y = 10.0;
        System.out.println("int: " + setV(x));
        System.out.println("int, int: " + setV(x, 3));
        System.out.println("double:  " + setV(y));
    }

    public static int setV(int x) {
        return x = 20;
    }

    public static int setV(int x, int y) {
        return x = 30;
    }

    public static double setV(double x) {
        return x = 20.0;
    }
}