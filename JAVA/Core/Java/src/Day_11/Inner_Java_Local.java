package Day_11;

class Outer {
    public void display() {
        System.out.println("This is outer");
        class Inner {
            public void display() {
                System.out.println("This is inner");
            }
        }
        Inner inner = new Inner();
        inner.display();
    }
}

public class Inner_Java_Local {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
