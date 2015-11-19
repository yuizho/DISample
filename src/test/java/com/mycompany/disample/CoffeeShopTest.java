/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.disample;

import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;
import javax.inject.Inject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 *
 * @author yuizho
 */
public class CoffeeShopTest {
    @Test
    public void testBrewCoffee() {
        BrewingMethod brewingMethod = Mockito.mock(BrewingMethod.class);
        Mockito.when(brewingMethod.brew()).thenReturn("テストコーヒー");

        CoffeeShop coffeeShop = new CoffeeShop();
        ObjectGraph.create(new BrewingMethodMockModule(brewingMethod)).inject(coffeeShop);

        String result = coffeeShop.brewCoffee();

        Mockito.verify(brewingMethod, Mockito.times(1)).brew();
        assertThat(result, is("テストコーヒーが出来上がりました。"));
    }
}
