package Day_10;
import java.lang.reflect.Method;
class Example1 {
    private void display(){
        System.out.println("Hello i'm private method");
    }
}

public class Question3_Class {
    public static void main(String[] args) throws Exception {
        Example1 example1 = new Example1();
        Class c = Class.forName("Day_10.Example1");
        Method me =c.getDeclaredMethod("display",new Class[]{});
        me.setAccessible(true);
        me.invoke(example1);
    }
}

/*
Output


 */