public class Test1203 {
    public static void main(String[] args) {
        int[] iArr = {7,3,4,9,6};

        for (int i = 0; i < iArr.length - 1; i++) {
            for (int j = 0; j < iArr.length - 1 - i; j++) {
                if (iArr[j] > iArr[j + 1]) {
                    iArr[j] ^= iArr[j + 1];
                    iArr[j + 1] ^= iArr[j];
                    iArr[j] ^= iArr[j + 1];
                }
            }
        }

        for (int i = 0; i < iArr.length; i++) {
            System.out.println(">>" + iArr[i]);
        }
    }
}
