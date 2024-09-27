package me.welazure.project.modules.firstmodule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Insert text... (Input line break to exit!)");
        while(true) {
            String txt = sc.nextLine();
            if(!txt.isEmpty()) {
                list.add(txt);
            } else {
                break;
            }
        }
        System.out.println(list.get(list.size() - 2) + " " + list.get(list.size() - 1));
    }
}
