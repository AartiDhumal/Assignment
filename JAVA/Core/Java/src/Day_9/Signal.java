package Day_9;
/*
Write a program using enum which will print following output
Add enum RED('STOP"),GREEN("GO"),YELLOw"DRIVE VERY SLOW")
Try to print values
RED MEANS STOP
GREEN MEANS GO
YELLOW MEANS DRIVE VERY SLOW
*/
enum Signal_Case {
    RED("Stop"),
    YELLOW("Drive very slowly"),
    GREEN("Go");

    private String check;

    Signal_Case(String str) {
        this.check = str;
    }

    public String get_result(){
        return check;
    }
}

public class Signal {
    static void show() {
        for(Signal_Case signal_case : Signal_Case.values()){
            System.out.println(signal_case.name()+" Means "+signal_case.get_result());
        }
    }
    public static void main(String[] args) {
        Signal.show();
    }
}

/*

Output

RED Means Stop
YELLOW Means Drive very slowly
GREEN Means Go

*/