package me.welazure.project.modules.secondmodule.utils;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolder;
    public BankAccount(int accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void printInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Holder: " + accountHolder);
    }
    public boolean withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient Funds");
            return true;
        }

        setBalance(balance - amount);
        System.out.println("Successfully withdrew " + amount + " From: " + accountHolder);

        return false;
    }
    public boolean deposit(double amount) {
        if((balance + amount) < balance) {
            System.out.println("Amount exceeds limit!");
            return true;
        }

        setBalance(balance + amount);
        System.out.println("Successfully deposited " + amount + " From: " + accountHolder);
        return false;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
