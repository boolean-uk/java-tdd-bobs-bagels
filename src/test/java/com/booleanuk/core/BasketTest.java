package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addBagelToCart(){
        Basket basket = new Basket();
        VeganBagel vegan = new VeganBagel();
        basket.add(vegan);
        Assertions.assertTrue(basket.itemList.containsKey(vegan));
    }

    @Test
    public void removeBagelFromCart(){

    }

    @Test
    public void removingFromEmptyCart(){

    }

    @Test
    public void testingCapacity(){

    }

    @Test
    public void changingCapacity(){

    }
}
