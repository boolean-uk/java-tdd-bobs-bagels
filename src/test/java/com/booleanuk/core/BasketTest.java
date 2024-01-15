package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

        //9 new added entries
        basket.bagels.add("Chocolate");
        basket.bagels.add("Vanilla");
        basket.bagels.add("Banana");
        basket.bagels.add("Orange");
        basket.bagels.add("Mint");
        basket.bagels.add("Chocolate");
        basket.bagels.add("Vanilla");
        basket.bagels.add("Banana");
        basket.bagels.add("Orange");

        //If newCapacity > this.bagels.size() then the following should pass the test
        String result = basket.changeBasketCapacity(10);

        Assertions.assertEquals("Basket capacity changed!", result);

    }

    //User Story 4 case 2
    @Test
    public void basketCapacityIsNotChanged() {
        Basket basket = new Basket();

        //5 entries
        basket.bagels.add("Chocolate");
        basket.bagels.add("Vanilla");
        basket.bagels.add("Banana");
        basket.bagels.add("Orange");
        basket.bagels.add("Mint");

        //This should pass, as theres already 5 bagels in the list and the new capacity is 5
        //Thus the capacity hasnt changed, if new capacity is lower than 5, it should also pass
        //as the capacity can't be lowered than the items already in the list
        String result = basket.changeBasketCapacity(5);

        //It should fail if the new capacity is bigger than 5 as the capacity has then been changed

        Assertions.assertEquals("Basket capacity is not changed.", result);
    }

    @Test
    public void canRemoveItemFromBasket() {
        Basket basket = new Basket();

        String result = basket.canRemoveItemInBasket("Milk");

        Assertions.assertEquals("Item is in basket and can be removed.", result);
    }

    @Test
    public void canNotRemoveItemFromBasket() {

        Basket basket = new Basket();

        String result = basket.canRemoveItemInBasket("Milk");

        Assertions.assertEquals("Item is not in basket and can't be removed.", result);
    }

}
