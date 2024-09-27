package me.welazure.project.modules.ninthmodule.secondexercise;

public class Clothing extends Product implements Discountable {


    public Clothing(String name, double price) {
        super(name, price);
    }
    public Clothing(String name, double price, Seasons season) {
        super(name, price);
        applyDiscount(season.getDiscount());
    }

    public double getFinalPrice(Seasons season) {
        applyDiscount(season.getDiscount());
        return getPriceAfterDiscount();
    }


}
