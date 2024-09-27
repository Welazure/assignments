package me.welazure.project.modules.eigthmodule;

import me.welazure.project.modules.eigthmodule.firstexercise.Mathematics;
import me.welazure.project.modules.eigthmodule.firstexercise.Science;
import me.welazure.project.modules.eigthmodule.firstexercise.Subject;
import static me.welazure.project.modules.Utils.*;

public class FirstExercise {
    public static void main(String[] args) {
        Subject math = new Mathematics("AP Calculus I", 79, 99, 89);
        Subject science = new Science("Chemistry", 99, 95, 100);

        println(String.format("Your score for %s is: %s", math.getName(), math.calculateGrade()));
        println(String.format("Your score for %s is: %s", science.getName(), science.calculateGrade()));
    }
}
