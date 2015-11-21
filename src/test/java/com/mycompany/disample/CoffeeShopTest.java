package com.mycompany.disample;

import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;
import javax.inject.Inject;
import javax.inject.Singleton;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CoffeeShopTest {
    @Inject CoffeeShop coffeeShop;
    @Inject BrewingMethod brewingMethod;

    @Before
    public void setUp() {
        ObjectGraph.create(new TestModule()).inject(this);
    }

    @Module(includes = BrewingMethodModule.class,
            injects = CoffeeShopTest.class,
            overrides = true)
    static class TestModule {
        @Provides
        @Singleton
        public BrewingMethod provideBrewingMethod() {
            return Mockito.mock(BrewingMethod.class);
        }
    }

    @Test
    public void testBrewCoffee() {
        Mockito.when(brewingMethod.brew()).thenReturn("テストコーヒー");
        String result = coffeeShop.brewCoffee();
        Mockito.verify(brewingMethod, Mockito.times(1)).brew();
        assertThat(result, is("テストコーヒーが出来上がりました [_]P"));
    }
}
