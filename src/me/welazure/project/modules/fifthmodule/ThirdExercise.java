package me.welazure.project.modules.fifthmodule;

import java.util.Scanner;
import static me.welazure.project.modules.Utils.*;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Input first number: ");
        double first = sc.nextDouble();
        print("Input second number: ");
        double second = sc.nextDouble();
        if(first % second == 0) {
            println(String.format("%s is a multiple of %s", first, second));
        } else {
            println(String.format("%s is not a multiple of %s", first, second));
        }
    }
}
