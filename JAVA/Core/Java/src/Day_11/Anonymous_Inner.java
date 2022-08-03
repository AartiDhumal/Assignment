package Day_11;

interface Animal {
    void sleep();
    void eat();
}

public class Anonymous_Inner {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void sleep() {
                System.out.println("So rha hu ");
            }

            @Override
            public void eat() {
                System.out.println("Kha rha hu ");
            }
        };
        animal.eat();
        animal.sleep();
    }
}
