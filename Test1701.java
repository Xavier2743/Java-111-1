public class Test1701 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr;
        arr2[0] = 100;
        System.out.println("arr[0]: " + arr[0]);
        System.out.println("arr2[0]: " + arr2[0]);
    }
}
