package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelBasket;

    int basketSize;

    public Basket(int basketSize) {
        this.basketSize = basketSize;
        this.bagelBasket = new ArrayList<>();
    }

    public boolean addToBasket(String bagelType) {
        if (bagelBasket.size() >= this.basketSize) {
            System.out.println("Basket is full" + " " + bagelBasket.size());
            System.out.println(bagelBasket.toString()); //shows what is in the arraylist
            return false;
        }
        this.bagelBasket.add(bagelType);  //return this.bagelBasket.add(bagelType); same method
        System.out.println("Basket is not full" + " " + bagelBasket.size());
        return true;
    }

    public boolean removeFromBasket(String bagelType) {
        if (!bagelBasket.contains(bagelType)) {
            System.out.println("Bagel is not in basket, you can't remove it" + " " + bagelBasket.size());
            return false;
        }
        this.bagelBasket.remove(bagelType);
        System.out.println("removed bagel from basket" + " " + bagelBasket.size());
        return true;
    }

    public boolean addToBasketSize(int changeBasketSize) {
        int newBasketSize = this.basketSize + changeBasketSize;
        if (newBasketSize < 1) {
            System.out.println("changing basket size didn't work" + " " + basketSize);
            return false;
        } else {
            this.basketSize = newBasketSize;
            System.out.println("changing basket size did work" + " " + basketSize);
            return true;
        }
    }
}










