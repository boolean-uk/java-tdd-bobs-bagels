package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testBasketConstructor(){
        Basket basket = new Basket(5);
        Assertions.assertEquals(0, basket.bagels.size());
    }

    @Test
    public void testAddBagel(){
        Basket basket = new Basket(5);
        basket.add("Chocolate");
        Assertions.assertEquals("Chocolate", basket.bagels.get(0));
    }

    @Test
    public void testRemoveFromBasket(){
        Basket basket = new Basket(5);
        basket.add("Chocolate");
        basket.add("Vanilla");
        Assertions.assertEquals(2, basket.bagels.size());
        Assertions.assertTrue(basket.remove("Chocolate"));
        Assertions.assertEquals(1, basket.bagels.size());
        Assertions.assertFalse(basket.remove("Chocolate"));

    }

    @Test
    public void testBasketCapacity() {
        Basket basket = new Basket(2);

        Assertions.assertTrue(basket.add("Chocolate"));
        Assertions.assertTrue(basket.add("Vanilla"));
        Assertions.assertFalse(basket.add("Sugar"));
        Assertions.assertEquals(2, basket.bagels.size());
    }

    @Test
    public void testExpandBasketCapacity() {
        Basket basket = new Basket(2);
        Assertions.assertEquals(2, basket.capacity);
        basket.setCapacity(3);
        Assertions.assertEquals(3, basket.capacity);
    }

    @Test
    public void testRemoveFromEmptyBasket() {
        Basket basket = new Basket(2);
        Assertions.assertFalse(basket.remove("Chocolate"));
    }
}
