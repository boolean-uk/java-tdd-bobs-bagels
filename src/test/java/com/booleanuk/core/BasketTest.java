package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addBagelToCart(){
        Basket basket = new Basket();
        VeganBagel vegan = new VeganBagel();
        basket.add(vegan);
        Assertions.assertEquals(basket.items.get(vegan).name, "Vegan bagel");
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
