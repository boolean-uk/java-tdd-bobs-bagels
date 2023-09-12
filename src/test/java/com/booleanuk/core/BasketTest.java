package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BasketTest {

    @Test
    void addProducts() {
        Basket basket = new Basket();
        String productOne = "Plain";
        String productTwo = "Cinnamon";
        String productThree = "Blueberry";
        String productFour = "Poppy-seed";
        String productFive = "Onion";
        String productSix = "Garlic";

        basket.addItem(productOne);
        basket.addItem(productTwo);
        basket.addItem(productThree);
        basket.addItem("filler-bagel1");
        basket.addItem("filler-bagel2");
        basket.addItem("filler-bagel3");
        basket.addItem("filler-bagel4");


        Assertions.assertTrue(basket.items.contains(productOne));
        Assertions.assertTrue(basket.items.contains(productTwo));
        Assertions.assertTrue(basket.items.contains(productThree));
        Assertions.assertTrue(basket.items.contains(productTwo));


        Assertions.assertFalse(basket.items.contains(productFour));
        Assertions.assertFalse(basket.items.contains(productFive));
        Assertions.assertFalse(basket.items.contains(productSix));

    }

    @Test
    void removeProducts() {
        Basket basket = new Basket();
        String productOne = "Plain";
        String productTwo = "Cinnamon";
        String productThree = "Blueberry";
        String productFour = "Poppy-seed";
        String productFive = "Onion";
        String productSix = "Garlic";

        basket.addItem(productOne);
        basket.addItem(productTwo);
        basket.addItem(productThree);
        basket.addItem(productFour);
        basket.addItem(productFive);
        basket.addItem(productSix);

        Assertions.assertTrue(basket.items.contains(productOne));
        Assertions.assertTrue(basket.items.contains(productTwo));
        Assertions.assertTrue(basket.items.contains(productThree));
        Assertions.assertTrue(basket.items.contains(productFour));
        Assertions.assertTrue(basket.items.contains(productFive));
        Assertions.assertTrue(basket.items.contains(productSix));

        basket.remove(productFour);
        basket.remove(productFive);
        basket.remove(productSix);


        //remove product 4,5,6 in the method caller below
        //check every string again to see if items that are supposed to be true are still true
        Assertions.assertTrue(basket.items.contains(productOne));
        Assertions.assertTrue(basket.items.contains(productTwo));
        Assertions.assertTrue(basket.items.contains(productThree));

        Assertions.assertFalse(basket.items.contains(productFour));
        Assertions.assertFalse(basket.items.contains(productFive));
        Assertions.assertFalse(basket.items.contains(productSix));


    }


    @Test
    void checkIfUserIsUnderMaxCapacity() {
        Basket basket = new Basket();
        String productOne = "Plain";
        String productTwo = "Cinnamon";
        String productThree = "Blueberry";
        String productFour = "Poppy-seed";
        String productFive = "Onion";
        String productSix = "Garlic";

        basket.addItem(productOne);
        basket.addItem(productTwo);
        basket.addItem(productThree);
        basket.addItem(productFour);
        basket.addItem(productFive);

//        The arraylist size is 5 here, so it should return true. As the max capacity is equal to it
        Assertions.assertTrue(basket.capChecker());

//        The arraylist size is 6 here, so it should return false. As the max capacity is bigger

        basket.addItem(productSix);
        Assertions.assertFalse(basket.capChecker());

    }

    @Test
    void UserChangesMaxCapacityOfBagelList() {
        Basket basket = new Basket();

        String productOne = "Plain";
        String productTwo = "Cinnamon";
        String productThree = "Blueberry";
        String productFour = "Poppy-seed";
        String productFive = "Onion";
        String productSix = "Garlic";

        basket.addItem(productOne);
        basket.addItem(productTwo);
        basket.addItem(productThree);
        basket.addItem(productFour);
        basket.addItem(productFive);
        basket.addItem(productSix);

//        There are more items in the list than the max capacity which is 5
        Assertions.assertFalse(basket.capChecker());
        int newMaxCap = 8;

        basket.changeMaxCap(newMaxCap);

//      The capChecker should return true now because we changed the max capacity with the code above to 8,
//      which is bigger than the listitems we added (6).
        Assertions.assertTrue(basket.capChecker());
        Assertions.assertEquals(newMaxCap, basket.capacity);


    }


    @Test
    void checkIfItemToRemoveExists() {
        Basket basket = new Basket();

        String productOne = "Plain";
        String productTwo = "Cinnamon";
        String productThree = "Blueberry";
        String productFour = "Poppy-seed";


        basket.addItem(productOne);
        basket.addItem(productTwo);
        basket.addItem(productThree);

        // Product below exists in the items list, so it should return true
        Assertions.assertTrue(basket.remove(productOne));

        // Product below doesn't exist in the items list, so it should return false
        Assertions.assertFalse(basket.remove(productFour));


    }


}
