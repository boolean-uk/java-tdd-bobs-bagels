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
        String bagel = "Everything!";

        basket.addBagel(bagel);
        basket.removeBagel(bagel);

        assertEquals(0, basket.getBasket().size());
        assertFalse(basket.getBasket().contains(bagel));
    }
    @Test
    public void testRemoveNonexistentBagelFromBasket() {
        Basket basket = new Basket();
        String bagelInBasket = "Sesame";
        String bagelNotInBasket = "Blueberry";

        basket.addBagel(bagelInBasket);
        basket.removeBagel(bagelNotInBasket);

        assertEquals(1, basket.getBasket().size());
        assertTrue(basket.getBasket().contains(bagelInBasket));
        assertFalse(basket.getBasket().contains(bagelNotInBasket));
    }
    @Test
    public void testChangeBasketCapacity() {
        Basket basket = new Basket();
        String bagel1 = "Cinnamon Raisin";
        String bagel2 = "Poppy Seed";

        basket.addBagel(bagel1);

        assertEquals(5, basket.getCapacity());

        basket.setCapacity(10);

        assertEquals(10, basket.getCapacity());

        basket.addBagel(bagel2);
        assertEquals(2, basket.getBasket().size());
    }
}

