package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void testAdding() {
        Basket _basket = new Basket();

        Assertions.assertTrue(_basket.add("plain_bagel"));
        Assertions.assertTrue(_basket.add("everything_bagel"));
        Assertions.assertTrue(_basket.add("egg_bagel"));

        Assertions.assertFalse(_basket.add("everything_bagel"));
    }

    @Test
    public void testRemoving() {
        Basket _basket = new Basket();

        _basket.add("plain_bagel");
        _basket.add("everything_bagel");
        _basket.add("egg_bagel");

        Assertions.assertTrue(_basket.remove("everything_bagel"));
        Assertions.assertFalse(_basket.remove("gluck_bagel"));
    }

    @Test
    public void adjustBasketCapacity() {
        Basket _basket = new Basket();

        _basket.changeBasketCapacity(3);

        Assertions.assertEquals(3, _basket.getCapacity());

        _basket.changeBasketCapacity(10);

        Assertions.assertNotEquals(3, _basket.getCapacity());
    }

    @Test
    public void testRemovingBeyond() {
        Basket _basket = new Basket();

        Assertions.assertTrue(_basket.add("plain_bagel"));

        Assertions.assertTrue(_basket.remove("plain_bagel"));
        Assertions.assertFalse(_basket.remove("plain_bagel"));
    }
}
