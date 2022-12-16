public class Test1402 {
    public static void main(String[] args) {
        int[] arr = {7,5,4,9,8,1,2};
        int[] result = new int[4];

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
            result[2] += arr[i];
            if (i == 0) {
                result[1] = arr[i];
            }
            if (i == arr.length - 1) {
                result[0] = arr[i];
                result[2] /= arr.length;
            }
            if (i == Math.floorDiv(arr.length, 2)) {
                result[3] = arr[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
