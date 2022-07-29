package Day_9;
/**
1. CREATE A CLASS NAMED SHAPE, WHICH CONTAINS ONLY SINGLE
METHOD,calculateArea(). THIS METHOD SHOULD HAVE "N" NUMBER OF
PARAMETERS FOR DIFFERENT SHAPES LIKE FOR|
CIRCLE,RECTANGLE, TRIANGLE
*/


abstract class Shape {
    abstract void calculateArea(int... side);
}

class Circle extends Shape {
    @Override
    void calculateArea(int... side) {
        float area = (float)(Math.PI*side[0]*side[0]);
        System.out.println("Area of circle is : "+area);
    }
}

class Rectangle extends Shape {
    @Override
    void calculateArea(int... side) {
        float area = (side[0]*side[1]);
        System.out.println("Area of rectangle is : "+area);
    }
}

class Triangle extends Shape {
    @Override
    void calculateArea(int... side) {
        float area = (float)(0.5*side[0]*side[1]);
        System.out.println("Area of triangle is : "+area);
    }
}

public class Question1_Shape {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle();
        shape.calculateArea(10);
        shape = new Rectangle();
        shape.calculateArea(7,14);
        shape = new Triangle();
        shape.calculateArea(8,5);
    }
}

/*

Output

Area of circle is : 314.15927
Area of rectangle is : 98.0
Area of triangle is : 20.0

*/