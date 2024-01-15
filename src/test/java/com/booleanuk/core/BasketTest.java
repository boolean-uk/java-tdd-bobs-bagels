package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    //User Story 1
    @Test
    public void bagelAddedToBasketReturnTrue() {
        Basket basket = new Basket();

        basket.addBagelTypeToBasket("Chocolate Bagels");

        boolean bagelAdded = basket.bagels.contains("Chocolate Bagels");

        Assertions.assertTrue(bagelAdded);
    }

    //User Story 2
    @Test
    public void removeBagelFromBasketReturnTrue() {
        Basket basket = new Basket();

        basket.addBagelTypeToBasket("Chocolate Bagels");

        basket.removeBagelTypeFromBasket("Chocolate Bagels");

        boolean bagelRemoved = !basket.bagels.contains("Chocolate Bagels");

        Assertions.assertTrue(bagelRemoved);
    }

    //User Story 3
    @Test
    public void basketIsFullReturnAffirmingStatement() {

        Basket basket = new Basket();

        String message = basket.isBasketFull(10);

        Assertions.assertEquals("Basket is full!", message);
    }

}
