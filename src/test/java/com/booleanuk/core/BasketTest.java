package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAdd_WhenThereIsEnoughSpaceInTheBasket_ShouldReturnTrue(){
        //Given
        Basket basket = new Basket();

        //When
        boolean result = basket.add("chocolate bagel", 2);

        //Then
        Assertions.assertTrue(result);
    }
}
