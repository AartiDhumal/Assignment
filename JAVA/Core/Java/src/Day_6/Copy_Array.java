package Day_6;

import java.util.Arrays;

class Copy {
    Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Integer[] array2 = {}, array3 = {};

    void copy_element() {
        array3 = Arrays.copyOfRange(array1,1,6);
        array2 = Arrays.copyOf(array1, array1.length);     //using Arrays.copyof() function to copy from one array to another
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}

public class Copy_Array {
    public static void main(String[] args) {
        Copy copy_array = new Copy();
        copy_array.copy_element();
    }
}


//Output
//
//        [1, 2, 3, 4, 5, 6, 7, 8, 9]
//        [2, 3, 4, 5, 6]