package Day_12;

/**
 * Convert String data into array and present it.
 */
public class Question6_String_to_Array {
    public static void main(String[] args) {

        String name = "usmanbarkaati";

        char[] name1 = new char[name.length()];

        for(int i = 0; i < name.length(); i++){
            name1[i] = name.charAt(i);
        }

        System.out.println("Character array is :");

        for(int i=0; i < name1.length; i++){
            System.out.print(name1[i]+" ");
        }
    }
}



/*
Output

Character array is :
u s m a n b a r k a a t i
 */