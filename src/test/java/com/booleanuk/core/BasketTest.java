package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addBagelTest() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("Sesame"));
    }

    @Test
    public void removeBagelTest() {
        Basket basket = new Basket();
        basket.add("Plain");
        Assertions.assertTrue(basket.remove("Plain"));

    }

    @Test
    public void checkBasketSize() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.checkBasketSize());
    }

    @Test
    public  void addBagelToFullBasket() {
        Basket basket = new Basket();
        basket.add("Plain");
        basket.add("Sesame");
        basket.add("Mixed");
        basket.add("Everything bagel");
        Assertions.assertTrue(basket.checkBasketSize());

        // Try to add basket when full
        Assertions.assertFalse(basket.add("Plain"));
    }

    @Test
    public void changeBasketSizeTest(){
        Basket basket = new Basket();

        Assertions.assertFalse(basket.changeBasketSize(1, 1));
        Assertions.assertTrue(basket.changeBasketSize(0, 6));
    }

    @Test
    public void changeBasketSizeWhenFullTest() {
        Basket basket = new Basket();
        basket.add("Sesame");
        basket.add("Sesame");
        basket.add("Sesame");
        basket.add("Sesame");
        Assertions.assertFalse(basket.add("Sesame"));


        Assertions.assertTrue(basket.changeBasketSize(0, 6));
        Assertions.assertTrue(basket.add("Plain"));
        Assertions.assertTrue(basket.add("Plain"));
        //Basket full
        Assertions.assertFalse(basket.add("Plain"));
        Assertions.assertFalse(basket.changeBasketSize(1, 7));
        Assertions.assertFalse(basket.add("Plain"));
    }
//$ git commit -m "Checked so normal user cannot change basket size"
    @Test
    public void removeNonExistingBagelTest(){
        Basket basket = new Basket();
        basket.add("Sesame");
        basket.add("Sesame");
        Assertions.assertFalse(basket.remove("Plain"));
    }

}
