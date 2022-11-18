public class Test1001 {
    public static void main(String[] args) {
        int a;
        int k = 7;

        System.out.printf("%d%n", k);
        Test1001_1 test10 = new Test1001_1();
        a = test10.add(k, 4);
        System.out.printf("%d%n", a);
    }

}

class Test1001_1 {
    public int add(int x, int y) {
        int t = x + y;
        return t;
    }
}
