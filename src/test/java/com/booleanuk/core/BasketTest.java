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
        String sesame = "Sesame Bagel";
        double price = 4.50;

        basket.add(sesame, price);
        Assertions.assertTrue(basket.isNotEmpty(sesame));
        basket.remove(sesame);
        Assertions.assertFalse(basket.isNotEmpty(sesame));
    }
    @Test
    public void existsBagelInCart(){
        Basket basket = new Basket();
        String sesame = "Sesame Bagel";
        double price1 = 4.50;
        String jalapenoCheese = "Jalapeno Cheese Bagel";
        double price2 = 5.50;

        basket.add(sesame, price1);
        Assertions.assertTrue(basket.isNotEmpty(sesame));
        Assertions.assertFalse(basket.isNotEmpty(jalapenoCheese));


    }
    @Test
    public void isAuthorizedToChangeCap(){
        Basket basket = new Basket();
        int managerCode = 1234;

        Assertions.assertTrue(basket.isManager(managerCode));
    }

    @Test
    public void capacityIsChanged(){

    }
}
