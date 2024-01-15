package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelToEmptyBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Brown", 1));
    }

    @Test
    public void testAddBagelToEmptyBasketAndCheckIfAdded() {
        Basket basket = new Basket();
        basket.add("Brown", 1);
        Assertions.assertTrue(basket.basketContents.containsKey("Brown"));
    }

    @Test
    public void testAddBagelWithoutNameBasket() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.add("", 1));
    }

    @Test
    public void testRemoveBagelFromBasket() {
        Basket basket = new Basket();
        basket.add("Brown", 1);
        Assertions.assertTrue(basket.remove("Brown", 1));
    }

    @Test
    public void testRemoveBagelFromBasketAndCheckIfGone() {
        Basket basket = new Basket();
        basket.basketContents.put("Brown", 1);
        basket.remove("Brown", 1);
        Assertions.assertTrue(basket.basketContents.isEmpty());
    }

    @Test
    public void testAddBagelToFullBasket() {
        Basket basket = new Basket();
        basket.basketContents.put("Brown", 1);
        basket.basketContents.put("Sourdough", 1);
        basket.basketContents.put("Plain", 1);
        Assertions.assertFalse(basket.add("Seeds", 1));
    }

    @Test
    public void testSetBagelLimitAndCheckIfUpdated() {
        Basket basket = new Basket();
        basket.setBasketLimit(20);
        Assertions.assertEquals(20, basket.basketLimit);
    }

    @Test
    public void testSetBagelLimitOneAndThenAddTwo() {
        Basket basket = new Basket();
        basket.setBasketLimit(1);
        basket.basketContents.put("Brown", 1);
        Assertions.assertFalse(basket.add("Seeds", 1));
    }

    @Test
    public void testSetBagelLimitHigherToAddMore() {
        Basket basket = new Basket();
        basket.add("Brown", 1);
        basket.setBasketLimit(2);
        Assertions.assertTrue(basket.add("Seeds", 1));
    }

    @Test
    public void testRemoveBagelFromEmptyBasket() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.remove("Seeds", 1));
    }

    @Test
    public void testRemoveBagelNotInBasket() {
        Basket basket = new Basket();
        basket.basketContents.put("Brown",1);
        basket.basketContents.put("Sourdough",1);
        Assertions.assertFalse(basket.remove("Seeds", 1));
    }

    @Test
    public void testAddMultipleOfSingleBagel() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Onion", 3));
    }

    @Test
    public void testAddMoreBagelsThanCapacity() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.add("Onion", 40));
    }

    @Test
    public void testRemoveMultipleBagelsFromBasket() {
        Basket basket = new Basket();
        basket.add("Onion", 3);
        Assertions.assertTrue(basket.remove("Onion", 2));
    }

    @Test
    public void testRemoveMoreBagelsThanWhatIsInBasket() {
        Basket basket = new Basket();
        basket.add("Onion", 2);
        Assertions.assertFalse(basket.remove("Onion", 3));
    }

    @Test
    public void testGetDisplayOfBasketWithOneBagel() {
        Basket basket = new Basket();
        basket.add("Onion", 2);
        Assertions.assertEquals(basket.display(), "Onion: 2");
    }

    @Test
    public void testGetDisplayOfBasketWithMultipleBagels() {
        Basket basket = new Basket();
        basket.add("Brown", 1);
        basket.add("Seeds", 1);
        basket.add("Sourdough", 1);
        Assertions.assertEquals(basket.display(), "Brown: 1\nSeeds: 1\nSourdough: 1");
    }

    @Test
    public void testGetDisplayOfEmptyBasket() {
        Basket basket = new Basket();
        Assertions.assertEquals(basket.display(), "");
    }
}
