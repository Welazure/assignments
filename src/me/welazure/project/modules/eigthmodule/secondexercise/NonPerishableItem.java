package me.welazure.project.modules.eigthmodule.secondexercise;

public class NonPerishableItem extends InventoryItem{
    public NonPerishableItem(String itemName, int quantity){
        super(itemName, quantity);
    }
    @Override
    public int calculateStockValue() {
        return getQuantity();
    }
}
