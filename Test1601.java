public class Test1601 {
    public static void main(String[] args) {
        // int[][] data = new int[2][4];
        int[][] data = { {1,3,2,4}, {5,7,6,8} };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
    }
}
