package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addTypeBagel() {
        Basket basket = new Basket();
        String type = "Sesame";
        double price = 6;
        Assertions.assertTrue(basket.add(type, price));
        Assertions.assertTrue(basket.bagels.containsKey(type));
        Assertions.assertEquals(price, basket.bagels.get(type));

        double price2 = 8;
        Assertions.assertFalse(basket.add(type, price2));
        Assertions.assertEquals(price, basket.bagels.get(type));
    }

    @Test
    public void removeBagel() {
        Basket basket = new Basket();
        String type = "Multigrain";
        String type2 = "Sesame";
        double price = 6;
        basket.bagels.put(type2, price);

        Assertions.assertFalse(basket.bagels.isEmpty());

        Assertions.assertFalse(basket.bagels.containsKey(type));
        Assertions.assertFalse(basket.remove(type));

        Assertions.assertTrue(basket.bagels.containsKey(type2));
        Assertions.assertTrue(basket.remove(type2));

        Assertions.assertTrue(basket.bagels.isEmpty());
    }

    @Test
    public void isFull() {
        Basket basket = new Basket();

        Assertions.assertEquals(basket.bagels.size(), 0);
        Assertions.assertFalse(basket.isFull());

        basket.bagels.put("Sesame", 6.0);
        basket.bagels.put("Multigrain", 8.0);
        basket.bagels.put("Blueberry", 7.5);

        Assertions.assertNotEquals(basket.bagels.size(), 0);
        Assertions.assertTrue(basket.isFull());

        basket.bagels.remove("Sesame");
        Assertions.assertFalse(basket.isFull());

        basket.bagels.put("Garlic ", 9.0);
        basket.bagels.put("Cinnamon", 5.0);
        Assertions.assertTrue(basket.isFull());
    }

    @Test
    public void changeCapacity() {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.setCapacity(3));
        Assertions.assertEquals(3, basket.getCapacity());

        Assertions.assertTrue(basket.setCapacity(4));
        Assertions.assertNotEquals(5, basket.getCapacity());
    }

    @Test
    public void removeNonExistingBagel() {
        Basket basket = new Basket();

        basket.bagels.put("Sesame", 6.0);
        basket.bagels.put("Multigrain", 8.0);
        basket.bagels.put("Blueberry", 7.5);

        String type = "Blueberry";
        Assertions.assertEquals("Bagel does exist and it is removed", basket.removeIfExists(type));
        System.out.println(basket.bagels);

        String type2 = "Egg";
        Assertions.assertEquals("Bagel does not exist", basket.removeIfExists(type2));
    }

}
