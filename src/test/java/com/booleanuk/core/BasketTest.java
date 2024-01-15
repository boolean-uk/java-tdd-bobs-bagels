package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void bagelAddedToBasketReturnTrue() {
        Basket basket = new Basket();

        basket.addBagelTypeToBasket("Chocolate Bagels");

        boolean bagelAdded = basket.bagels.contains("Chocolate Bagels");

        Assertions.assertTrue(bagelAdded);
    }

    @Test
    public void removeBagelFromBasketReturnTrue() {
        Basket basket = new Basket();

        basket.removeBagelTypeFromBasket("Chocolate Bagels");

        boolean bagelRemoved = !basket.bagels.contains("Chocolate Bagels");

        Assertions.assertTrue(bagelRemoved);
    }

}
