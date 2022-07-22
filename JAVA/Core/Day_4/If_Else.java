package Core_Java.Day4;

class Weekday{
    int day = 3;
    void weekday_fun(){
        switch (day){
            case 1 : System.out.println("monday");
                break;

            case 2 : System.out.println("tuesday");
                break;

            case 3 : System.out.println("wednesday");
                break;

            case 4 : System.out.println("thursday");
                break;

            case 5 : System.out.println("friday");
                break;

            case 6 : System.out.println("saturday");
                break;

            case 7 : System.out.println("sunday");
                break;

            default:
                System.out.println("Wrong input");
        }
    }
}

public class If_Else {
    public static void main(String[] args) {
        Weekday weekobj = new Weekday();
        weekobj.weekday_fun();
    }
}


//Output
//
//wednesday