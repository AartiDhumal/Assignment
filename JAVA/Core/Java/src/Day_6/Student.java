package Day_6;
//encap, POJO, Bean
class Student_details {
    private int roll_no;
    private String name, address;
    private float marks;

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student_details{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class Student {
    public static void main(String[] args) {
        Student_details student = new Student_details();
        student.setName("Usman");
        student.setRoll_no(121);
        student.setMarks(90.5f);
        student.setAddress("Mumbai");
        System.out.println(student.toString());
    }
}