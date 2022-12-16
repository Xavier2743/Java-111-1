public class Test1401 {
    public static void main(String[] args) {
        int[] arr = {7,5,4,8,1,2,3};
        int len = Math.ceilDiv(arr.length, 2);
        for (int i = 0; i < len; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                arr[i] ^= arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] ^= arr[i];
                arr[i] ^= arr[arr.length - 1 - i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}