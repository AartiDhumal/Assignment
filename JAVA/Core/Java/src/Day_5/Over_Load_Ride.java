package Day_5;

class Overload {

    static void function_print(){
        System.out.println("This is parent class ");
    }
    static void function1(int x) {
        System.out.println(x);
    }

    static void function1(int x, int y) {
        System.out.println(x+y);
    }
}

class Overriding extends Overload {
    static void function_print() {
        System.out.println("This is child class ");
    }
}

public class Over_Load_Ride {
    public static void main(String[] args) {
        int x = 90, y = 60;
        Overload.function1(x);
        Overload.function1(x,y);
        Overload object = new Overriding();
        object.function_print();
    }
}