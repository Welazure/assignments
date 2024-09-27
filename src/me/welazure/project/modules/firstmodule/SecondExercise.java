package me.welazure.project.modules.firstmodule;

import java.util.Scanner;

public class SecondExercise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        while(true) {
            System.out.print("Insert text... ");
            builder.append(" ");
            builder.append(sc.nextLine());
            System.out.println(builder);
        }
    }
}
