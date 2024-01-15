package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addingAnItemToBasketToReturnTrue(){
        Basket basket = new Basket();
        boolean result = basket.add("Cinnamon bagels");
        Assertions.assertTrue(result);
    }
    @Test
    public void addingAnItemToBasketToReturnFalse(){
        Basket basket = new Basket();
        basket.add("Cinnamon bagels");
        boolean result = basket.add("Cinnamon bagels");
        Assertions.assertFalse(result);
    }
    @Test
    public void testRemoveItemOfBasketRemoveCorrectly(){
        Basket basket= new Basket();
        basket.add("Cinnamon bagels");
        Assertions.assertTrue(basket.remove("Cinnamon bagels"));
    }
    @Test
    public void testRemoveItemOfBasketRemoveIncorrectly(){
        Basket basket = new Basket();
        basket.add("Cinnamon bagels");
        Assertions.assertFalse(basket.remove("Egg bagels"));
    }
    @Test
    public void isFullShouldReturnTrue(){
        Basket basket = new Basket();
        basket.add("Cinnamon bagels");
        basket.add("Sesam bagels");
        basket.add("Salt bagels");
        basket.add("Egg bagels");
        Assertions.assertTrue(basket.isFull(4));
    }
    @Test
    public void isFullShouldReturnFalse(){
        Basket basket = new Basket();
        basket.add("Cinnamon bagels");
        Assertions.assertFalse(basket.isFull(4));

    }
    @Test
    public void shouldChangeCapacity(){
        Basket basket = new Basket(4);
        Assertions.assertEquals(8,basket.changeCapacity(8));
    }


}
