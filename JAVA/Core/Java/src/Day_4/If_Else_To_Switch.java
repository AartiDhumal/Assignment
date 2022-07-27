package Day_4;

class If_Else_Operations {
    void if_else() {
        int number = 1, x = 1;
        if( number == 0 ) {
            x = x + 2;
            System.out.println("X = "+x);
        }
        else if ( number == 1 ) {
            x = x + 4;
            System.out.println("X = "+x);
        }
        else if ( number == 2 ) {
            x = x + 6;
            System.out.println("X = "+x);
        }
    }
}

public class If_Else_To_Switch {
    public static void main(String[] args) {
        If_Else_Operations if_else_object = new If_Else_Operations();
        if_else_object.if_else();
    }
}


//Output
//
//X = 5