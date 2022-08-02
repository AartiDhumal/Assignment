package Day_10;
//this -> it is pointing to the current object
//when parameters name is same use this to diffrentiate local and instance for value assigning purpose

class Teacher {
    private int id;
    private String name;
    private float salary;

    //default constructor
    Teacher(){
        System.out.println("This is default constructor : "+id+" "+name+" "+salary);
    }

    Teacher(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("This is default constructor : "+id+" "+name+" "+salary);
    }
}

public class Teacher_Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher(101,"Usman",45000);
    }
}
