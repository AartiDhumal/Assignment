package Core_Java.Day_7;

//parent
class Shape {
    public void area(){
        System.out.println("This is shape area()");
    }
}

//child
class Circle extends Shape {
    public void area(){
        int radius = 10;
        float area = 0.0f;
        area = (float) Math.PI * radius * radius;
        System.out.println("Area of circle is :"+area);
    }
}

//driver class
public class CircleDemo {
    public static void main(String[] args) {
        //Way1 parent calss object
        Shape shape = new Shape();
        shape.area();

        //way2 child class object with parent refernece
//        Shape shape1 = new Circle();
//        shape1.area();

        //way 3 child object
//        Circle obj = new Circle();
//        obj.area();
    }
}