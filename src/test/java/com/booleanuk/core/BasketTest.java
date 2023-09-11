package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void addProducts() {
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

    @Test
    void removeProducts() {
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
        basket.add(productFour);
        basket.add(productFive);
        basket.add(productSix);

        Assertions.assertTrue(basket.items.contains(productOne));
        Assertions.assertTrue(basket.items.contains(productTwo));
        Assertions.assertTrue(basket.items.contains(productThree));
        Assertions.assertTrue(basket.items.contains(productFour));
        Assertions.assertTrue(basket.items.contains(productFive));
        Assertions.assertTrue(basket.items.contains(productSix));

        basket.remove(productFour);
        basket.remove(productFive);
        basket.remove(productSix);


        //remove product 4,5,6 in the method caller below
        //check every string again to see if items that are supposed to be true are still true
        Assertions.assertTrue(basket.items.contains(productOne));
        Assertions.assertTrue(basket.items.contains(productTwo));
        Assertions.assertTrue(basket.items.contains(productThree));

        Assertions.assertFalse(basket.items.contains(productFour));
        Assertions.assertFalse(basket.items.contains(productFive));
        Assertions.assertFalse(basket.items.contains(productSix));


    }


}
