package me.welazure.project.modules.firstmodule;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert text... ");
        String input = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.println(input);
        }
    }
}
