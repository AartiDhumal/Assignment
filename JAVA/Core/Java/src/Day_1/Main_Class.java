package Day_1;

public class Main_Class {
    public static void main() {
        System.out.println("Hello main class 1");
    }
    public static void main(int n) {
        System.out.println("calling 2nd main method "+n*n);
    }
    public static void main(String args[]) {
        System.out.println("main method");
        main();
        main(5);
    }
}