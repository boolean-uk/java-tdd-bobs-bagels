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
}
