package Day_9;
/*
2. Practically prove, After changing the return type overloading happens or not?
3. Practically prove, After changing the return type, overriding happens or not?
*/


class Test {
    void print() {
        System.out.println("Parent overriding");
    }
    void display() {
        System.out.println("Without argument");
    }
    int display(int number) {
        System.out.println("With argument");
        return 0;
    }
}

class Result extends Test {
    void print() {
    //    int print() {
        super.print();
        System.out.println("Overriding");
    }
}

public class Question2_3_Overriding {
    public static void main(String[] args) {
        Test test;
        test = new Result();
        test.print();
        test = new Test();
        test.display(1);
        test.display();
    }
}


/*
1. Case Output, when return type is different in both the methods

java: print() in Day_9.Result cannot override print() in Day_9.Test
return type int is not compatible with void

2. Case Output, when return type is same of both methods

Parent overriding
Overriding
With argument
Without argument

*/