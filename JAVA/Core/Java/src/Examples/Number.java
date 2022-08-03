package Examples;

import java.sql.Time;

public class Number {
    public static void main(String[] args) {
        Integer number = 1230, reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        System.out.println("Reverse of no is :"+reverse);

//        StringBuilder s = new StringBuilder(number.toString());
//        System.out.println(s.reverse());
    }
}