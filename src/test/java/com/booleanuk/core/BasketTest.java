package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void orderBagelInEmptyBasketTest() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.order("Vanilla"));
    }

    @Test
    public void orderBagelInBasketWithElementsTest() {
        Basket basket = new Basket(5);
        basket.bagels.add("Vanilla");
        Assertions.assertTrue(basket.order("Chocolate"));
    }

    @Test
    public void orderBagelInFullBasketTest() {
        Basket basket = new Basket(1);
        basket.bagels.add("Vanilla");
        Assertions.assertFalse(basket.order("Chocolate"));
    }

    @Test
    public void orderBagelInBasketWithSameBagelTest() {
        Basket basket = new Basket(3);
        basket.bagels.add("Vanilla");
        basket.bagels.add("Chocolate");
        Assertions.assertTrue(basket.order("Vanilla"));
    }

    @Test
    public void deleteBagelInBasketTest() {
        Basket basket = new Basket(1);
        basket.bagels.add("Vanilla");
        Assertions.assertEquals("Vanilla has been deleted", basket.delete("Vanilla"));
    }

    @Test
    public void deleteMissingBagelInBasketTest() {
        Basket basket = new Basket(1);
        basket.bagels.add("Vanilla");
        Assertions.assertEquals("Chocolate was not found", basket.delete("Chocolate"));
    }

    @Test
    public void deleteOneBagelWhenDuplicateBagelsInBasketTest() {
        Basket basket = new Basket(3);
        basket.bagels.add("Vanilla");
        basket.bagels.add("Chocolate");
        basket.bagels.add("Vanilla");
        Assertions.assertEquals("Vanilla has been deleted", basket.delete("Vanilla"));
        Assertions.assertEquals("Vanilla", basket.bagels.get(basket.bagels.size()-1));
        System.out.println(basket.bagels);
    }

    @Test
    public void ChangeCapacityTest() {
        Basket basket = new Basket(1);
        Assertions.assertEquals(1, basket.capacity);
        basket.expand(3);
        Assertions.assertEquals(3, basket.capacity);
    }

    @Test
    public void addBagelAfterChangeCapacityFromFullCapacityTest() {
        Basket basket = new Basket(1);
        basket.bagels.add("Vanilla");
        basket.expand(2);
        Assertions.assertTrue(basket.order("Chocolate"));
    }

    @Test
    public void ReduceCapacityForFullBasketTest() {
        Basket basket = new Basket(2);
        basket.bagels.add("Vanilla");
        basket.bagels.add("Chocolate");
        basket.expand(1);
        Assertions.assertEquals(1, basket.bagels.size());
    }
}
