package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addingAnItemToBasketToReturnTrue(){
        Basket basket = new Basket();
        boolean result = basket.add("Cinnamon bagels");
        Assertions.assertTrue(result);
    }
    @Test
    public void addingAnItemToBasketToReturnFalse(){
        Basket basket = new Basket();
        basket.add("Cinnamon bagels");
        boolean result = basket.add("Cinnamon bagels");
        Assertions.assertFalse(result);
    }


}
