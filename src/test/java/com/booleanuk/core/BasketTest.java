package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void addProductsChecker() {
        Basket basket = new Basket();
        String productOne = "Plain";
        String productTwo = "Cinnamon";
        String productThree = "Blueberry";
        String productFour = "Poppy-seed";
        String productFive = "Onion";
        String productSix = "Garlic";


        basket.add(productOne);
        basket.add(productTwo);
        basket.add(productThree);
        Assertions.assertTrue(basket.contains(productOne));
        Assertions.assertTrue(basket.contains(productTwo));
        Assertions.assertTrue(basket.contains(productThree));

        Assertions.assertFalse(basket.contains(productFour));
        Assertions.assertFalse(basket.contains(productFive));
        Assertions.assertFalse(basket.contains(productSix));


    }


}
