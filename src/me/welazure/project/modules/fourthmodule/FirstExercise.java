package me.welazure.project.modules.fourthmodule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static me.welazure.project.modules.Utils.print;
import static me.welazure.project.modules.Utils.println;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>();

        print("Input number of items sold: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
        print(String.format("Input price of item #%s: ", i));
        list.add(sc.nextDouble());
        }

        double grossIncome = list.stream().reduce(0.0, Double::sum);
        println("Total gross income: " + grossIncome);
        println("Average price of items: " + grossIncome / n);

    }
}
