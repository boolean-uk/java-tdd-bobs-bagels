package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void basketCheckTest() {
        Basket basket = new Basket();
        String bagel1 = "bagel1";
        String bagel2 = "bagel2";
        String bagel3 = "bagel3";
        String[] basketArray = new String[3];
        basketArray[0] = bagel1;
        basketArray[1] = bagel2;
        boolean boolCheckTrue = basket.basketCheck(basketArray);
        Assertions.assertTrue(boolCheckTrue);
        basketArray[2] = bagel3;
        boolean boolCheckFalse = basket.basketCheck(basketArray);
        Assertions.assertFalse(boolCheckFalse);
    }

    @Test
    public void bagelCheckTest() {
        Basket basket = new Basket();
        String bagel1 = "bagel1";
        String bagel2 = "bagel2";
        String bagel3 = "bagel3";
        String[] basketArray = new String[3];
        basketArray[0] = bagel1;
        basketArray[1] = bagel2;
        boolean boolCheckFalse = basket.bagelCheck(bagel2);
        Assertions.assertFalse(boolCheckFalse);
        boolean boolCheckTrue = basket.bagelCheck(bagel3);
        Assertions.assertTrue(boolCheckTrue);
    }

    @Test
    public void removeBagelTest() {
        Basket basket = new Basket();
        String bagel1 = "bagel1";
        String bagel2 = "bagel2";
        String bagel3 = "bagel3";
        String[] basketArray = new String[3];
        basketArray[0] = bagel1;
        basketArray[1] = bagel2;
        boolean boolCheckFalse = basket.removeBagel(bagel3);
        Assertions.assertFalse(boolCheckFalse);
        boolean boolCheckTrue = basket.removeBagel(bagel2);
        Assertions.assertTrue(boolCheckTrue);
    }

    @Test
    public void addBagelTest() {
        Basket basket = new Basket();
        String bagel1 = "bagel1";
        String[] basketArray = new String[3];
        boolean boolCheckTrue = basket.addBagel(bagel1);
        Assertions.assertTrue(boolCheckTrue);
        boolean boolCheckFalse = basket.addBagel(bagel1);
        Assertions.assertFalse(boolCheckFalse);
    }

    @Test
    public void sizeChangeTest() {
        Basket basket = new Basket();
        String[] basketArray = new String[3];
        boolean boolCheckTrue = basket.sizeChange(basketArray, 30);
        Assertions.assertTrue(boolCheckTrue);
        boolean boolCheckFalse = basket.sizeChange(basketArray, 101);
        Assertions.assertFalse(boolCheckFalse);
    }
}
