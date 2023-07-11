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
        boolean boolCheckFalse = basket.bagelCheck(basketArray, bagel3);
        Assertions.assertFalse(boolCheckFalse);
        boolean boolCheckTrue = basket.bagelCheck(basketArray, bagel2);
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
        boolean boolCheckFalse = basket.removeBagel(basketArray, bagel3);
        Assertions.assertFalse(boolCheckFalse);
        boolean boolCheckTrue = basket.removeBagel(basketArray, bagel2);
        Assertions.assertTrue(boolCheckTrue);
    }

    @Test
    public void addBagelTest() {
        Basket basket = new Basket();
        String bagel1 = "bagel1";
        String[] basketArray = new String[1];
        boolean boolCheckTrue = basket.addBagel(basketArray, bagel1);
        Assertions.assertTrue(boolCheckTrue);
        boolean boolCheckFalse = basket.addBagel(basketArray, bagel1);
        Assertions.assertFalse(boolCheckFalse);
    }

    @Test
    public void sizeChangeTest() {
        Basket basket = new Basket();
        String[] basketArray = new String[3];
        String[] newArray1 = basket.sizeChange(basketArray, 30);
        Assertions.assertEquals(30, newArray1.length);
        String[] newArray2 = basket.sizeChange(basketArray, 101);
        Assertions.assertEquals(null, newArray2);
    }
}
