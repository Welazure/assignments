package me.welazure.project.modules.eigthmodule.secondexercise;

public abstract class InventoryItem {
    private String itemName;
    private int quantity;
    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public int getQuantity() {
        return quantity;
    }
    public abstract int calculateStockValue();
}
