package Day_12;

/**
 * Remove all repeated characters from a given string.
 */
public class Question3_Remove_Repeated_Char {
    public static void main(String[] args) {
        String name = "iiiiiiiijjjjjjkkkkkkkllllllllmmmmmmmnnnnnnnn";
        String new_name = "";
        for(int i = 0; i < name.length(); i++){
            int count = 1;
            for(int j = i + 1; j < name.length(); j++){
                if(name.charAt(i) == name.charAt(j))
                    count++;
            }
            if(count == 1)
            new_name = new_name + name.charAt(i);
        }
        System.out.println(new_name);
    }
}


/*
Output

ijklmn
 */