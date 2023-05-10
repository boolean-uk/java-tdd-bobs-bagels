package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagel() {
        // Test for successfully added Bagel
        Basket basket = new Basket();
        Assertions.assertTrue(basket.addBagel("Avocado"));
        Assertions.assertTrue(basket.bagels.contains("Avocado"));

        // Test for failure
        basket.addBagel("Smoked Salmon");
        basket.addBagel("Hummus");
        Assertions.assertFalse(basket.addBagel("Grondboontjeboter"));
        Assertions.assertFalse(basket.bagels.contains("Grondboontjeboter"));
    }

    @Test
    public void testRemoveBagel() {
        // Test for successfully removed Bagel
        Basket basket = new Basket();
        basket.addBagel("Avocado");
        basket.addBagel("Hummus");
        Assertions.assertTrue(basket.removeBagel("Avocado"));
        Assertions.assertFalse(basket.bagels.contains("Avocado"));

        // Test for failure
        Assertions.assertFalse(basket.removeBagel("Grondboontjeboter"));
    }

    @Test
    public void testUpdateBasketCapacity() {
        //Test for successfully updated capacity
        Basket basket = new Basket();
        Assertions.assertTrue(basket.updateBasketCapacity(5));
        Assertions.assertEquals(5, basket.basketCapacity);

        //Test for failed updated capacity (0 or negative number)
        Assertions.assertFalse(basket.updateBasketCapacity(0));
        Assertions.assertFalse(basket.updateBasketCapacity(-1));

        //Test for failed updated capacity (capacity made smaller than basket size)
        basket.addBagel("Avocado");
        basket.addBagel("Smoked Salmon");
        basket.addBagel("Hummus");

        Assertions.assertFalse(basket.updateBasketCapacity(2));

    }

}
