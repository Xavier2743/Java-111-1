public class Test1103 {
    public static void main(String[] args) {
        int myKilometer = 50, price = 0;

        if (myKilometer <= 7) {
            price = 85;
        }
        else {
            price = 85 + (myKilometer - 7) * 5;
        }
        
        System.out.println("需付" + price + "元");
    }
}
