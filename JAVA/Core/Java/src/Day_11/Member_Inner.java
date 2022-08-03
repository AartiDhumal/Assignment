package Day_11;

public class Member_Inner {
    class Inner {
        void show() {
            System.out.println("inner ");
        }
    }
    void show() {
        System.out.println("Outer ");
    }
    public static void main(String[] args) {
        Member_Inner m1 = new Member_Inner();
        m1.show();
        Member_Inner.Inner m2 = m1.new Inner();
        m2.show();
    }
}
