package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddingBagels() {
        Basket basket = new Basket();
        basket.addToBasket("everything", 1);
        Assertions.assertEquals(1, basket.getBasket().size());
    }

    @Test
    public void testAddingUnavailableType() {
        Basket basket = new Basket();
        basket.addToBasket("plain", 1);
        Assertions.assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void testAdding0Bagels() {
        Basket basket = new Basket();
        basket.addToBasket("everything", 0);
        Assertions.assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void testAddingTooManyBagels() {
        Basket basket = new Basket(20);
        basket.addToBasket("everything", 20);
        Assertions.assertEquals(20, basket.getBasket().size());
        basket.addToBasket("everything", 1);
        Assertions.assertEquals(20, basket.getBasket().size());
    }

    @Test
    public void testOrder() {
        Basket basket = new Basket();
        basket.addToBasket("everything", 1);
        Assertions.assertTrue(basket.order());
        Assertions.assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void testRemoveBagel() {
        Basket basket = new Basket();
        basket.addToBasket("everything", 1);
        basket.addToBasket("sesame", 2);
        Assertions.assertEquals(3, basket.getBasket().size());
        basket.remove("sesame");
        Assertions.assertEquals(2, basket.getBasket().size());
        Assertions.assertTrue(basket.contains("everything"));
        Assertions.assertTrue(basket.contains("sesame"));
    }

    @Test
    public void changeBasketSize() {
        Basket basket = new Basket(10, true);
        basket.addToBasket("everything", 3);
        Assertions.assertEquals(3, basket.getBasket().size());
        basket.addToBasket("everything", 10);
        Assertions.assertEquals(3, basket.getBasket().size());
        basket.setBasketSize(20);
        basket.addToBasket("everything", 10);
        Assertions.assertEquals(13, basket.getBasket().size());
    }


}
