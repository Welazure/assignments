package me.welazure.project.modules.seventhmodule;

import java.util.Scanner;
import static me.welazure.project.modules.Utils.*;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Input size of triangle...");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < n-i; j++) {
                builder.append(" ");
            }
            for(int j = 0; j < 2*i-1; j++) {
                builder.append("*");
            }
            builder.append("\n");
            print(builder.toString());
        }
    }
}
