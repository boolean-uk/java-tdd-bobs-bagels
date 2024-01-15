package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BasketTest {

    @Test
    public void addSpecificBagel() {
        Basket basket = new Basket();

        boolean result = basket.add("bagel1");
        Assertions.assertTrue(result);
    }

    @Test
    public void addSpecificBagel(){
        Basket basket = new Basket();
        basket.add("bagel1");
        boolean result = basket.add("bagel1");
        Assertions.assertFalse(result);
    }


}
