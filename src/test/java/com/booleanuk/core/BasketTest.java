package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {
    @Test
    public void checkAddedBagel() {
        Basket basket = new Basket();
        String bagelOne = "Plain";

        basket.list.add(bagelOne);

        Assertions.assertTrue(basket.list.contains(bagelOne));
    }

    @Test
    public void removeBagelFromBasket() {
        Basket basket = new Basket();

        String bagelOne = "Plain";

        //Checks if the bagel was added to be removed later
        basket.list.add(bagelOne);
        Assertions.assertTrue(basket.list.contains(bagelOne));

        basket.list.remove(bagelOne);
        Assertions.assertFalse(basket.list.contains(bagelOne));

    }



}
