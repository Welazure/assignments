package me.welazure.project.modules.seventhmodule;

import java.util.Scanner;
import static me.welazure.project.modules.Utils.*;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Input max number...");
        int max = sc.nextInt();
        int m = 0;
        while(m < max) {
            println(m);
            m+=2;
        }
    }
}
