package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addBagelToBasket() {
        Basket basket = new Basket();
        String sesame = "Sesame Bagel";
        double price = 4.50;
        basket.add(sesame, price);

        Assertions.assertEquals(basket.getItems().get(sesame), price);
    }
    @Test
    public void checkIfBasketIsFull(){
        Basket basket = new Basket();
        String sesame = "Sesame Bagel";
        double price = 4.50;
        basket.add(sesame, price);

        Assertions.assertTrue(basket.isFull());
    }
    @Test
    public void removeBagelFromBasket(){
        Basket basket = new Basket();

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
