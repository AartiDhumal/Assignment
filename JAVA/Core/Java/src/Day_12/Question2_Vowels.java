package Day_12;
/**
 * Count the total number of vowels and consonants in a string.
 */

import java.util.Scanner;

public class Question2_Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vowel_count = 0;
        int consonants_count = 0;
        System.out.println("Enter the String ");
        String word = scanner.nextLine();
        for(int i = 0; i < word.length(); i++){
            String word_without_case = String.valueOf(word.charAt(i));
            if(word_without_case == " ")
                continue;
            else if(word_without_case.equalsIgnoreCase("a")||word_without_case.equalsIgnoreCase("e")
                    ||word_without_case.equalsIgnoreCase("i")||word_without_case.equalsIgnoreCase("o")
                    ||word_without_case.equalsIgnoreCase("u"))
                vowel_count++;
            else
                consonants_count++;
        }
        System.out.println("Vowel count is : "+vowel_count);
        System.out.println("Consonant count is : "+consonants_count);
    }
}



/*
Output

Enter the String
hellojavahowareyou
Vowel count is : 9
Consonant count is : 9

 */