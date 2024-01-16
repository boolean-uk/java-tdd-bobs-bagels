package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addBagelToBasket(){
        Basket basket = new Basket();
        Bagel sesame = new Bagel("Sesame Bagel", 4.50);
        basket.add(sesame);
        Assertions.assertEquals(basket.items.get(sesame).name, "Sesame Bagel");
        Assertions.assertEquals(basket.items.get(sesame).price, 4.50);
    }
    @Test
    public void checkIfBasketIsFull(){
    }
    @Test
    public void removeBagelFromBasket(){

    }
    @Test
    public void existsBagelInCart(){

    }
    @Test
    public void isAuthorizedToChangeCap(){

    }
    @Test
    public void capacityIsChanged(){

    }
}
