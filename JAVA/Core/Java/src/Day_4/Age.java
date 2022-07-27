package Day_4;

import java.util.Scanner;

class Age_Operation {
    void age_operation() {
        int age1, age2, age3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of each person : ");
        age1 = sc.nextInt();
        age2 = sc.nextInt();
        age3 = sc.nextInt();
        if( age1 > age2 && age1 > age3 ) {
            System.out.println("Oldest age is : " + age1);
            if( age2 > age3)
                System.out.println("Youngest age is : "+age3);
            else
                System.out.println("Youngest age is : "+age2);
        }
        else if ( age2 > age1 && age2 > age3 ) {
            System.out.println("Oldest age is : " + age2);
            if( age1 > age3)
                System.out.println("Youngest age is : "+age3);
            else
                System.out.println("Youngest age is : "+age1);
        }
        else if ( age3 > age1 && age3 > age2 ) {
            System.out.println("Oldest age is : " + age3);
            if( age1 > age2)
                System.out.println("Youngest age is : "+age2);
            else
                System.out.println("Youngest age is : "+age1);
        }
    }
}

public class Age {

    public static void main(String[] args) {
        Age_Operation age_object = new Age_Operation();
        age_object.age_operation();
    }
}


//OUTPUT:
//    Enter the age of each person :
//        78
//        12
//        53
//        Oldest age is : 78
//        Youngest age is : 12