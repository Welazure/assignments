package me.welazure.project.modules.fourthmodule;

import java.util.Scanner;

import static me.welazure.project.modules.Utils.*;

public class FifthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Input weight (kg)... ");
        double weight = sc.nextDouble();
        print("Input height (cm)... ");
        double height = sc.nextDouble() / 100;

        double bmi = weight / (height * height);
        String category = bmi < 18.5 ? "Underweight"
                : bmi > 25.0 ? "Overweight" : "Normal weight";
        print(String.format("BMI: %s, you are in the category: %s", bmi, category));
    }
}
