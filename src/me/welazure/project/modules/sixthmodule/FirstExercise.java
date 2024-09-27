package me.welazure.project.modules.sixthmodule;

import java.util.ArrayList;
import java.util.List;

import static me.welazure.project.modules.Utils.print;

public class FirstExercise {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Informatics");
        list.add("Programming");
        list.add("English");
        list.add("Computer Architecture");

        list.remove("English");
        list.remove("Informatics");

        print(list);
    }
}
