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
        Basket basket = new Basket();
        SpicyBagel spicy = new SpicyBagel();
        basket.add(spicy);
        basket.remove(spicy);

        Assertions.assertTrue(basket.itemList.isEmpty());

        VeganBagel vegan1 = new VeganBagel();
        VeganBagel vegan2 = new VeganBagel();
        VeganBagel vegan3 = new VeganBagel();
        basket.add(vegan1);
        basket.add(vegan2);
        basket.add(vegan3);
        basket.remove(vegan2);

        Assertions.assertFalse(basket.itemList.containsKey(vegan2));
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
