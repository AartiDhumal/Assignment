package Day_9;
/*
Write a program for Addition operation,
Class Addition{
    ->add method overloading for add()
Class Varargs_Addition
    ->use varargs for add method
Class MainApplication{
    ->access above classes in main()
*/


class Addition {
    void add(float num1, float num2) {
        System.out.println("Sum of number is "+(num1+num2));
    }
    void add(int num1, int num2) {
        System.out.println("Sum of number is "+(num1+num2));
    }
}

class Var_Addition {
    void add_new(int... number) {
        int sum=0;
        for (int index: number)
            sum = sum + index;
        System.out.println("Sum of Var_Args no is : "+sum);
    }
    void add_new(float... number) {
        float sum = 0;
        for (float index: number)
            sum = sum + index;
        System.out.println("Sum of Var_Args no is : "+sum);
    }
}

public class Question4_MainApplication {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(4,6);
        addition.add(1.4f,3);
        Var_Addition var_addition;
        var_addition = new Var_Addition();
        var_addition.add_new(10,4,7,2);
        var_addition.add_new(2.5f,2,6.5f,1);
    }
}

/*
Output

Sum of number is 10
Sum of number is 4.4
Sum of Var_Args no is : 23
Sum of Var_Args no is : 12.0

*/