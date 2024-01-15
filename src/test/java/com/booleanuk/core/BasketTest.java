package com.booleanuk.core;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddBagelToBasket() {
        Basket basket = new Basket();
        String bagel = "Plain";

        basket.addBagel(bagel);

        assertTrue(basket.isBasketFull());
        assertTrue(basket.getBasket().contains(bagel));
    }
}

