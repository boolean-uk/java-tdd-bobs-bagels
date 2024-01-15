package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addingBagelToNotFullBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("vanilla"));
    }


    @Test
    public void addingBagelToFullBasket() {
        Basket basket = new Basket();
        basket.add("vanilla");
        basket.add("apple");
        basket.add("chocolate");
        Assertions.assertFalse(basket.add("raspberry"));
    }
    @Test
    public void addingBagelThatAlreadyExistsInBasket() {
        Basket basket = new Basket();
        basket.add("vanilla");
        basket.add("vanilla");
        Assertions.assertEquals(2, basket.items.get("vanilla"));
    }

    @Test
    public void removingBagelThatDoesntExistInBasket() {
        Basket basket = new Basket();
        basket.add("vanilla");
        Assertions.assertFalse(basket.remove("blueberry"));
    }

    @Test
    public void removingBagelThatExistsInBasket() {
        Basket basket = new Basket();
        basket.add("vanilla");
        Assertions.assertTrue(basket.remove("vanilla"));
    }

    @Test
    public void removingBagelThatThereIsMoreThanOneOf() {
        Basket basket = new Basket();
        basket.add("vanilla");
        basket.add("vanilla");
        basket.remove("vanilla");
        Assertions.assertEquals(1, basket.items.get("vanilla"));
    }

    @Test
    public void testLoweringCapacity() {
        Basket basket = new Basket();
        basket.add("vanilla");
        basket.add("vanilla");
        basket.updateCapacity(2);
        Assertions.assertFalse(basket.add("vanilla"));
    }

    @Test
    public void testIncreasingCapacity() {
        Basket basket = new Basket();
        basket.add("vanilla");
        basket.add("vanilla");
        basket.add("vanilla");
        basket.updateCapacity(4);
        Assertions.assertTrue(basket.add("vanilla"));
    }

    @Test
    public void updateCapacityToValidAmount() {
        Basket basket = new Basket();
        basket.add("vanilla");
        basket.add("vanilla");
        basket.add("vanilla");
        Assertions.assertTrue(basket.updateCapacity(4));
    }

    @Test
    public void updateCapacityToInvalidAmount() {
        Basket basket = new Basket();
        basket.add("vanilla");
        basket.add("vanilla");
        basket.add("vanilla");
        Assertions.assertFalse(basket.updateCapacity(2));
    }
}
