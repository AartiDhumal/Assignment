package Examples;

import java.util.ArrayList;
import java.util.List;

//Component
interface Account {

     float getbalance();
}

//Account Leaf 1
class Current_Account implements Account {

    private String account_no;

    private float account_balance;

    public Current_Account(String account_no, float account_balance) {
        this.account_no = account_no;
        this.account_balance = account_balance;
    }

    @java.lang.Override
    public float getbalance() {
        return account_balance;
    }
}

//Account Leaf 2
class Saving_Account implements Account {

    private String account_no;

    private float account_balance;

    public Saving_Account(String account_no, float account_balance) {
        this.account_no = account_no;
        this.account_balance = account_balance;
    }

    @java.lang.Override
    public float getbalance() {
        return account_balance;
    }
}

//Composite
class CompositeAccount implements Account {

    private float total_balance;

    private List<Account> accountList = new ArrayList<Account>();

    @java.lang.Override
    public float getbalance() {
        total_balance = 0;
        for (Account a: accountList){
            total_balance = total_balance + a.getbalance();
        }
        return total_balance;
    }

    public void add_account(Account acc) {
        accountList.add(acc);
    }

    public void remove_account(Account acc) {
        accountList.remove(acc);
    }
    public float getSpecific(Account account)
    {
        int index = this.accountList.indexOf(account);
        return this.accountList.get(index).getbalance();
    }
}

//Driver or Client
public class Client {
    public static void main(String[] args) {
        Account account = null;
        CompositeAccount compositeAccount = new CompositeAccount();
        account = new Current_Account("DA001",100);
        compositeAccount.add_account(account);
        account = new Current_Account("DA002",150);
        compositeAccount.add_account(account);
        account = new Saving_Account("SA001",200);
        compositeAccount.add_account(account);
        float total_balance = compositeAccount.getbalance();
        System.out.println("Total Balance : "+total_balance);
    }
}













//System.out.println(compositeAccount.getSpecific(account));