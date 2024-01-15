package com.booleanuk.core;

public class Basket {
    Bagel[] basket = new Bagel[5];
    int currentIndex = 0;

    public boolean addBagel(Bagel bagel) {
        if(currentIndex == 4) {
            return false;
        }
        basket[currentIndex] = bagel;
        currentIndex++;
        return true;
    }

    public boolean removeBagel(Bagel bagel) {
        return true;
    }
}
