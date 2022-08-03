package Day_10;

import java.lang.reflect.Method;

class Example2 {
    private void display(int number){
        System.out.println("Number is : "+number);
    }
}
public class Question4_Parameter {
        public static void main(String[] args) throws Exception {
            Day_10.Example2 example2 = new Day_10.Example2();
            Class c = Class.forName("Day_10.Example2");
            Method me =c.getDeclaredMethod("display",new Class[]{int.class});
            me.setAccessible(true);
            me.invoke(example2,10);
        }
}

/*

Output
Number is : 10
 */