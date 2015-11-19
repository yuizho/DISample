/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.disample;

import dagger.ObjectGraph;

/**
 *
 * @author yuizho
 */
public class CoffeeShopApp {
    public static void main(String... args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        // CoffeeShopクラスにSiphonオブジェクトをインジェクト
        ObjectGraph.create(new BrewingMethodModule()).inject(coffeeShop);
        System.out.println(coffeeShop.brewCoffee());
    }
}
