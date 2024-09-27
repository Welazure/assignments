package me.welazure.project.modules.ninthmodule.secondexercise;

public class Electronics extends Product implements Discountable
{
    private int warrantyInMonths;
    public Electronics(String productName, double price) {
        super(productName, price);
    }
    public Electronics(String productName, double price, int warrantyInMonths) {
        super(productName, price);
        this.warrantyInMonths = warrantyInMonths;
    }

    public int getWarrantyInMonths() {
        return warrantyInMonths;
    }
    public void setWarrantyInMonths(int warrantyInMonths) {
        this.warrantyInMonths = warrantyInMonths;
    }
}
