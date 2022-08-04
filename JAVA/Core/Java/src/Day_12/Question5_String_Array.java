package Day_12;
/*
Accept 5 names of string type, count the length.and as per their length assign there
order (Ascending).
=>Replace above strings "vowel characters" with their next letter.
=>Ex. "Aarti" => Vowels present here are = =>a(2),i(1)
=>next character of "a" is "b" and for "i" its "j"
->so,final string will be "bbrti"
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Question5_String_Array {
    public static void main(String[] args) {
        String[] name = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 names : ");
        for(int i = 0; i < 5; i++){
            name[i] = scanner.next();
        }
        Arrays.sort(name, Comparator.comparingInt(String::length));
        for(int i = 0; i < 5; i++){
            char[] name_new = name[i].toCharArray();
            for(int j = 0; j < name[i].length(); j++){
                if(name_new[j] == 'a'||name_new[j] == 'e'||name_new[j] == 'i'||name_new[j] == 'o'||name_new[j] == 'u'){
                    char namee = name_new[j];
                    name_new[j] = ++namee;

                }
            }
            name[i] = String.valueOf(name_new);
        }
        System.out.println("String after incrementing vowel are : ");
        for (int i = 0; i < 5; i++){
            System.out.print(name[i]+"  ");
        }
    }
}

/*
Output

Enter 5 names :
jaish
usmanbarkaati
anuj
anu
zulfa
String after incrementing vowel are :
bnv  bnvj  jbjsh  zvlfb  vsmbnbbrkbbtj
 */