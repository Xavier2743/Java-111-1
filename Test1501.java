import java.util.Scanner;

public class Test1501 {
    public static void main(String[] args) {
        int[] arr = {7,5,4,9,8,1,2};
        int[] flag = new int[arr.length];
        int flag_count = 1;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();
        input.close();

        int mid = 0;
        for (int i = 0; i < num; i++) {
            int flag_min = 1000;
            int flag_min_index = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < flag_min && flag[j] == 0) {
                    flag_min = arr[j];
                    flag_min_index = j;
                }
            }
            flag[flag_min_index] = flag_count;
            flag_count ++;
            mid = arr[flag_min_index];
        }

        System.out.println(mid);
    }
}
