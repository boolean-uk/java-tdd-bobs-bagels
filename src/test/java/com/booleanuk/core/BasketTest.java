package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BasketTest {

    @Test
    public void addSpecificBagelReturnTrue() {
        Basket basket = new Basket();

        boolean result = basket.addBagel("bagel1");
        Assertions.assertTrue(result);
    }

    @Test
    public void addSpecificBagelReturnFalse(){
        Basket basket = new Basket();
        boolean result = basket.addBagel("bagel2");
        Assertions.assertFalse(result);
    }

    @Test
    public void removeSpecificBagelReturnTrue(){
        Basket basket = new Basket();
        boolean result = basket.removeBagel("bagel2");
        Assertions.assertTrue(result);
    }

    @Test
    public void checkCapacityListReturnTrue(){
        Basket basket = new Basket();
        basket.addBagel("bagel3");
        basket.addBagel("bagel4");
        basket.addBagel("bagel5");
        basket.addBagel("bagel6");
        boolean result = basket.checkCapacity();
        Assertions.assertTrue(result);
    }




}
