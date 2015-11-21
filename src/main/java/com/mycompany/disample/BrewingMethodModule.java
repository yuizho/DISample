package com.mycompany.disample;

import dagger.Module;
import dagger.Provides;

@Module(injects = CoffeeShopApp.class)
public class BrewingMethodModule {
    @Provides
    public BrewingMethod provideBrewingMethod() {
        return new Siphon();
    }
}
