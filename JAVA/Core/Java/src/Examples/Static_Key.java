package Examples;

class Static_Test {
    static int number;
    static void print() {
        System.out.println("Number is "+number);
        number = 40;
    }
}

public class Static_Key {
    public static void main(String[] args) {
        Static_Test.number = 30;
        Static_Test.print();
        Static_Test.number = 50;
        Static_Test.print();
    }
}
