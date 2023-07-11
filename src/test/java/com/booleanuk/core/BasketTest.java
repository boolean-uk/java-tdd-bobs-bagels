package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class BasketTest {
    @Test
    public void addAddsBagelToBasket() {
        Basket basket = new Basket();
        HashMap<BagelType, Integer> expectedBagels = new HashMap<>();
        expectedBagels.put(BagelType.WITH_SALT, 1);
        expectedBagels.put(BagelType.WITH_POPPY, 1);

        Assertions.assertTrue(basket.add(BagelType.WITH_SALT));
        Assertions.assertTrue(basket.add(BagelType.WITH_POPPY));

        Assertions.assertEquals(expectedBagels, basket.getBagels());
    }

    @Test
    public void addAddsToOverfilledBasket() {
        Basket basket = new Basket();
        Basket.changeCapacity(5);
        basket.getBagels().put(BagelType.WITH_SALT, 2);
        basket.getBagels().put(BagelType.WITH_POPPY, 2);
        basket.getBagels().put(BagelType.WITH_SESAME, 1);
        HashMap<BagelType, Integer> expectedBagels = new HashMap<>();
        expectedBagels.put(BagelType.WITH_SALT, 2);
        expectedBagels.put(BagelType.WITH_POPPY, 2);
        expectedBagels.put(BagelType.WITH_SESAME, 1);

        Assertions.assertFalse(basket.add(BagelType.WITH_POPPY));
        Assertions.assertEquals(expectedBagels, basket.getBagels());
    }

    @Test
    public void removeRemovesBagelFromBasket() {
        Basket basket = new Basket();
        basket.add(BagelType.WITH_SALT);
        basket.add(BagelType.WITH_SALT);
        basket.add(BagelType.WITH_POPPY);

        HashMap<BagelType, Integer> expectedBagels = new HashMap<>();
        expectedBagels.put(BagelType.WITH_SALT, 1);
        expectedBagels.put(BagelType.WITH_POPPY, 1);

        Assertions.assertTrue(basket.remove((BagelType.WITH_SALT)));

        Assertions.assertEquals(basket.getBagels(), expectedBagels);
    }

    @Test
    public void removeReturnsFalseWhenItemToRemoveDoesNotExist() {
        Basket basket = new Basket();
        basket.add(BagelType.WITH_SESAME);

        HashMap<BagelType, Integer> expectedBagels = new HashMap<>();
        expectedBagels.put(BagelType.WITH_SESAME, 1);

        Assertions.assertFalse(basket.remove((BagelType.WITH_SALT)));

        Assertions.assertEquals(basket.getBagels(), expectedBagels);
    }

    @Test
    public void changeChangesCapacity() {
        Basket.changeCapacity(6);
        Assertions.assertEquals(6, Basket.capacity);

        Basket.changeCapacity(7);
        Assertions.assertEquals(7, Basket.capacity);
    }

}
