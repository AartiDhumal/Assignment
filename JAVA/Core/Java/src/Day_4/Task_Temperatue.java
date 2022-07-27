package Day_4;

class Temperature{
    void temperature_operation(){
        int temperature_count = 2;
        switch (temperature_count){
            case 1:
                System.out.println("low");
                break;
            case 2:
                System.out.println("medium");
                break;
            case 3:
                System.out.println("high");
                break;
            default:
                System.out.println("abnormal");
        }
    }
}

public class Task_Temperatue {
    public static void main(String[] args) {
        Temperature temperature_object = new Temperature();
        temperature_object.temperature_operation();
    }
}


//Output
//
//medium