package me.welazure.project.modules.ninthmodule;

import me.welazure.project.modules.ninthmodule.secondexercise.Clothing;
import me.welazure.project.modules.ninthmodule.secondexercise.Electronics;
import me.welazure.project.modules.ninthmodule.secondexercise.Product;
import me.welazure.project.modules.ninthmodule.secondexercise.Seasons;
import static me.welazure.project.modules.ninthmodule.secondexercise.Seasons.*;
import static me.welazure.project.modules.Utils.*;

public class SecondExercise {
    public static void main(String[] args) {
        Clothing hoodie = new Clothing("Hoodie", 100000, WINTER);
        Electronics phone = new Electronics("Phone", 712345, 10);

        printInfo(hoodie);
        hoodie.getFinalPrice(SUMMER);
        printInfo(hoodie);

        printInfo(phone);
        phone.setWarrantyInMonths(24);
        phone.applyDiscount(30);
        printInfo(phone);
    }

    private static void printInfo(Product product) {
        print(String.format(
                "Product %s with initial price %s, price after discount: %s",
                product.getProductName(),
                product.getPrice(),
            product.getPriceAfterDiscount()
        ));
        if(product instanceof Electronics) {
            println(String.format(
                    ", Warranty: %s months",
                    ((Electronics) product).getWarrantyInMonths()
            ));
        } else {
            println("");
        }
    }
}
