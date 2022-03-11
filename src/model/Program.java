package model;

import model.entities.Account;
import model.exceptions.AccountException;

public class Program {

    public static void main(String[] args) {
        Account ac = new Account(8021, "Bob Brown", 100.00, 300.00);

        try {
            ac.withdraw(280.00);
            System.out.println(ac);
        }catch (AccountException e){
            System.out.println("Withdraw error: "+e.getMessage());
        }

    }
}
