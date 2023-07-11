package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    @Test
    void constructor_shouldThrowForNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> new Basket(-1));
    }

    @Test
    void addBagel_shouldAddBagelWhenEnoughCapacity() {
        var basket = new Basket(1);
        basket.addBagel(Bagel.Plain);

        assertTrue(
                Arrays
                        .asList(basket.getBagels())
                        .contains(Bagel.Plain)
        );
    }

    @Test
    void addBagel_shouldThrowWhenNotEnoughCapacity() {
        var basket = new Basket(1);
        basket.addBagel(Bagel.Plain);

        assertThrows(IllegalStateException.class, () -> basket.addBagel(Bagel.WithPoppy));
    }

    @Test
    void removeBagel_shouldRemoveBagelIfPresent() {
        var basket = new Basket(1);
        basket.addBagel(Bagel.Plain);

        basket.removeBagel(Bagel.Plain);

        assertTrue(
                Arrays
                        .asList(basket.getBagels())
                        .contains(Bagel.Plain)
        );
    }

    @Test
    void removeBagel_shouldThrowIfAbsent() {
        var basket = new Basket(1);

        assertThrows(NoSuchElementException.class, () -> basket.removeBagel(Bagel.Plain));
    }

    @Test
    void resize_shouldResizeForCapacityGreaterThanAmountOfItems() {
        var basket = new Basket(3);
        for (var b : Bagel.values()) {
            basket.addBagel(b);
        }

        var expectedSize = 5;

        assertDoesNotThrow(() -> basket.resize(expectedSize));
        assertEquals(expectedSize, basket.getBagels().length);
    }

    @Test
    void resize_shouldThrowForCapacitySmallerThanAmountOfItems() {
        var basket = new Basket(3);
        for (var b : Bagel.values()) {
            basket.addBagel(b);
        }

        assertThrows(IllegalArgumentException.class, () -> basket.resize(2));
    }
}
