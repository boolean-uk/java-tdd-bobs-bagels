package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        basket.authorize();
        basket.updateCapacity(1);
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());

        Assertions.assertEquals(1, basket.items);

        basket.updateCapacity(3);
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());

        Assertions.assertEquals(3, basket.items);
    }

    @Test
    public void changingCapacity(){
        Basket basket = new Basket();
        basket.authorize();
        basket.add(new VeganBagel());
        basket.add(new VeganBagel());
        basket.add(new SpicyBagel());
        basket.updateCapacity(2);

        Assertions.assertTrue(basket.itemList.isEmpty());
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

    @Test
    public void testingTotalCost(){
        Basket basket = new Basket();
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());
        basket.add(new SpicyBagel());
        basket.add(new VeganBagel());
        basket.add(new VeganBagel());

        double estimated = new SpicyBagel().getPrice()*3 + new VeganBagel().getPrice()*2;
        Assertions.assertEquals(estimated, basket.totalCost());
    }
}
