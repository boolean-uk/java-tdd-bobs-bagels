package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testIfAddAddsWhenNotInBasket(){
        Basket basket = new Basket();
        Assertions.assertEquals(("1 Plain bagel(s) added to basket"), basket.add("Plain", 1));
        Assertions.assertEquals(("3 Sesame bagel(s) added to basket"),basket.add("Sesame", 3));
        Assertions.assertTrue(basket.items.containsKey("Plain"));
        Assertions.assertEquals(1, basket.items.get("Plain"));
        Assertions.assertTrue(basket.items.containsKey("Sesame"));
        Assertions.assertEquals(3, basket.items.get("Sesame"));
    }

    public void testIfAddAddsBagelsWhenInBasket(){
        Basket basket = new Basket();
        basket.add("Plain", 2);
        basket.add("Plain", 1);
        Assertions.assertEquals(3, basket.items.get("Plain"));

    }

    @Test
    public void testAddingWhenBasketIsFull(){

        Basket basket = new Basket();
        Assertions.assertEquals(("4 Plain bagel(s) added to basket"), basket.add("Plain", 4));
        Assertions.assertEquals(("1 Sesame bagel(s) added to basket"), basket.add("Sesame", 1));
        Assertions.assertEquals(("Basket is full"), basket.add("Sesame", 1));

    }

    @Test
    public void testRemovingBagelFromBasketWhenBagelsInBasket(){

        Basket basket = new Basket();

        basket.add("Plain", 4);
        basket.add("Sesame", 1);

        Assertions.assertEquals(("2 Plain bagel(s) removed from basket") ,basket.remove("Plain", 2));
        Assertions.assertEquals(("1 Sesame bagel(s) removed from basket") ,basket.remove("Sesame", 1));


    }

    @Test
    public void testRemovingBagelFromBasketWhenNotEnoughBagelsInBasket(){

        Basket basket = new Basket();

        basket.add("Plain", 4);
        basket.add("Sesame", 1);

        Assertions.assertEquals(("2 Plain bagel(s) removed from basket") ,basket.remove("Plain", 2));
        Assertions.assertEquals(("You only have 1 Sesame bagel(s) in your basket") ,basket.remove("Sesame", 2));

    }

    @Test
    public void testRemovingBagelFromBasketWhenBasketIsEmpty(){

        Basket basket = new Basket();

        Assertions.assertEquals(("Basket is empty") ,basket.remove("Plain", 2));

    }

    @Test
    public void testSettingCapaityToHigherNumber(){
        Basket basket = new Basket();
        Assertions.assertEquals(5, basket.maxCapacity);
        Assertions.assertEquals(("New max capaxity set to 10") , (basket.setBasketCapacity(10));
        Assertions.assertEquals(10, basket.maxCapacity);
    }

    @Test
    public void testSettingCapaityToLowerNumber(){

        Basket basket = new Basket();

        basket.add("Plain", 2);
        basket.add("Salmon", 1);
        basket.add("Sesame", 1);
        basket.add("Plain", 1);

        Assertions.assertEquals(5, basket.maxCapacity);

        Assertions.assertEquals(("Basket is now empty and new max capaxity set to 3") , (basket.setBasketCapacity(3));

        Assertions.assertEquals(3, basket.maxCapacity);
        Assertions.assertTrue(basket.items.isEmpty());


    }


}
