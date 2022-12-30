public class Test1502 {
    public static void main(String[] args) {
        int[] arr = {7,5,4,9,8,1,2};
        int num = 3;
        float[] result = new float[Math.ceilDiv(arr.length, num)];
        int remain = 0;
        int sum;

        for (int i = 0; i < arr.length; i += num) {
            remain = arr.length - i;
            if (remain > num) {
                remain = num;
            }
            sum = 0;
            for (int j = i; j < i + remain; j++) {
                sum += arr[j];
            }
            result[(i / num)] = (float) sum / remain;
        }

        for (int k = 0; k < result.length; k++) {
            System.out.println(result[k]);
        }
    }
}