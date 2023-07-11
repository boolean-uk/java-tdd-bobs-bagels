package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {


    Basket basket;

    @BeforeEach
    public void beforeStart() {
        basket = new Basket();
    }

    @Test
    public void shouldAddBagelToBasket() {
        //when
        String bagel = "Plain Bagel";
        //given

        basket.add(bagel);
        //then

        assertEquals(1, basket.getBasket().size());
    }

}
