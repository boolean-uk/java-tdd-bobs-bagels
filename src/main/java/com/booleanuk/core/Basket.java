package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> basket;

    public Basket() {
        basket = new ArrayList<>();
    }

/*
        1.
    As a member of the public,
    So I can order a bagel before work,
    I'd like to add a specific type of bagel to my basket.
 */
    public boolean addBagel(String bagel) {
        if (!this.basket.contains(bagel)) {
            this.basket.add(bagel);
            return true;
        }
        return false;
    }



/*
            2.
    As a member of the public,
    So I can change my order,
    I'd like to remove a bagel from my basket.
 */

/*
            3.
    As a member of the public,
    So that I can not overfill my small bagel basket
    I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
 */

/*
            4.
    As a Bob's Bagels manager,
    So that I can expand my business,
    I’d like to change the capacity of baskets.
*/

/*
            5.
    As a member of the public
    So that I can maintain my sanity
    I'd like to know if I try to remove an item that doesn't exist in my basket.
 */

}
