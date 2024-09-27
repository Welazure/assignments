package me.welazure.project.modules.secondmodule;

import me.welazure.project.modules.secondmodule.utils.Rectangle;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input width: ");
        int width = sc.nextInt();
        System.out.print("Input height: ");
        int height = sc.nextInt();
        Rectangle rect = new Rectangle(width, height);
        System.out.println("The area of the rectangle is: " + rect.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + rect.calculatePerimeter());
    }
}
