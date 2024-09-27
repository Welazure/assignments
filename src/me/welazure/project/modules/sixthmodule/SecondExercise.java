package me.welazure.project.modules.sixthmodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static me.welazure.project.modules.Utils.print;

public class SecondExercise {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        Arrays.stream(array).forEach(x -> {
            list.add(Arrays.stream(x).boxed().collect(Collectors.toList()));
        });

        list.forEach(System.out::println);
    }
}
