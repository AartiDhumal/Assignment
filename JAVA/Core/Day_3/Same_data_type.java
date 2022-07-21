//package Core_Java.Day2;
//
//class Data_Type {
//    void byte_function() {
//        byte num1 = 1, num2 = 2, sum = 0 ;
//        sum = num1 + num2 ;         //java: incompatible types: possible lossy conversion from int to byte
//        System.out.println(sum);
//    }
//
//    void int_function() {
//        int num1 = 1, num2 = 2, sum = 0;
//        sum = num1 + num2 ;         //Sum of int is : 3
//        System.out.println("Sum function of int is : "+sum);
//    }
//
//    void long_function() {
//        long num1 = 6, num2 = 2, sum = 0;
//        sum = num1 + num2 ;         //Sum of long is : 8
//        System.out.println("Sum of long is : "+sum);
//    }
//
//    void float_function() {
//        float num1 = 9, num2 = 2, sum = 0;
//        sum = num1 + num2 ;         //Sum of long is : 11.0
//        System.out.println("Sum of long is : "+sum);
//    }
//
//    void double_function() {
//        double num1 = 9.56, num2 = 2.23, sum = 0;
//        sum = num1 + num2 ;         //Sum of long is : 11.790000000000001
//        System.out.println("Sum of long is : "+sum);
//    }
//
//    void short_function() {
//        short num1 = 4, num2 = 3, sum = 0;
//        sum = num1 + num2 ;         //java: incompatible types: possible lossy conversion from int to short
//        System.out.println("Sum of long is : "+sum);
//    }
//
//    void char_function() {
//        char char1 = 't', char2 = 'u' ;
//        int sum ;
//        sum = char1 + char2 ;         //Sum of char is : 233
//        System.out.println("Sum of long is : "+sum);
//    }
//
//}
//
//public class Same_data_type {
//    public static void main(String[] args) {
//        Data_Type class_obj = new Data_Type();
//        class_obj.byte_function();
//        class_obj.int_function();
//        class_obj.long_function();
//        class_obj.float_function();
//        class_obj.double_function();
//        class_obj.short_function();
//        class_obj.char_function();
//    }
//}