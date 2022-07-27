package Day_6;

import java.util.*;

class Find_Element {
    int[] array = {6, 5, 23, 9, 2, 1, 90, 34, 21, 66};
    void find_element(int n) {
        Arrays.sort(array);
        System.out.println(n+"rd largest Element is : "+array[10-n]);
    }
}

public class N_Element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the N element position : ");
        int user_input = s.nextInt();
        Find_Element element = new Find_Element();
        element.find_element(user_input);
    }
}


//Output
//
//        Enter the N element position :
//        4
//        4rd largest Element is : 23