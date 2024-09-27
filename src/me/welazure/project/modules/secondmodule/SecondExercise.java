package me.welazure.project.modules.secondmodule;

import me.welazure.project.modules.secondmodule.utils.BankAccount;

import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100, 10000.0, "Ekahadi L.T.");
        account.withdraw(1000);
        account.deposit(2000);
        account.printInfo();
    }
}
