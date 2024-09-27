package me.welazure.project.modules.fourthmodule;

import java.util.Scanner;
import static me.welazure.project.modules.Utils.*;

public class FourthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Input time to be converted from (24H Time Format: HH:MM)... ");
        String time = sc.nextLine();

        String modifier = "AM";



        if (!time.matches("\\d{2}:\\d{2}")) { // Check if input follows HH:MM format
            println("Invalid input format. Please use HH:MM.");
            return;
        }

        String[] input = time.split(":");

        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);

        if(hour > 12) {
            hour -= 12;
            modifier = "PM";
        }
        if(hour == 12)
            modifier = "PM";
        if(hour == 0)
            hour = 12;

        println(String.format("Time in 12H Time Format: %02d:%02d %s", hour, minute, modifier));
    }
}
