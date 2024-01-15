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


}
