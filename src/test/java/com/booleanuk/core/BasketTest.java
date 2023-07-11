package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BasketTest {
    private Basket basket;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    void setup() {
        basket = new Basket(3);
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void shouldAddBagelToBasket() {
        //Setup
        String bagel = "Plain";

        //Execute
        basket.addBagel(bagel);

        //Verify
        Assertions.assertTrue(basket.getBagels().contains(bagel));
    }

    @Test
    public void shouldNotAddBagelToBasketWhenBasketIsFull() {
        //Setup
        String bagel1 = "Plain";
        String bagel2 = "Plain";
        String bagel3 = "Plain";
        basket.addBagel(bagel1);
        basket.addBagel(bagel2);
        basket.addBagel(bagel3);
        String bagel4 = "Egg";

        //Execute
        basket.addBagel(bagel4);

        //Verify
        Assertions.assertFalse(basket.getBagels().contains(bagel4));
    }

    @Test
    public void shouldRemoveBagelFromBasket() {
        //Setup
        String bagel = "Plain";
        String bagel2 = "Sesame";
        String bagel3 = "Plain";
        basket.addBagel(bagel);
        basket.addBagel(bagel2);
        basket.addBagel(bagel3);

        //Execute
        basket.removeBagel(bagel3);

        //Verify
        Assertions.assertEquals(2,basket.getBagels().size());
    }

    @Test
    public void shouldPrintInfoThatBasketIsFull() {
        //Setup
        String bagel = "Plain";
        String bagel2 = "Sesame";
        String bagel3 = "Plain";
        String bagel4 = "Egg";
        basket.addBagel(bagel);
        basket.addBagel(bagel2);
        basket.addBagel(bagel3);

        //Execute
        basket.addBagel(bagel4);

        //Verify
        Assertions.assertEquals("Basket is full", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void shouldReturnFalseIfBasketIsNotFull() {
        //Setup
        String bagel = "Plain";
        String bagel2 = "Sesame";
        basket.addBagel(bagel);
        basket.addBagel(bagel2);

        //Execute
        boolean isBasketFull = basket.isBasketFull();

        //Verify
        Assertions.assertFalse(isBasketFull);
    }

    @Test
    public void shouldReturnTrueIfBasketIsFull() {
        //Setup
        String bagel = "Plain";
        String bagel2 = "Sesame";
        String bagel3 = "Plain";

        basket.addBagel(bagel);
        basket.addBagel(bagel2);
        basket.addBagel(bagel3);

        //Execute
        boolean isBasketFull = basket.isBasketFull();

        //Verify
        Assertions.assertTrue(isBasketFull);
    }

    @Test
    public void shouldChangeBasketCapacity() {
        //Setup
        int newCapacity = 4;

        //Execute
        basket.setCapacity(newCapacity);

        //Verify
        Assertions.assertEquals(newCapacity, basket.getCapacity());
    }

    @Test
    public void shouldNotChangeBasketCapacityToNegativeValue() {
        //Setup
        int oldCapacity = basket.getCapacity();
        int newCapacity = -1;

        //Execute
        basket.setCapacity(newCapacity);

        //Verify
        Assertions.assertEquals(oldCapacity, basket.getCapacity());
    }

    @Test
    public void shouldNotChangeBasketCapacityForLowerValueThanBasketSize() {
        //Setup
        int oldCapacity = basket.getCapacity();
        int newCapacity = 2;
        String bagel = "Plain";
        String bagel2 = "Sesame";
        String bagel3 = "Plain";
        basket.addBagel(bagel);
        basket.addBagel(bagel2);
        basket.addBagel(bagel3);

        //Execute
        basket.setCapacity(newCapacity);

        //Verify
        Assertions.assertEquals(oldCapacity, basket.getCapacity());
    }
}
