package Day_5;

class Demo_Class {

    //Static Block
    static {
        int number = 10;
        System.out.println("Hello Usman Your Roll No. Is : "+number);
    }

    //static class
    static class Demo_Class_inner {

        //static variable
        static String pan_card = "EAAPB9737F";

        //static method
        static void document() {
            int employee_number = 310;
            System.out.println("Employee : "+employee_number+" have pan no : "+pan_card);
        }
    }
}

public class Static_Cases {
    public static void main(String[] args) {
        Demo_Class d= new Demo_Class();
        Demo_Class.Demo_Class_inner.document();
    }
}