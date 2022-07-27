package Day_6;

import java.util.*;

class Sort_Array {
    Integer[] array = {4, 6, 3, 90, 43, 23, 76, 43, 11, 31};
    public void sort_increasing() {
        Arrays.sort(array);
        System.out.println("Array after sorting in increasing order");
        for (int index:array) {
            System.out.print(index+" ");
        }
        System.out.println();
    }

    public void sort_descending() {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Reverse order of array is : ");
        System.out.println(Arrays.toString(array));
    }
}

public class Sort {
    public static void main(String[] args) {
        Sort_Array arrays = new Sort_Array();
        arrays.sort_increasing();
        arrays.sort_descending();
    }
}


//Output
//        Array after sorting in increasing order
//        3 4 6 11 23 31 43 43 76 90
//        Reverse order of array is :
//        [90, 76, 43, 43, 31, 23, 11, 6, 4, 3]