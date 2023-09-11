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
        Assertions.assertTrue(basket.items.contains(productOne));
        Assertions.assertTrue(basket.items.contains(productTwo));
        Assertions.assertTrue(basket.items.contains(productThree));

        Assertions.assertFalse(basket.items.contains(productFour));
        Assertions.assertFalse(basket.items.contains(productFive));
        Assertions.assertFalse(basket.items.contains(productSix));


    }


}
