package me.welazure.project.modules.fourthmodule;

import java.util.Scanner;
import static me.welazure.project.modules.Utils.*;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Insert amount to pay... ");
        double amount = sc.nextDouble();
        sc.nextLine();
        print("Insert payment option (Available: Cash, Credit, Debit, QR)... ");
        String option = sc.nextLine();


        double tax = 3;
        double creditService = 2;
        double debitService = 1;
        double QRService = 1;

        switch (option.toLowerCase()) {
            case "cash":
                amount += amount * tax / 100;
                break;
            case "credit":
                amount += amount * tax / 100;
                amount += amount * creditService / 100;
                break;
            case "debit":
                amount *= tax / 100;
                amount *= debitService / 100;
                break;
            case "qr":
                amount *= tax / 100;
                amount *= QRService / 100;
                break;
        }
        println("Total bill being processed: " + amount);
    }
}
