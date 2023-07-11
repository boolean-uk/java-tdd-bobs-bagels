package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    private ArrayList<String> basket = new ArrayList<>();




    public void add(String bagel) {
        basket.add(bagel);

    }

    public ArrayList<String> getBasket() {
        return basket;
    }

    public void remove(String bagel) {
        basket.remove(bagel);
    }

    /*
    * 1.As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
*/

}
