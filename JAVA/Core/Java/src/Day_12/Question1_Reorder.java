package Day_12;
/*
 * Accept the strings(HARD CODE VALUES/USER ACCEPTED),as per their length and reorder it.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Question1_Reorder {
    public static void main(String[] args) {
        String[] name = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 names : ");
        for(int i = 0; i < 5; i++){
            name[i] = scanner.next();
        }
        Arrays.sort(name, Comparator.comparingInt(String::length));
        System.out.println("Array after sorting is : ");
        for(int i = 0; i < 5; i++){
            System.out.println(name[i]);
        }
    }
}


/*
Output

Array after sorting is :
lo
anu
anuj
usman
barkaati

 */