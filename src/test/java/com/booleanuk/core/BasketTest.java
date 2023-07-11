package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

class BasketTest {

    private static Basket BASKET;
    private static String CHEESE_BAGLE;
    private static String VEGE_BAGLE;
    private static String NUTELLA_BAGLE;
    private static String PENAUTBUTTER_BAGLE;
    @BeforeAll
    static void testSetup() {
        CHEESE_BAGLE = "Cheese bagle";
        VEGE_BAGLE = "Vege Bagle";
        NUTELLA_BAGLE = "Nutella Bagle";
        PENAUTBUTTER_BAGLE = "Peanut Butter Bagle";
    }

    @Test
    void addBagle_ShouldAddBagleCapacityNotfull(){
        BASKET = new Basket(User.MEMBER_OF_PUBLIC);
        ArrayList<String> expectedBasket = new ArrayList<>();
        expectedBasket.add("Vege Bagle");

        Assertions.assertDoesNotThrow(() -> BASKET.addBagle(VEGE_BAGLE));
        Assertions.assertEquals(expectedBasket, BASKET.getBagelsInBasket());
    }

    @Test
    void addBagle_ShouldNotAddBagleCapacityFull(){
        BASKET = new Basket(User.MEMBER_OF_PUBLIC);
        BASKET.addBagle(CHEESE_BAGLE);
        BASKET.addBagle(VEGE_BAGLE);
        BASKET.addBagle(NUTELLA_BAGLE);

        Assertions.assertThrows(IllegalStateException.class, () -> BASKET.addBagle(PENAUTBUTTER_BAGLE));
    }

    @Test
    void removeBagle_ShouldRemoveBagle(){
        BASKET = new Basket(User.MEMBER_OF_PUBLIC);
        BASKET.addBagle(CHEESE_BAGLE);

        Assertions.assertDoesNotThrow(() -> BASKET.removeBagle(CHEESE_BAGLE));
        Assertions.assertTrue(BASKET.getBagelsInBasket().isEmpty());
    }

    @Test
    void removeBagle_ShouldNotRemoveBagleNotInBaglesInBasket(){
        BASKET = new Basket(User.MEMBER_OF_PUBLIC);
        BASKET.addBagle(NUTELLA_BAGLE);
        Assertions.assertThrows(NoSuchElementException.class,() -> BASKET.removeBagle(CHEESE_BAGLE));
    }

    @Test
    void changeBasketSize_ShouldChangeSize(){
        BASKET = new Basket(User.BAGELS_MANAGER);
        int newCapacity = 10;
        BASKET.changeBasketSize(newCapacity);

        Assertions.assertEquals(BASKET.getCapacity(), newCapacity);
    }

    @Test
    void changeBasketSize_ShouldNotChangeSizePermissionDenied(){

    }
}
