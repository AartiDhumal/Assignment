package Day_8;
//if you are declaring any method in nirmal class  you have to declare it as abstract method
//if any class contain abstract method that class need to be declared as an abstract class
//in any abstract class you can add "n"(0...n) number of abstract as well as concrete method
//if you extend an abstract class, it is child class responsibility to implement abstract method
//you cannot create an object of an abstract class
abstract class Shape {
    //abstract method=>declaration
    public abstract void area();

    //normal/concrete method
    public void display(){
        System.out.println("This is shape display");
    }
}

class Circle extends Shape {
    @Override
    public void area(){
        int radius = 2;
        float area = (float) Math.PI*radius*radius;
        System.out.println("Area of circle is : "+area);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
    }
}