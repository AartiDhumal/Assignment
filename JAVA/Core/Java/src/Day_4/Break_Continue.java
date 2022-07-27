package Day_4;

class Break_Continue_Class{
    void Break_function() {
        for (int num = 1; num <= 10; num++) {
            if(num == 3)
                continue;
            if(num == 9)
                break;
            System.out.println(num);
        }
    }
}

public class Break_Continue {
    public static void main(String[] args) {
        Break_Continue_Class break_obj = new Break_Continue_Class();
        break_obj.Break_function();
    }
}


//Output
//
//        1
//        2
//        4
//        5
//        6
//        7
//        8