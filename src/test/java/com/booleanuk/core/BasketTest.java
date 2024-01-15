package com.booleanuk.core;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

class BasketTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;
    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterAll
    public static void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

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
                put("Bagel3", 18);
            }
        });



        Assertions.assertTrue(basket.addBagelToBasket(("Bagel1")));
        Assertions.assertFalse(basket.addBagelToBasket("Bagel2"));

        basket.changeCapacityOfBasket(2);
        Assertions.assertTrue(basket.addBagelToBasket(("Bagel2")));
        Assertions.assertFalse(basket.addBagelToBasket("Bagel3"));

        basket.changeCapacityOfBasket(3);
        Assertions.assertTrue(basket.addBagelToBasket(("Bagel3")));
        Assertions.assertFalse(basket.addBagelToBasket("Bagel4"));
    }

    @Test
    public void testRemoveBagelFromBasket() {
        Basket basket = new Basket(2, new HashMap<>() {
            {
                put("Bagel1", 15);
                put("Bagel2", 12);
            }
        });

        Assertions.assertTrue(basket.addBagelToBasket(("Bagel1")));
        Assertions.assertTrue(basket.removeBagelFromBasket("Bagel1"));
        Assertions.assertTrue(basket.addBagelToBasket("Bagel1"));
        Assertions.assertFalse(basket.addBagelToBasket("Bagel3"));



    }

}
