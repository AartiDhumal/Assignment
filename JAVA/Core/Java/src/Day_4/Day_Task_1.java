package Day_4;

class Number{
        void number_function(){
            int number1 = 3;
            if(number1 >= 0)
                if(number1 == 0)
                    System.out.println("First");
                else
                    System.out.println("Second");
            System.out.println("Third");
        }
}

public class Day_Task_1 {

    public static void main(String[] args) {
        Number class_object = new Number();
        class_object.number_function();
    }
}


//Output
//
//        Second
//        Third