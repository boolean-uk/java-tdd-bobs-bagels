package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class BasketTest {

    @Test
    public void testAddBagelToBasket() {
        Basket basket = new Basket(5, new HashMap<>() {
            {
                put("Bagel1", 15);
            }
        });

        Assertions.assertTrue(basket.addBagelToBasket("Bagel1"));

    }



    @Test
    public void testAddBagelThatIsntValidInBagelList() {
        Basket basket = new Basket(5, new HashMap<>() {
            {
                put("Bagel1", 15);
            }
        });

        //Adding wrong bagel before initalization of basket
        Assertions.assertFalse(basket.addBagelToBasket("Bagel4"));

        //Add to bagels of same type
        Assertions.assertTrue(basket.addBagelToBasket(("Bagel1")));
        Assertions.assertFalse(basket.addBagelToBasket("Bagel1"));
        //Test for adding wrong bagel after basket is initlized
        Assertions.assertFalse(basket.addBagelToBasket(("bagel3")));

    }
    @Test
    public void testAddBagelIfCapacityFull() {
        Basket basket = new Basket(1, new HashMap<>() {
            {
                put("Bagel1", 15);
                put("Bagel2", 12);
            }
        });

        Assertions.assertTrue(basket.addBagelToBasket(("Bagel1")));
        Assertions.assertFalse(basket.addBagelToBasket("Bagel2"));

    }

    @Test
    public void testChangeCapacityOfBasket() {
        Basket basket = new Basket(1, new HashMap<>() {
            {
                put("Bagel1", 15);
                put("Bagel2", 12);
            }
        });



        Assertions.assertTrue(basket.addBagelToBasket(("Bagel1")));
        Assertions.assertFalse(basket.addBagelToBasket("Bagel2"));

        basket.changeCapacityOfBasket(2);
        Assertions.assertTrue(basket.addBagelToBasket(("Bagel2")));
        Assertions.assertFalse(basket.addBagelToBasket("Bagel3"));

        basket.changeCapacityOfBasket(3);
    }

}
