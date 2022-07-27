package Core_Java.Day6;

import java.util.Arrays;
public class Array {
    public static void main(String args[]) {
        Integer arr[] = {1, 2, 3, 4, 5, 6};
        //converting arrays into list
        Arrays.toString(arr);
        System.out.println("The Integer Array as a List = " + Arrays.asList(arr));

        //sorting of arrays
        Arrays.sort(arr);
        int arr_element = 5;
        //sorting of the array i.e,Binary Search
        System.out.println(arr_element + " is found at index = " + Arrays.binarySearch(arr, arr_element));
        // static <T> int binarySearch(T[] an int fromIndex, int toIndex, T key, Comparator<T> c): This method would
        // search the range of mentioned array for a specified object making use of binary search algorithm.
        Arrays.sort(arr);
        int ele = 6;
        System.out.println(ele
                + " is found at index = "
                + Arrays.binarySearch(arr, 1, 3, ele));
        // this is to showcase compareUnsigned() method
        int m[] = {10, 11, 12, 13, 14};
        int n[] = {20, 30, 40, 50, 60};
// as 10 less than 20, the output would be a value less than zero
//        System.out.println(Arrays.compare(m, n));

        //copy method copies the mentioned array, truncates it or pads it with a default value but only if necessary so
        // that copy has got the mentioned length.
        System.out.println("Integer Array is: "
                + Arrays.toString(Arrays.copyOf(arr, 10)));
    }
}