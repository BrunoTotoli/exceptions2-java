package model.entities;

import model.exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Account() {
    }


    public void deposit(Double amount){
        balance+= amount;
    }

    public void withdraw(Double amount){
        if (amount > withdrawLimit){
                throw new AccountException("The amount exceeds withdraw limit");
            }
        if(balance<= amount){
            throw new AccountException("Not enough balance");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return " Account data: "+"\n Number: "+this.number+"\n Holder: "+this.holder+
                "\n Balance: "+this.balance+"\n Withdraw Limit: "+this.withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }


}
