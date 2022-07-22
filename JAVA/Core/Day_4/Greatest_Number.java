package Core_Java.Day4;

import java.util.Scanner;

class Greater_Number_Two {
    int greatest_number(int num1, int num2) {
        if( num1 > num2 )
            return num1;
        else
            return num2;
    }
}

public class Greatest_Number {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        num1 = sr.nextInt();
        num2 = sr.nextInt();
        Greater_Number_Two greater_object = new Greater_Number_Two();
        System.out.println("Greater of "+num1+" and "+num2+" is "+greater_object.greatest_number(num1, num2));
    }
}

//Output
//
//        Enter the two numbers :
//        6
//        3
//        Greater of 6 and 3 is 6