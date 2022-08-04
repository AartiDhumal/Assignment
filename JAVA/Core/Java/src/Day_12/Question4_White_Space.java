package Day_12;
/**
 * Remove both leading and trailing white space characters from the given string and
 * also showcase the Unicode value of the character present at index 5.
 */

public class Question4_White_Space {
    public static void main(String[] args) {
        String name = "        Mohd Usman Barkaati             ";
        String new_name = "";
        int rear = 0;
        int back = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) != ' ')
                break;
            rear++;
        }
        for(int i = name.length() - 1; i > 0; i--) {
            if(name.charAt(i) != ' ')
                break;
            back++;
        }
        for(int i = 0; i < name.length() - back; i++){
            if(i >= rear)
                new_name = new_name + name.charAt(i);
        }
        System.out.println("New String is : "+new_name);

        String unicode = String.format("\\u%04x",(int)new_name.charAt(5));
        System.out.println("Unicode value of "+new_name.charAt(5)+" is : "+unicode);
    }
}


/*
Output

New String is : Mohd Usman Barkaati
Unicode value of U is : \u0055

 */