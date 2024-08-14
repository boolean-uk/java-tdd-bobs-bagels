package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    public BasketTest(){

    }

    @Test
    public void testAddExists(){
        Basket basket= new Basket(10);
        Assertions.assertTrue(basket.add("Nice bagel", 5));
    }

    @Test
    public void testRemoveExists(){
        Basket basket= new Basket(10);
        Assertions.assertFalse(basket.remove("Nice bagel", 5));
    }


    @Test
    public void testCapacityExists(){
        Basket basket= new Basket(10);
        Assertions.assertTrue(basket.checkCapacity());
    }


    @Test
    public void testIncCapacityExists(){
        Basket basket= new Basket(10);
        Assertions.assertTrue(basket.incCapacity(10));
    }

    // testing User story 1
    @Test
    public void testAdd(){
        Basket basket= new Basket(10);
        Assertions.assertTrue(basket.add("Nice bagel", 5));
        Assertions.assertTrue(basket.add("Nice bagel", 5));
    }

    // testing User story 2 & 5
    @Test
    public void testRemove(){
        Basket basket= new Basket(10);
        basket.add("Nice bagel", 5);
        Assertions.assertTrue(basket.remove("Nice bagel", 1));
        Assertions.assertFalse(basket.remove("Fine bagel", 1));
    }

    // testing User story 3
    @Test
    public void testAddingtoFull(){
        Basket basket= new Basket(10);
        basket.add("Nice bagel", 9);
        Assertions.assertFalse(basket.add("Nice bagel", 2));
    }

    // testing User story 3
    @Test
    public void testCheckCapacity(){
        Basket basket= new Basket(10);
        basket.add("Nice bagel", 5);
        basket.add("Nice bagel", 5);
        Assertions.assertFalse(basket.checkCapacity());
    }

    // testing User story 4
    @Test
    public void testIncCapacity(){
        Basket basket= new Basket(10);
        Assertions.assertTrue(basket.incCapacity(5));
    }





}
