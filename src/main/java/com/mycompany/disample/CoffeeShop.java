/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.disample;

import javax.inject.Inject;

/**
 *
 * @author yuizho
 */
public class CoffeeShop {
    @Inject BrewingMethod brewingMethod;

    public String brewCoffee() {
        return brewingMethod.brew() + "が出来上がりました [_]P";
    }
}
