package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    // addBagel() tests
    @Test
    void addBagelShouldSucceed() {
        Basket basket = new Basket();

        Assertions.assertEquals(1, Basket.capacity);

        Assertions.assertTrue(basket.addBagel("A"));

        Assertions.assertNotEquals(-1, basket.bagels.indexOf("A"));
    }
    @Test
    void addBagelShouldFail() {
        Basket basket = new Basket();
        basket.addBagel("A");

        Assertions.assertEquals(1, Basket.capacity);

        Assertions.assertFalse(basket.addBagel("B"));

        Assertions.assertEquals(-1, basket.bagels.indexOf("B"));

        Assertions.assertEquals(BASKETERROR.MAXCAPACITY, basket.lastError);
    }
    // removeBagel() tests
    @Test
    void removeBagelShouldSucceed() {
        Basket basket = new Basket();

        Assertions.assertEquals(-1, basket.bagels.indexOf("A"));

        basket.addBagel("A");

        Assertions.assertNotEquals(-1, basket.bagels.indexOf("A"));

        Assertions.assertTrue(basket.removeBagel("A"));

        Assertions.assertEquals(-1, basket.bagels.indexOf("A"));
    }
    @Test
    void removeBagelShouldFail() {
        Basket basket = new Basket();

        Assertions.assertEquals(-1, basket.bagels.indexOf("A"));

        Assertions.assertFalse(basket.removeBagel("A"));

        Assertions.assertEquals(-1, basket.bagels.indexOf("A"));

        Assertions.assertEquals(BASKETERROR.BAGELNOTFOUND, basket.lastError);
    }
    // setCapacity() tests
    @Test
    void setCapacityShouldBe2() {
        Basket basket = new Basket();

        Assertions.assertEquals(1, Basket.capacity);

        Assertions.assertTrue(Basket.setCapacity(2));

        Assertions.assertEquals(2, Basket.capacity);
    }
    @Test
    void setCapacityShouldNotBeMinus2() {
        Basket basket = new Basket();

        Assertions.assertEquals(1, Basket.capacity);

        Assertions.assertFalse(Basket.setCapacity(-2));

        Assertions.assertEquals(1, Basket.capacity);
    }
}
