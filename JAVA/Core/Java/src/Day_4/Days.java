package Day_4;

public class Days {
    String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public void print_week_days(){
        for (String day: week){
            System.out.println(day);
        }
    }

    public void print_day_skip(){

        for (String day: week){

            if(day == "Friday")
                continue;

            System.out.println(day);
        }
    }

    public void date_of_month(int current_date){

        for(int i = 1; i <= current_date; i++)
            System.out.println("July "+ i);

        System.out.println("Today is "+ current_date + "July");
    }

    public static void main(String[] args) {
        Days object1 = new Days();
        object1.print_week_days();
        System.out.println("\n");
        object1.print_day_skip();
        System.out.println("\n");
        object1.date_of_month(22);
    }
}


//Output
//  Monday
//  Tuesday
//  Wednesday
//  Thursday
//  Friday
//  Saturday
//  Sunday
//
//
//  Monday
//  Tuesday
//  Wednesday
//  Thursday
//  Saturday
//  Sunday
//
//
//  July 1
//  July 2
//  July 3
//  July 4
//  July 5
//  July 6
//  July 7
//  July 8
//  July 9
//  July 10
//  July 11
//  July 12
//  July 13
//  July 14
//  July 15
//  July 16
//  July 17
//  July 18
//  July 19
//  July 20
//  July 21
//  July 22
//  Today is 22July