package me.welazure.project.modules.ninthmodule.secondexercise;

public enum Seasons {
    WINTER(5d),
    SPRING(10d),
    SUMMER(30d),
    AUTUMN(20d);

    private double discount;
    Seasons(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
    public Seasons getSeason(String season) {
        switch (season.toLowerCase()) {
            case "winter":
                return WINTER;
            case "spring":
                return SPRING;
            case "summer":
                return SUMMER;
            case "autumn":
                return AUTUMN;
        }
        return null;
    }
}
