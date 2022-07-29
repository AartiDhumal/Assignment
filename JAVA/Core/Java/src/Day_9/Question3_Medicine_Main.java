package Day_9;
/**
Create a class Medicine to represent a drug manufactured by a pharmaceutical company.
Provide a function display Label() in this class to print Name and address of the company.
Derive Tablet, Syrup and Ointment classes from the Medicine class.
Override the displayLabel() function in each of these classes to print
additional information suitable to the type of medicine.
[2:23 PM] For example, in case of tablets, it could be "store in a cool dry place",
in case of ointments it could be "for external use only" etc. Create a class TestMedicine.
Write main function to do the following: Declare an array of Medicine references of size 10
Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3.
Refer Java API Documentation to find out random generation features.
Check the polymorphic behavior of the displayLabel() method.
 */

import java.util.Random;

abstract class Medicine {
    static int a = 0;
    abstract void displayLabel();
}

class Tablet extends Medicine {
    @Override
    void displayLabel() {
        System.out.println("Store in cool dry place");
    }
}

class Syrup extends Medicine {
    @Override
    void displayLabel() {
        System.out.println("Store in cool place and shake it before consuming");
    }
}

class ointment extends Medicine {
    @Override
    void displayLabel() {
        System.out.println("For external use only");
    }
}

public class Question3_Medicine_Main {
    public static void main(String[] args) {
        System.out.println("Company is Sun-Pharma and address is Himachal");

        Medicine[] medicines = new Medicine[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++){

            int number = random.nextInt(3)+1;

            if (number == 1)
                medicines[i] = new Tablet();
            else
                if (number == 2)
                medicines[i] = new Syrup();
            else
                medicines[i] = new ointment();
        }
        for (int i = 0; i < 10; i++){
            medicines[i].displayLabel();
        }
    }
}



/*
Output

Company is Sun-Pharma and address is Himachal
Store in cool dry place
Store in cool place and shake it before consuming
Store in cool place and shake it before consuming
For external use only
For external use only
Store in cool dry place
Store in cool place and shake it before consuming
For external use only
Store in cool place and shake it before consuming
Store in cool place and shake it before consuming

 */