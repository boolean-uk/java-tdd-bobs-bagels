package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void basketCheckTest() {
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();
        Basket basket4 = new Basket();
        Basket[] basketArray = new Basket[3];
        basketArray[0] = basket1;
        basketArray[1] = basket2;
        boolean boolCheckTrue = basket4.basketCheck();
        Assertions.assertTrue(boolCheckTrue);
        basketArray[2] = basket3;
        boolean boolCheckFalse = basket4.basketCheck();
        Assertions.assertFalse(boolCheckFalse);
    }

    @Test
    public void bagelCheckTest() {
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();
        Basket[] basketArray = new Basket[3];
        basketArray[0] = basket1;
        basketArray[1] = basket2;
        boolean boolCheckFalse = basket3.bagelCheck();
        Assertions.assertFalse(boolCheckFalse);
        boolean boolCheckTrue = basket2.bagelCheck();
        Assertions.assertTrue(boolCheckTrue);
    }

    @Test
    public void removeBagelTest() {
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();
        Basket[] basketArray = new Basket[3];
        basketArray[0] = basket1;
        basketArray[1] = basket2;
        boolean boolCheckFalse = basket3.removeBagel();
        Assertions.assertFalse(boolCheckFalse);
        boolean boolCheckTrue = basket2.removeBagel();
        Assertions.assertTrue(boolCheckTrue);
    }

    @Test
    public void addBagelTest() {
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket[] basketArray = new Basket[1];
        boolean boolCheckTrue = basket1.addBagel();
        Assertions.assertTrue(boolCheckTrue);
        boolean boolCheckFalse = basket2.addBagel();
        Assertions.assertFalse(boolCheckFalse);
    }

    @Test
    public void sizeChangeTest() {
        Basket[] basketArray = new Basket[1];
        boolean boolCheckTrue = basketArray.sizeChange(30);
        Assertions.assertTrue(boolCheckTrue);
        boolean boolCheckFalse = basketArray.sizeChange(101);
        Assertions.assertFalse(boolCheckFalse);
    }
}
