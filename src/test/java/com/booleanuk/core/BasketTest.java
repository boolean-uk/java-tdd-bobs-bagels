package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addTypeBagel(){
        Basket basket = new Basket();
        String type = "Sesame";
        double price = 6;
        Assertions.assertTrue(basket.add(type, price));
        Assertions.assertTrue(basket.bagels.containsKey(type));
        Assertions.assertEquals(price, basket.bagels.get(type));

        double price2 = 8;
        Assertions.assertFalse(basket.add(type, price2));
        Assertions.assertEquals(price2, basket.bagels.get(type));
    }

}
