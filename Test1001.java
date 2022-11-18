public class Test1001 {
    public static void main(String[] args) {
        int a, b;
        int k = 7;

        System.out.printf("%d%n", k);
        Test1001_1 test0 = new Test1001_1();
        a = test0.add(k, 4);
        System.out.printf("%d%n", a);
        Test1002 test1 = new Test1002();
        b = test1.sub(k, 4);
        System.out.printf("%d%n", b);
    }

}

class Test1001_1 {
    public int add(int x, int y) {
        int t = x + y;
        return t;
    }
}
