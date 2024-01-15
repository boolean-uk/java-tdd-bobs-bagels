package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

class BasketTest {
    @Test
    public void addBagelToCart(){
        Basket basket = new Basket();
        VeganBagel vegan = new VeganBagel();
        basket.add(vegan);

        Assertions.assertTrue(basket.itemList.containsKey(vegan));
    }

    @Test
    public void removeBagelFromCart(){
        Basket basket = new Basket();
        SpicyBagel spicy = new SpicyBagel();
        basket.add(spicy);
        basket.remove(spicy);

        Assertions.assertTrue(basket.itemList.isEmpty());

        VeganBagel vegan1 = new VeganBagel();
        VeganBagel vegan2 = new VeganBagel();
        VeganBagel vegan3 = new VeganBagel();
        basket.add(vegan1);
        basket.add(vegan2);
        basket.add(vegan3);
        basket.remove(vegan2);

        Assertions.assertFalse(basket.itemList.containsKey(vegan2));
    }

    @Test
    public void removingFromEmptyCartAndNonPresentBagel() {
        Basket basket = new Basket();
        basket.remove(new SpicyBagel());

        Assertions.assertEquals(0, basket.itemList.size());

        basket.add(new VeganBagel());
        basket.add(new VeganBagel());
        basket.remove(new SpicyBagel());
    }

    @Test
    public void testingCapacity(){
        Basket basket = new Basket();
        basket.updateCapacity(1);
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());

        Assertions.assertEquals(1, basket.itemList.size());

        basket.updateCapacity(3);
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());

        Assertions.assertEquals(3, basket.itemList.size());
    }

    @Test
    public void changingCapacity(){

    }

    @Test
    public void testingAmount(){
        Basket basket = new Basket();
        SpicyBagel spicy = new SpicyBagel();
        VeganBagel vegan = new VeganBagel();
        basket.add(spicy);
        basket.add(vegan);
        basket.add(new SpicyBagel());
        basket.add(new VeganBagel());
        basket.add(new VeganBagel());
        basket.add(new VeganBagel());

        Assertions.assertEquals(4, basket.itemList.get(vegan));
        Assertions.assertEquals(2, basket.itemList.get(spicy));

        basket.remove(new VeganBagel());
        basket.remove(new VeganBagel());
        basket.remove(new VeganBagel());

        Assertions.assertEquals(1, basket.itemList.get(vegan));

        basket.remove(new VeganBagel());
        basket.remove(new VeganBagel());
    }
}
