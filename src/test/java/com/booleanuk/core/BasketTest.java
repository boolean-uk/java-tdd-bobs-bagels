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


    @Test
    public void shouldRemoveBagelFromBasket(){

        //when
        String bagel = "Plain Bagel";
        String bagel2 = "Egg Bagel";
        basket.add(bagel);
        basket.add(bagel2);
        //given

        basket.remove(bagel2);
        //then

        assertEquals(1, basket.getBasket().size());
    }

}
