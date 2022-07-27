/**
 1. Create class WageEmployee extending Employee class with attributes as hrs (int) and rate(int) and method computeSalary) to calculate the salary.
 Print the salary and details of WageEmployee.
 (Note: Use the previous Employee classes. Accept the values from the user. Default, Parameterised Constructor and toString() to be written in ll the classes)
 2. Create SalesPerson class extending WageEmployee with attributes as sales(int) and commission (int).
 Override the ComputeSalary() in Salesperson class and print the salary and details of SalesPerson
 3. Create Manager class extending Employee class with attributes as fixed salary(int) and incentives(int) and method computeSalary() to calculate the salary of Manager .Print the salary and details of Manager
 4. Write a TestEmployee class to print the details of all types of employees (use array of Employee class
 */

package Day_7;

import java.util.Arrays;
import java.util.Scanner;

class Employee {
    int id;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee()
    {

    }
    public Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void computesalary(){
        System.out.print("Salary of "+name);
    }
}

class Wage_Employee extends Employee {
    int hrs, rate;
    public Wage_Employee(int id, String name,int rate,int hrs){
        super(id,name);
        this.hrs = hrs;
        this.rate = rate;
    }

    void computesalary(){
        super.computesalary();
        int salary = hrs * rate;
        System.out.println(" is : "+salary);
    }
}

class Sales_Person extends Wage_Employee {
    int sales, commision;
    String name;
    public Sales_Person(int employee_id, String employee_name, int emp_time, int emp_amount, String sales_name, int sales_no, int sales_amount) {
        super(employee_id, employee_name, emp_amount, emp_time);
        this.sales = sales_no;
        this.commision = sales_amount;
        this.name = sales_name;
    }

    @Override
    void computesalary() {
        super.computesalary();
        System.out.println("Salary of "+name+" is "+sales*commision);
    }
}

class Manager extends Employee {
    int fixed_salary, incentives;
    String manager_name;

    public Manager(String name, int manager_salary, int manager_incentives){
        super();
        this.fixed_salary = manager_salary;
        this.incentives = manager_incentives;
        this.manager_name = name;
    }

    @Override
    void computesalary() {
        System.out.println("Salaray of "+manager_name+" is "+(fixed_salary+incentives));
    }
}

public class Employee_Wage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the id and name : ");
        int employee_id = input.nextInt();
        String employee_name = input.next();
        System.out.println("Enter time and rate of employee "+employee_name);
        int emp_time = input.nextInt();
        int emp_amount = input.nextInt();
        System.out.println("Enter the sales employee name, sales no and sales commision ");
        String sales_name = input.next();
        int sales_no = input.nextInt();
        int sales_amount = input.nextInt();
        System.out.println("Enter the Manager name, Fixed Salary and incentives ");
        String manager_name = input.next();
        int manager_salary = input.nextInt();
        int manager_incentives = input.nextInt();
        Employee sales = new Sales_Person(employee_id, employee_name, emp_time, emp_amount, sales_name, sales_no, sales_amount);
        sales.computesalary();
        Employee manager = new Manager(manager_name, manager_salary, manager_incentives);
        manager.computesalary();


        //

        Employee[] emp =new Employee[4];
        emp[0]=new Employee(101,"Usman");
        emp[1]=new Employee(102,"Jaish");
        emp[2]=new Employee(103,"Zulfa");
        emp[3]=new Employee(104,"Arti");


        System.out.println(Arrays.toString(emp));
    }
}


/*
Output

Enter the id and name :
101
usman
Enter time and rate of employee usman
10
500
Enter the sales employee name, sales no and sales commision
jaish
20
1000
Enter the Manager name, Fixed Salary and incentives
anuj
45000
4000
Salary of usman is : 5000
Salary of jaish is 20000
Salaray of anuj is 49000
[Employee{id=101, name='Usman'}, Employee{id=102, name='Jaish'}, Employee{id=103, name='Zulfa'}, Employee{id=104, name='Arti'}]

 */