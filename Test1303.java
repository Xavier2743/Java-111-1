public class Test1303 {
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

        int searchValue = 2;
        int middleIndex = (int) Math.floor(Math.log(arr.length));
        int index = middleIndex;
        int a = 0;
        int b = arr.length;
        for (int i = 0; i < middleIndex; i++) {
            System.out.println("current index: " + index);
            if (arr[index] < searchValue) {
                a = index;
            }
            else if (arr[index] > searchValue) {
                b = index;
            }

            index = Math.floorDiv(a + b, 2);

            if (arr[index] == searchValue) {
                System.out.println("final index: " + index);
                break;
            }
        }
    }
}
