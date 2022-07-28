package Day_8;
//by default interfaces methods are ->public and abstract
//by default interface variable are ->public, static, final
//from jdk 1.8 we can implement functions by using static and default keyword
//interface uses "implements" keyword
//you can implement as many interface as you want
//once you implement an any interface you have to implement all its abstract methods.
//so this is agreement between interface and class which is implementing it.
//Rule 6 = you cannot an object of interface
interface Shape_New {
    void area();
    static void display(){
        System.out.println("This is static method");
    }

    default void display_new(){
        System.out.println("This is draw");
    }
}

class Rectangle implements Shape_New {

    @Override
    public void area() {
        int l = 2, w = 5;
        float area = l * w;
        System.out.println("Area is : "+area);
    }

//    @Override
////    public void display_new() {
////        Shape_New.super.display_new();
////        System.out.println("Hello");
////    }
}

public class Main_Driver {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area();
//        rectangle.display_new();
        Shape_New.display();
        Shape_New s = new Rectangle();
        s.display_new();
    }
}