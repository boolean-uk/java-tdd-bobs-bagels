package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addTestIfAddingGoesWellBagelType(){
        Basket basket = new Basket();
        basket.capacity = 2;
        basket.add("Bagel 1");
        Assertions.assertEquals(basket.bagels.get("Bagel 1"), 1);
    }

    @Test
    public void addTestIfAddingGoesWellBagelTypeInt(){
        Basket basket = new Basket();
        basket.capacity = 2;
        String message  = basket.add("Bagel 1");
        Assertions.assertEquals(basket.bagels.get("Bagel 1"), 1);
        Assertions.assertEquals(message, "bagel added");
    }

    @Test
    public void addTestIfAddingGoesWrongOverfilled(){
        Basket basket = new Basket();
        basket.capacity = 1;
        basket.add("Bagel 1");
        String message  = basket.add("Bagel 2");
        Assertions.assertFalse(basket.bagels.containsKey("Bagel 2"));
        Assertions.assertEquals(message,  "overfilled cart");
    }


    @Test
    public void isOverfilledTestIfBasketIsNotOverfilled(){
        Basket basket = new Basket();
        basket.capacity = 3;
        Assertions.assertFalse(basket.isOverfilled(2));
    }

    @Test
    public void isOverfilledTestIfBasketIsOverfilled(){
        Basket basket = new Basket();
        basket.capacity = 1;
        Assertions.assertTrue(basket.isOverfilled(2));
    }

    @Test
    public void removeTestIfBagelIsNotFound(){
        Basket basket = new Basket();
        basket.add("Bagel 1");
        Assertions.assertEquals(basket.remove("Bagel 2"), "bagel not found");
    }

    @Test
    public void removeTestIfBagelIsFound(){
        Basket basket = new Basket();
        basket.add("Bagel 1");
        Assertions.assertEquals(basket.remove("Bagel 1"), "bagel removed");
        Assertions.assertFalse(basket.bagels.containsKey("Bagel 1"));
        Assertions.assertEquals(basket.total, 0);
    }

    @Test
    public void removeWithCountTestIfBagelIsNotFound(){
        Basket basket = new Basket();
        basket.add("Bagel 1");
        Assertions.assertEquals(basket.remove("Bagel 2", 1), "bagel not found");
    }

    @Test
    public void removeWithCountTestIfBagelIsFound(){
        Basket basket = new Basket();
        basket.add("Bagel 1", 2);
        Assertions.assertEquals(basket.remove("Bagel 1", 1), "bagel removed");
        Assertions.assertEquals(basket.bagels.get("Bagel 1"), 1);
    }

    @Test
    public void removeWithCountTestIfGivenCountIsBiggerThanBagelQuantity(){
        Basket basket = new Basket();
        basket.add("Bagel 1");
        Assertions.assertEquals(basket.remove("Bagel 1", 2), "count is bigger than quantity of this bagel");
    }

    @Test
    public void emptyBasketTestIfAllBagelsRemoved(){
        Basket basket = new Basket();
        basket.add("Bagel 1");
        basket.add("Bagel 2");
        Assertions.assertEquals(basket.emptyBasket(), "bagels removed");
        Assertions.assertFalse(basket.bagels.containsKey("Bagel 1"));
        Assertions.assertFalse(basket.bagels.containsKey("Bagel 2"));
        Assertions.assertEquals(basket.total, 0);
    }
    @Test
    public void changeCapacityTestGoesWell(){
        Basket basket = new Basket();
        basket.changeCapacity(10);
        Assertions.assertEquals(basket.capacity, 10);
    }

}
