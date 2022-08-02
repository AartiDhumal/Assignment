package Day_10;

/**
 What is constructor chaining?
 */

class Constructor_Main {
    String name;
    int pan_id;

    public Constructor_Main() {
        System.out.println("Without Parameter");
    }

    public Constructor_Main(String name) {
        this();
        this.name = name;
        System.out.println("With 1 Parameter and name is "+name);
    }

    public Constructor_Main(String name, int pan_id) {
        this(name);
        this.pan_id = pan_id;
        System.out.println("With 2 parameter and id is "+pan_id);
    }
}

public class Question1_Constructor {
    public static void main(String[] args) {
        Constructor_Main constructor = new Constructor_Main("Usman", 101);
    }
}


/*

Output

Without Parameter
With 1 Parameter and name is Usman
With 2 parameter and id is 101
 */