package Day_6;

class Customer_Detail {
    private String name = "Usman", address = "Pune", ac_no = "12463562368";
    private int customer_id = 1023;
    private float amount = 20678.50f;
    void information(int check) {
        if(check == customer_id) {
            System.out.println("Name of customer is : "+name);
            System.out.println("Account no is : "+ac_no);
            System.out.println("Available amount is : "+amount);
            System.out.println("Address of customer is : "+address);
        }
        else
            System.out.println("No customer exist");
    }
}

public class Bank {
    public static void main(String[] args) {
        Customer_Detail customer = new Customer_Detail();
        customer.information(1023);
    }
}


//Output
//
//        Name of customer is : Usman
//        Account no is : 12463562368
//        Available amount is : 20678.5
//        Address of customer is : Pune