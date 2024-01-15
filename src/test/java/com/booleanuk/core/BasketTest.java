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

    //User Story 3 case 1
    @Test
    public void testReturnBasketIsFull() {

        Basket basket = new Basket();

        basket.bagels.add("Chocolate");
        basket.bagels.add("Vanilla");
        basket.bagels.add("Banana");
        basket.bagels.add("Orange");
        basket.bagels.add("Mint");

        String result = basket.basketIsFull();

        Assertions.assertEquals("Basket is full!", result);
    }

    //User Story 3 case 2
    @Test
    public void testReturnBasketIsNotFull() {

        Basket basket = new Basket();

        basket.bagels.add("Chocolate");
        basket.bagels.add("Vanilla");

        String result = basket.basketIsFull();

        Assertions.assertEquals("Basket is not full!", result);
    }

    //User Story 4 case 1
    @Test
    public void basketCapacityIsChanged() {
        Basket basket = new Basket();

        String result = basket.changeBasketCapacity(5, 10);

        Assertions.assertEquals("Basket capacity changed!", result);

    }

    //User Story 4 case 2
    @Test
    public void basketCapacityIsNotChanged() {
        Basket basket = new Basket();

        String result = basket.changeBasketCapacity(5, 5);

        Assertions.assertEquals("Basket capacity is not changed.", result);
    }

}
