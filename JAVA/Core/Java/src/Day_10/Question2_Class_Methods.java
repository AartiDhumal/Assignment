package Day_10;
/**
 Try all methods of "Class" for variables, methods, fields and class
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Example {
    public String name;
    public int pan_id;

    public Example() {
        System.out.println("Without Parameter");
    }

    public Example(String name) {
        this();
        this.name = name;
        System.out.println("With 1 Parameter and name is "+name);
    }

    public Example(String name, int pan_id) {
        this(name);
        this.pan_id = pan_id;
        System.out.println("With 2 parameter and id is "+pan_id);
    }

    private void display(){
        System.out.println("Hello i'm private method");
    }
}


public class Question2_Class_Methods {
    public static void main(String[] args) throws Exception {
        Example example = new Example("Usman",101);

        //Class Name Print
        Class c = Class.forName("Day_10.Example");
        System.out.println("*************(Class Name)****************");
        System.out.println("name of class is : "+c.getName());
        System.out.println("package name is : "+c.getPackage());
        System.out.println("Modifier of class : "+c.getModifiers());
        System.out.println("Super Class "+c.getSuperclass());

        //Constructor Printing
        System.out.println("*************(Constructors)****************");
        Constructor[] constructor = c.getConstructors();
        for(Constructor constructor1: constructor)
            System.out.println(constructor1+" "+constructor1.getModifiers());

        //Methods Printing
        System.out.println("****************(Methods)*******************");
        Method[] methods = c.getMethods();
        for(Method method: methods)
            System.out.println(method.getName());

        //Fields Printing
        System.out.println("****************(Fields)*******************");
        Field[] fields = c.getFields();
        for (Field field: fields)
            System.out.println(field);
    }
}


/*
Output

Without Parameter
With 1 Parameter and name is Usman
With 2 parameter and id is 101
*************(Class Name)****************
name of class is : Day_10.Example
package name is : package Day_10
Modifier of class : 0
Super Class class java.lang.Object
*************(Constructors)****************
public Day_10.Example(java.lang.String,int) 1
public Day_10.Example(java.lang.String) 1
public Day_10.Example() 1
****************(Methods)*******************
wait
wait
wait
equals
toString
hashCode
getClass
notify
notifyAll
****************(Fields)*******************
public java.lang.String Day_10.Example.name
public int Day_10.Example.pan_id
 */