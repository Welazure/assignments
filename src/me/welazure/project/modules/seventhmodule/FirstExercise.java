package me.welazure.project.modules.seventhmodule;

import java.util.Random;
import java.util.Scanner;

import static me.welazure.project.modules.Utils.*;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            print("Input size of identity matrix... ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        print("1, ");
                    } else {
                        print("0, ");
                    }
                }
                print("\n");
            }
        }
    }
}
