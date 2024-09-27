package me.welazure.project.modules.secondmodule.utils;

public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int calculateArea() {
        return width * height;
    }
    public int calculatePerimeter() {
        return 2*(width+height);
    }
}
