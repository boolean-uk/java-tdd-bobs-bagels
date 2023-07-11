package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {
    Basket basket;

    @BeforeEach
    public void beforeStart() {
        basket = new Basket(5);
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

    @Test
    public void shouldCheckWhenTheBasketIsFull() {
        //when
        for (int i = 0; i <= 8; i++) {
            basket.add("Plain Bagel");
        }
        //then
        assertEquals(5, basket.getBasket().size());
    }

    @Test
    public void shouldChangeCapacityOfBasket(){
        assertEquals(5, basket.getCapacity());
        basket.setCapacity(10);
        assertEquals(10, basket.getCapacity());
    }

    @Test
    public void shouldCheckSanity() {
        basket.add("Plain Bagel");
        basket.add("White Bagel");
        basket.remove("Plain Bagel");
        assertEquals(1, basket.getBasket().size());
    }
}
