package Day_7;

import java.util.Arrays;
import java.util.Scanner;

class Employee_Details {
    private int salary, time, rate;
    String name;
    int emp_id, number;

    public Employee_Details(int time, int rate, String name, int emp_id, int number) {
        this.time = time;
        this.rate = rate;
        this.name = name;
        this.emp_id = emp_id;
        this.number = number;
        this.salary = time*rate;
    }

    public Employee_Details() {

    }

    @Override
    public String toString() {
        return "Employee " +
                "salary=" + salary +
                ", name=" + name +
                ", emp_id=" + emp_id + "\n";
    }
}

public class Employee_Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of employee : ");
        int emp_number = scanner.nextInt();
        Employee_Details[] emp = new Employee_Details[emp_number];
        for(int i = 0; i < emp_number; i++){
            System.out.println("Enter "+(i+1)+" the employee name, employee id, time and rate :");
            String name = scanner.next();
            int id = scanner.nextInt();
            int time = scanner.nextInt();
            int rate = scanner.nextInt();
            emp[i] = new Employee_Details(time, rate, name, id, emp_number);
        }
        System.out.printf(Arrays.toString(emp));
    }
}