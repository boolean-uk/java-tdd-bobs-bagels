package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAdd_WhenThereIsEnoughSpaceInTheBasket_ShouldReturnTrue(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(5);

        //When
        boolean result = basket.add(bagelName, 2);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testAdd_WhenThereIsEnoughSpaceInTheBasketAndThereIsBagelWithGivenNameInIt_ShouldQuantityBeIncreased(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(5);

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
        boolean result = basket.add(bagelName, 3);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testAdd_WhenThereIsNotEnoughSpaceInTheBasketAndThereIsBagelWithGivenNameInIt_ShouldQuantityNotBeIncreased(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(4);

        //When
        basket.add(bagelName, 2);
        basket.add(bagelName, 3);
        int result = basket.getBagels().get(bagelName);

        //Then
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void testAdd_WhenQuantityOfBagelIsInvalid_ShouldReturnFalse(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(4);

        //When
        boolean result = basket.add(bagelName, -2);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testAdd_WhenQuantityOfBagelIsInvalid_ShouldQuantityNotBeChanged(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(4);

        //When
        basket.add(bagelName, 2);
        basket.add(bagelName, -3);
        int result = basket.getBagels().get(bagelName);

        //Then
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void testRemove_WhenAllBagelsOfSpecificTypeAreRemoved_ShouldReturnTrue(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(4);

        //When
        basket.add(bagelName, 2);
        basket.add(bagelName, 3);
        boolean result = basket.remove(bagelName);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testRemove_WhenBagelsOfSpecificTypeDoesNotExistInTheBasket_ShouldReturnFalse(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(4);

        //When
        boolean result = basket.remove(bagelName);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testRemove_WhenSpecificQuantityOfBagelsOfSpecificTypeAreRemoved_ShouldReturnTrue(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(4);

        //When
        basket.add(bagelName, 2);
        basket.add(bagelName, 3);
        boolean result = basket.remove(bagelName, 4);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testRemove_WhenSpecificQuantityOfBagelsOfSpecificTypeAreRemoved_ShouldQuantityBeDecreased(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(5);

        //When
        basket.add(bagelName, 2);
        basket.add(bagelName, 3);
        basket.remove(bagelName, 4);
        int result = basket.getBagels().get(bagelName);

        //Then
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void testRemove_WhenSpecificBagelIsNotInTheBasket_ShouldReturnFalse(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(4);

        //When
        boolean result = basket.remove(bagelName, 4);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testRemove_WhenAllQuantityOfBagelsOfSpecificTypeIsRemoved_ShouldBagelNotBeInTheBasket(){
        //Given
        String bagelName = "chocolate bagel";
        Basket basket = new Basket(5);

        //When
        basket.add(bagelName, 2);
        basket.add(bagelName, 3);
        basket.remove(bagelName, 5);
        boolean result = basket.getBagels().containsKey(bagelName);

        //Then
        Assertions.assertFalse(result);
    }
}
