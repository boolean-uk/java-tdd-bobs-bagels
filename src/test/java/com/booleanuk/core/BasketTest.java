package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {
    @Test
    public void checkAddedBagel() {
        Basket basket = new Basket();
        String bagelOne = "Plain";

        basket.add(bagelOne);

        Assertions.assertTrue(basket.list.contains(bagelOne));
    }

    @Test
    public void removeBagelFromBasket() {
        Basket basket = new Basket();

        String bagelOne = "Plain";

        //Checks if the bagel was added to be removed later
        basket.list.add(bagelOne);
        Assertions.assertTrue(basket.list.contains(bagelOne));

        basket.remove(bagelOne);
        Assertions.assertFalse(basket.list.contains(bagelOne));

    }

    @Test
    public void notOverfillBasket() {
        Basket basket = new Basket();

        String bagelOne = "Plain";
        String bagelTwo = "Everything";
        String bagelThree = "Blueberry";
        String bagelFour = "Cinnamon";

        basket.add(bagelOne);
        basket.add(bagelTwo);
        basket.add(bagelThree);
        basket.add(bagelFour);

        Assertions.assertEquals(3,basket.list.size());

    }

    @Test
    public void changeCapacity() {
        Basket basket = new Basket();

        basket.changeCapacity(5);

        Assertions.assertEquals(5, basket.capacity);
    }

    @Test
    public void removeBagelNotExist() {
        Basket basket = new Basket();

        String bagelRemove = "Cheddar";
        basket.remove(bagelRemove);

        Assertions.assertEquals("Bagel does not exist in basket", basket.remove(bagelRemove));
    }
}
