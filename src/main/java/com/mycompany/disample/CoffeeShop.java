package com.mycompany.disample;

import javax.inject.Inject;

public class CoffeeShop {
    @Inject BrewingMethod brewingMethod;

    public String brewCoffee() {
        return brewingMethod.brew() + "が出来上がりました [_]P";
    }
}
