/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.disample;

import dagger.ObjectGraph;
import javax.inject.Inject;

/**
 *
 * @author yuizho
 */
public class CoffeeShopApp {
    @Inject CoffeeShop coffeeShop;

    public void run() {
        System.out.println(coffeeShop.brewCoffee());
    }

    public static void main(String... args) {
        CoffeeShopApp coffeeShopApp =
                ObjectGraph.create(new BrewingMethodModule())
                        .get(CoffeeShopApp.class);
        coffeeShopApp.run();
    }
}
