package Examples;

class Over_ridding {
     void print(){
        System.out.println("Hello");
    }
}

class Ridding_over extends Over_ridding {
     void print() {
         super.print();
        System.out.println("Hello 1");
    }
}

public class Override {
    public static void main(String[] args) {
        Over_ridding over_ridding = new Ridding_over();
        over_ridding.print();
    }
}
