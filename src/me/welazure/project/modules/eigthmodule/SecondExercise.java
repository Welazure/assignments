package me.welazure.project.modules.eigthmodule;

import me.welazure.project.modules.eigthmodule.secondexercise.InventoryItem;
import me.welazure.project.modules.eigthmodule.secondexercise.NonPerishableItem;
import me.welazure.project.modules.eigthmodule.secondexercise.PerishableItem;

import static me.welazure.project.modules.Utils.*;

public class SecondExercise {
    public static void main(String[] args) {
        InventoryItem apples = new PerishableItem("Apples", 100, 5);
        InventoryItem bananas = new PerishableItem("Bananas", 180, 7);
        InventoryItem shirts = new NonPerishableItem("Shirt", 150);
        InventoryItem doors = new NonPerishableItem("Doors", 1000);


        println(String.format("Product: %s, Stock Value: %s", apples.getItemName(), apples.calculateStockValue()));
        println(String.format("Product: %s, Stock Value: %s", bananas.getItemName(), bananas.calculateStockValue()));
        println(String.format("Product: %s, Stock Value: %s", shirts.getItemName(), shirts.calculateStockValue()));
        println(String.format("Product: %s, Stock Value: %s", doors.getItemName(), doors.calculateStockValue()));
    }
}
