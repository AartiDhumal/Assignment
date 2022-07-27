package Day_7;

class Rajkapoor {
    int pan_id;
    public void display(){
        System.out.println("Details of grand is :"+pan_id);
    }
}

class RandheerKapoor extends Rajkapoor {
    int pan_id = 5678;
    String name = "Randheer";
    public void display(){
//        super.pan_id = 123;
        super.display();
        System.out.println("Details of Parent is :"+pan_id+" Name is "+name);
    }
    public void display_again(){
        super.pan_id = 4432;
    }
}

class KareenaKapoor extends RandheerKapoor {
    int pan_id = 9999, aadhar = 1111;
    String name = "Kareena";
    public void display(){
//        super.display();
        super.display_again();
        super.display();
        System.out.println("Details of child is :"+pan_id+" aadhar is "+aadhar+" name is "+name);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        KareenaKapoor kareenaKapoor = new KareenaKapoor();
        kareenaKapoor.display();
    }
}