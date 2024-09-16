package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

class BasketTest {

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
        Basket basket = new Basket(User.MEMBER_OF_PUBLIC);
        ArrayList<String> expectedBasket = new ArrayList<>();
        expectedBasket.add("Vege Bagle");

        Assertions.assertDoesNotThrow(() -> basket.addBagle(VEGE_BAGLE));
        Assertions.assertEquals(expectedBasket, basket.getBagelsInBasket());
    }

    @Test
    void addBagle_ShouldNotAddBagleCapacityFull(){
        Basket basket = new Basket(User.MEMBER_OF_PUBLIC);
        for (int i = 0; i < basket.getUserCapacity(); i++){
            basket.addBagle(PENAUTBUTTER_BAGLE);
        }

        Assertions.assertThrows(IllegalStateException.class, () -> basket.addBagle(PENAUTBUTTER_BAGLE));
    }

    @Test
    void removeBagle_ShouldRemoveBagle(){
        Basket basket = new Basket(User.MEMBER_OF_PUBLIC);
        basket.addBagle(CHEESE_BAGLE);

        Assertions.assertDoesNotThrow(() -> basket.removeBagle(CHEESE_BAGLE));
        Assertions.assertTrue(basket.getBagelsInBasket().isEmpty());
    }

    @Test
    void removeBagle_ShouldNotRemoveBagleNotInBaglesInBasket(){
        Basket basket = new Basket(User.MEMBER_OF_PUBLIC);
        basket.addBagle(NUTELLA_BAGLE);
        Assertions.assertThrows(NoSuchElementException.class,() -> basket.removeBagle(CHEESE_BAGLE));
    }

    @Test
    void changeBasketSize_ShouldChangeCapacity(){
        Basket basket = new Basket(User.BAGELS_MANAGER);
        int newCapacity = 10;
        basket.changeBasketSize(newCapacity);

        Assertions.assertEquals(basket.getCapacity(), newCapacity);
    }

    @Test
    void changeBasketSize_ShouldNotChangeCapacityPermissionDenied(){
        Basket basket = new Basket(User.MEMBER_OF_PUBLIC);
        Assertions.assertThrows(IllegalStateException.class,() -> basket.changeBasketSize(7));

    }

    @Test
    void changeBasketSize_ShouldChangeCapacityForNextBasket() {
        Basket basket = new Basket(User.BAGELS_MANAGER);

        int newCapacity = 6;
        basket.changeBasketSize(newCapacity);

        Basket basket2 = new Basket(User.MEMBER_OF_PUBLIC);

        Assertions.assertEquals(newCapacity,basket2.getUserCapacity());
    }

    @Test
    void changeBasketSize_ShouldNotChangeCapacityForPreviousBasket(){
        Basket basket = new Basket(User.MEMBER_OF_PUBLIC);
        int basketCappacity = basket.getCapacity();
        Basket menagerBasket = new Basket(User.BAGELS_MANAGER);
        int newCapacity = 10;
        menagerBasket.changeBasketSize(newCapacity);

        Assertions.assertEquals(basket.getUserCapacity(), basketCappacity);
    }
}
