package Day_12;
/*
Using Constructor try to Reinitialize values of class
Employee(emp id,emp_name,emp_address,emp_sal)
 */

class Employee {
    int emp_id;
    String emp_name;
    String emp_address;
    float emp_salary;

    public Employee(int emp_id, String emp_name, String emp_address, float emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_salary = emp_salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                ", emp_salary=" + emp_salary +
                '}';
    }
}

public class Question8_Employee {
    public static void main(String[] args) {
        Employee employee = new Employee(101,"Usman","Bareilly",45000.0F);
        System.out.println(employee.toString());
    }
}


/*

Output

Employee{emp_id=101, emp_name='Usman', emp_address='Bareilly', emp_salary=45000.0}

 */