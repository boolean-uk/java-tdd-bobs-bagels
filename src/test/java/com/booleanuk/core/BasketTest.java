package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketTest {
    private Basket basket;
    @BeforeEach
    void setup() {
        basket = new Basket(3);
    }
    @Test
    public void shouldAddBagelToBasket() {
        //Setup
        String bagel = "Plain bagel";

        //Execute
        basket.addBagel(bagel);

        //Verify
        Assertions.assertTrue(basket.getBagels().contains(bagel));
    }

    @Test
    public void shouldNotAddBagelToBasketWhenBasketIsFull() {
        //Setup
        String bagel1 = "Plain bagel";
        String bagel2 = "Plain bagel";
        String bagel3 = "Plain bagel";
        basket.addBagel(bagel1);
        basket.addBagel(bagel2);
        basket.addBagel(bagel3);
        String bagel4 = "Egg bagel";

        //Execute
        basket.addBagel(bagel4);

        //Verify
        Assertions.assertFalse(basket.getBagels().contains(bagel4));
    }
}
