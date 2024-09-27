package me.welazure.project.modules.eigthmodule.secondexercise;

public class PerishableItem extends InventoryItem{

    private int shelfLife;
    public PerishableItem(String itemName, int quantity, int shelfLife){
        super(itemName, quantity);
        this.shelfLife = shelfLife;
    }
    @Override
    public int calculateStockValue() {
        return shelfLife < 7 ? (int) (getQuantity() * 0.5): getQuantity();
    }
}
