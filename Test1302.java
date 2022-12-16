public class Test1302 {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                System.out.println("index of 2 = " + i);
                break;
            }
        }
    }
}
