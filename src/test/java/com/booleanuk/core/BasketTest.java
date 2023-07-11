package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

class BasketTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Basket basket;
    private static final int INITIAL_CAPACITY = 2;
    private String message;
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        basket = new Basket(INITIAL_CAPACITY);
    }

    @Test
    public void addToBasketTypeExists() throws Exception {
        String bagelType = "Ham and cheese";

        // Execute
        basket.addToBasket(bagelType);

        // Verify
        Assertions.assertEquals(List.of(bagelType), basket.getContents());
    }

    @Test
    public void addToBasketTypeDoesNotExist() {
        String bagelType = "Harnas Bagel";

        // Execute
        try {
            basket.addToBasket(bagelType);
        }
        catch (Exception e) {
            message = e.toString();
        }

        // Verify
        Assertions.assertEquals("java.lang.Exception: Bagel Type does not exist", message);
    }

    @Test
    public void shouldRemoveFromBasket() throws Exception {
        // Setup
        String bagelType1 = "Ham and cheese";
        String bagelType2 = "Cheese and bacon";
        basket.addToBasket(bagelType1);
        basket.addToBasket(bagelType2);

        // Execute
        basket.removeFromBasket("Ham and cheese");

        // Verify
        Assertions.assertEquals(List.of("Cheese and bacon"), basket.getContents());
    }

    @Test
    public void shouldShowInfoThatBagelIsNotPresent() throws Exception{
        // Setup
        String bagelType1 = "Ham and cheese";
        basket.addToBasket(bagelType1);

        // Execute
        basket.removeFromBasket("Cheese and bacon");

        // Verify
        String expected = "Cheese and bacon bagel is not in the basket";
        Assertions.assertEquals(expected, outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void isBasketFullShouldReturnTrue() throws Exception {
        // Setup
        String bagelType1 = "Ham and cheese";
        String bagelType2 = "Cheese and bacon";
        basket.addToBasket(bagelType1);
        basket.addToBasket(bagelType2);

        // Execute
        boolean isBasketFull = basket.isBasketFull();

        // Verify
        Assertions.assertTrue(isBasketFull);
    }

    @Test
    public void isBasketFullShouldReturnFalse() throws Exception {
        // Setup
        String bagelType1 = "Ham and cheese";
        basket.addToBasket(bagelType1);

        // Execute
        boolean isBasketFull = basket.isBasketFull();

        // Verify
        Assertions.assertFalse(isBasketFull);
    }

    @Test
    public void isBasketFullShouldNotAllowAddingToBasket() throws Exception {
        // Setup
        String bagelType1 = "Ham and cheese";
        String bagelType2 = "Cheese and bacon";
        String bagelType3 = "Nutella";
        basket.addToBasket(bagelType1);
        basket.addToBasket(bagelType2);

        // Execute
        basket.addToBasket(bagelType3);

        // Verify
        String expected = "Basket is full!!!";
        Assertions.assertEquals(expected, outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void shouldChangeBasketCapacity() throws Exception {
        // Setup
        int new_capacity = 5;

        // Execute
        basket.changeBasketCapacity(new_capacity);

        // Verify
        Assertions.assertEquals(new_capacity, basket.getCapacity());
    }

    @Test
    public void shouldNotChangeBasketCapacityAndThrowException() {
        // Setup
        int new_capacity = 1;

        // Execute
        try {
            basket.changeBasketCapacity(new_capacity);
        } catch (Exception e) {
            message = e.toString();
        }

        // Verify
        Assertions.assertEquals("java.lang.Exception: Cannot change capacity " +
                "to lower than the current!", message);
    }
}
