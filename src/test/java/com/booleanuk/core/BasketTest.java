package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {
    private ArrayList<String> setupTestArray() {
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Plain");
        // testArray.add("Pumpernickel");
        // testArray.add("Chocolate chip");
        // testArray.add("Asiago");
        // testArray.add("Blueberry");
        return testArray;
    }

    @Test
    public void canAddBagelToBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("Plain"));
        Assertions.assertEquals(setupTestArray(), basket.getBasket());
    }

    @Test
    public void cantAddBagelToBasketWhenBasketIsFull() {
        Basket basket = new Basket();
        basket.add("Plain");
        basket.add("Pumpernickel");
        basket.add("Chocolate chip");
        basket.add("Asiago");
        basket.add("Blueberry");

        Assertions.assertEquals(5, basket.getBasket().size());
        Assertions.assertFalse(basket.add("Sourdough"));
    }

    @Test
    public void canRemoveBagelFromBasket() {
        Basket basket = new Basket();
        basket.add("Plain");

        Assertions.assertTrue(basket.remove("Plain"));
        Assertions.assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void cantRemoveBagelFromBasket() {
        Basket basket = new Basket();
        basket.add("Pumpernickel");

        Assertions.assertFalse(basket.remove("Plain"));
        Assertions.assertEquals(1, basket.getBasket().size());
    }

    @Test
    public void isFullReturnsTrueWhenBasketIsFull() {
        Basket basket = new Basket();
        basket.add("Plain");
        basket.add("Pumpernickel");
        basket.add("Chocolate chip");
        basket.add("Asiago");
        basket.add("Blueberry");

        Assertions.assertEquals(5, basket.getBasket().size());
        Assertions.assertTrue(basket.isFull());
    }

    @Test
    public void isFullReturnsFalseWhileBasketIsNotFull() {
        Basket basket = new Basket();
        basket.add("Pumpernickel");

        Assertions.assertEquals(1, basket.getBasket().size());
        Assertions.assertFalse(basket.isFull());
    }

    @Test
    public void canChangeBasketCapacity() {
        Basket basket = new Basket(1);
        basket.add("Plain");

        Assertions.assertTrue(basket.isFull());
        Assertions.assertFalse(basket.add("Pumpernickel"));

        basket.setCapacity(2);
        Assertions.assertFalse(basket.isFull());
        Assertions.assertTrue(basket.add("Pumpernickel"));
    }
}
