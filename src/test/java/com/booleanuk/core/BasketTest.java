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
    private static final int INITIAL_CAPACITY = 3;
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
}
