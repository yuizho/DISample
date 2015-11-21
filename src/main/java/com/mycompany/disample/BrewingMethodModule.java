/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.disample;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author yuizho
 */
@Module(injects = CoffeeShopApp.class)
public class BrewingMethodModule {
    @Provides
    public BrewingMethod provideBrewingMethod() {
        return new Siphon();
    }
}
