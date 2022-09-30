public class Test {
    public static void main(String[] avgs) {
        int num = 1;
        printStr("" + num);
        num = 2;
        printStr("" + num);
        num = num + 1;
        printStr("" + num);
        num += 1;
        printStr("" + num);
        ++ num;
        printStr("" + num);
        num ++;
        printStr("" + num);
    }

    public static void printStr(String str) {
        System.out.println(str);
    }
}