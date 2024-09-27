package me.welazure.project.modules.ninthmodule.secondexercise;

public abstract class Product implements Discountable {
    private String productName;
    private double price;
    private double priceAfterDiscount;

    public Product(String productName, double price) {
        this.productName = productName;
        this.priceAfterDiscount = price;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPriceAfterDiscount() {
        return priceAfterDiscount;
    }
    public void setPriceAfterDiscount(double priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }
    @Override
    public void applyDiscount(double discount) {
        setPriceAfterDiscount(getPrice() - (getPrice()*discount/100));
    }
}