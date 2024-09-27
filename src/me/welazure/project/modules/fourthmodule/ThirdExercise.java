package me.welazure.project.modules.fourthmodule;

import java.text.DecimalFormat;
import java.util.Scanner;
import static me.welazure.project.modules.Utils.*;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print("Input exchange rate... ");
        double rate = sc.nextDouble();
        sc.nextLine();

        print("Input amount to be exchanged: ");
        double amount = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("#.00");

        println("You will get: " + df.format(amount * rate));
    }

}
