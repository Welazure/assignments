package me.welazure.project.modules.fifthmodule;

import java.util.Scanner;
import static me.welazure.project.modules.Utils.*;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Please enter a number... ");
        double number = sc.nextDouble();
        if(number == 0) {
            println("Number is zero");
        } else if(number > 0) {
            println("Number is positive");
        } else if(number < 0) {
            println("Number is negative");
        }
    }
}
