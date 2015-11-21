package com.mycompany.disample;

import dagger.ObjectGraph;
import javax.inject.Inject;

public class CoffeeShopApp {
    @Inject CoffeeShop coffeeShop;

    public void run() {
        System.out.println(coffeeShop.brewCoffee());
    }

    public static void main(String... args) {
        ObjectGraph objectGraph = ObjectGraph.create(new BrewingMethodModule());
        CoffeeShopApp coffeeShopApp = objectGraph.get(CoffeeShopApp.class);
        coffeeShopApp.run();
    }
}
