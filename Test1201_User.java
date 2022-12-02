public class Test1201_User {
    public static void main(String[] args) {
        Test1202_Car[] myCar = new Test1202_Car[4];
        
        for (int i = 0; i < 4; i++) {
            myCar[i] = new Test1202_Car();
            myCar[i].wheel[0] = i;
            myCar[i].wheel[1] = i + 1;
            myCar[i].wheel[2] = i + 2;
            myCar[i].wheel[3] = i + 3;
            System.out.printf("%d\t%d\t%d\t%d\n", myCar[i].wheel[0], myCar[i].wheel[1], myCar[i].wheel[2], myCar[i].wheel[3]);
            int z = myCar[i].launch(7);
            System.out.println(z);
        }
    }
}