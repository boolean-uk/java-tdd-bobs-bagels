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

        Assertions.assertFalse(basket.isFull());
        Assertions.assertEquals(basket.getItems().get(sesame), price);
    }
    @Test
    public void checkIfBasketIsFull(){
        Basket basket = new Basket();
        String sesame = "Sesame Bagel";
        double price1 = 4.50;
        String redvelvet = "Everything Bagel";
        double price2 = 5.50;
        String jalapenoCheese = "jalapenoCheese Bagel";
        double price3 = 5.50;
        String cinnamon = "Cinnamon Bagel";
        double price4 = 4.50;
        String flaxseed = "Flaxseed Bagel";
        double price5 = 3.50;
        String oats = "Oat Bagel";
        double price6 = 5.50;
        String whole = "WholeGrain Bagel";
        double price7 = 6.50;

        basket.add(sesame, price1);
        basket.add(redvelvet, price2);
        basket.add(jalapenoCheese, price3);
        basket.add(cinnamon, price4);
        basket.add(flaxseed, price5);
        basket.add(oats, price6);
        basket.add(whole, price7);

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
        Basket basket = new Basket();
        int newCapacity = 10;
        int managerCode = 1234;
        basket.changeCap(newCapacity, managerCode);

        Assertions.assertEquals(newCapacity, basket.getCapacity());
    }
}
