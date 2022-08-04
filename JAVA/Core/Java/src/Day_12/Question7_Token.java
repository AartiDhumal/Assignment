package Day_12;
/**
 * Separate the tokens(operands and operators) from below statement:
 * 3+(20%2) (20/2)
 * Case 1)Print separated tokens
 * Case 2)Print Operators and Operand separately
 */

import java.util.StringTokenizer;

public class Question7_Token {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("3+(20%2)*(20/2)", "+%*/()", false);
        System.out.println("Operands are : ");
        while (stringTokenizer.hasMoreTokens())
            System.out.print(stringTokenizer.nextToken() + " ");
        System.out.println();
        StringTokenizer stringTokenizer1 = new StringTokenizer("3+(20%2)*(20/2)", "320", false);

        System.out.println("Operator are : ");
        while (stringTokenizer1.hasMoreTokens())
            System.out.print(stringTokenizer1.nextToken()+" ");
    }
}


//What if we added more numbers in string ,so generalise it
/*

Output

Operands are :
3 20 2 20 2
Operator are :
+( % )*( / )

 */
