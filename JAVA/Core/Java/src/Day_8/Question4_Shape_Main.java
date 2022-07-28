package Day_8;

import java.util.Scanner;

abstract class Shape_Type {
    abstract void area();
}

class Circle_New extends Shape_Type {
    int radius;

    public Circle_New() {
    }

    public Circle_New(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        float area = (float)(Math.PI*radius*radius);
        System.out.println("Area of Circle is : "+area);
    }
}

class Cylinder extends Circle_New {
    int radius, height;
    public Cylinder(int radius, int height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    @Override
    void area() {
        float area = (float)(2*(Math.PI)*radius*height);
        System.out.println("Area of Cylinder is : "+area);
    }
}

class Square extends Shape_Type {
    int side;
    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    void area() {
        float area = side*side;
        System.out.println("Area of Square is : "+area);
    }
}

class Rectangle_New extends Square {
    int length, width;
    public Rectangle_New(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        int area = length*width;
        System.out.println("Area of Rectangle is : "+area);
    }
}

public class Shape_Main {
    public static void main(String[] args) {
        Shape_Type[] shape_types = new Shape_Type[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of shapes ");
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            int type = (int)(Math.random()*100);
            if(type >= 0 && type <=25){
                shape_types[i] = new Circle_New(12);
                shape_types[i].area();
            }
            else if (type >= 26 && type <=50) {
                shape_types[i] = new Square(12);
                shape_types[i].area();
            }
            else if (type >= 51 && type <=75) {
                shape_types[i] = new Cylinder(6,12);
                shape_types[i].area();
            }
            else if (type >= 76 && type <= 100) {
                shape_types[i] = new Rectangle_New(10,5);
                shape_types[i].area();
            }
        }
    }
}