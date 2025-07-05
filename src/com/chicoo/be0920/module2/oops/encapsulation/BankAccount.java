package com.chicoo.be0920.module2.oops.encapsulation;

//Encapsulation Example
public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        balance = 100.00;
        return balance + amount;
    }

    public double withdraw(double amount) {
        balance = 100.00;
        return balance - amount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.withdraw(50));
    }
}
