package Day_2;

public class Types_of_Variables {

    //instance variable;
    int pan_number;
    String name;

    //static variable
    static int age;


    public void add(){
        //local variable =>1) you have to initialize local variable at the time of declaration
        int num1 = 0, num2 = 0, sum = 0;
        sum = num1 + num2;
        System.out.println("Name is : "+name+" and pan is :"+pan_number+" age is "+age);
        System.out.println("Sum is :"+sum);
    }



    public static void main(String args[]){
        //class_name reference_name = new class_name();
        //new => will help in creating DYNAMIC memory
        //R To L
        Types_of_Variables typesOfVariables = new Types_of_Variables();
        typesOfVariables.add();

    }
}
