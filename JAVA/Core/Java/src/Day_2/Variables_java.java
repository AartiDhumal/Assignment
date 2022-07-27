package Day_2;

class College {

    int scholarship ;            //instance variable
    static int amount = 20000 ;             //static variable
    void scholarship_avail() {
        int score = 90 ;             //local variable
        System.out.println("Fees amount before scholarship is : "+amount);
        amount = (amount - amount / scholarship) ;
        System.out.println("Fees amount after scholarship is : "+amount+" and score is : "+score);
    }
}

public class Variables_java {
    public static void main(String[] args) {
        College obj = new College();            //creating object of class college
        obj.scholarship=10;
        obj.scholarship_avail();
    }
}