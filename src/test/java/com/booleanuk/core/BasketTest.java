package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BasketTest {
    private Basket basket;
    private static final int INITIAL_CAPACITY = 3;
    private String message;
    @BeforeEach
    public void setUp() {
        basket = new Basket(INITIAL_CAPACITY);
    }

    @Test
    public void addToBasketTypeExists() throws Exception {
        String bagelType = "Ham and cheese";

        // Execute
        basket.addToBasket(bagelType);

        // Verify
        Assertions.assertEquals(Arrays.asList(bagelType), basket.getContents());
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
}
