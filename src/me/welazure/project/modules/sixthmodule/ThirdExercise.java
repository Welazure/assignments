package me.welazure.project.modules.sixthmodule;

import java.util.ArrayList;
import java.util.List;
import static me.welazure.project.modules.Utils.*;

public class ThirdExercise {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        scores.add(70d);
        scores.add(90d);
        scores.add(80d);
        scores.add(85d);

        double average =  scores.stream().reduce(0.0, Double::sum) / scores.size();
        scores.forEach(x -> {
            if(x > average)
                println(String.format("found score %s, higher than the average of %s", x, average));
        });
    }
}
