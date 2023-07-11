package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAdd_WhenThereIsEnoughSpaceInTheBasket_ShouldReturnTrue(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket();

        //When
        boolean result = basket.add(bagelName, 2);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testAdd_WhenThereIsEnoughSpaceInTheBasketAndThereIsBagelWithGivenNameInIt_ShouldQuantityBeIncreased(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket();

        //When
        basket.add(bagelName, 2);
        basket.add(bagelName, 3);
        int result = basket.getBagels().get(bagelName);

        //Then
        Assertions.assertEquals(result, 5);
    }

    @Test
    public void testAdd_WhenThereIsNotEnoughSpaceForAnotherBagel_ShouldReturnFalse(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(2);

        //When
        int result = basket.add(bagelName, 3);

        //Then
        Assertions.assertFalse(result);
    }
}
