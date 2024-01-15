package com.booleanuk.core;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddBagelToBasket() {
        Basket basket = new Basket();
        String bagel = "Plain";

        basket.addBagel(bagel);

        assertEquals(1, basket.getBasket().size()); // Expecting exactly one bagel in the basket
        assertTrue(basket.getBasket().contains(bagel));
    }

    @Test
    public void testRemoveBagelFromBasket() {
        Basket basket = new Basket();
        String bagel = "Everything";

        basket.addBagel(bagel);
        basket.removeBagel(bagel);

        assertEquals(0, basket.getBasket().size());
        assertFalse(basket.getBasket().contains(bagel));
    }
}

