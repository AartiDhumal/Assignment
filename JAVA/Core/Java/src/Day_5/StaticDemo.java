package Day_5;

//Rule_1: always use static variable inside the static method
//static is called as initializer block or it is called as load initializer block
//within static block we can work with local as well as static variable

public class StaticDemo {
    String name="Batch2";
    static int aadhar_card=12345;

    //non-static
    public void accept_data(){
        System.out.println("Name : "+name+" aadhar "+aadhar_card);
    }

    //static method
    public static void accept(){
        System.out.println("Name :  aadhar "+aadhar_card);
    }

    static {
        System.out.println("one");
    }

    static {
        System.out.println("two");
    }

    static {
        System.out.println("three");
    }

    static {
        System.out.println("four");
    }

    static {
        int x=123;   //within static block we can work with local as well as static variable
        System.out.println("five"+x);
    }


    //main
    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        obj.accept_data();
        StaticDemo.accept();
    }
}
