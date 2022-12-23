public class Test1403 {
    public static void main(String[] args) {
        int[] arr = {7,5,4,9,8,1,2};
        
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        float avg = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
            for (int j = 0; j < arr.length; j++) {
                
            }
        }
        avg = (float) sum / arr.length;

        // mid
        int temp_mid = max;
        int temp_min = min;
        for (int i = 0; i < 3; i++) {
            temp_mid = max;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > temp_min && arr[j] < temp_mid) {
                    temp_mid = arr[j];
                }
            }
            temp_min = temp_mid;
        }
        int mid = temp_mid;

        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
        System.out.println(mid);
    }
}
