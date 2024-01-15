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
        if(currentIndex > 0) {  //If basket is not empty
            for (int i = 0; i < basket.length; i++) {
                if (basket[i].productID.equalsIgnoreCase(bagel.productID)) {
                    basket[i] = basket[currentIndex - 1]; //Switch index of last added bagel so new bagels can be added
                    basket[currentIndex] = null;
                    currentIndex--;
                    return true;
                }
            }
        }
        return false;
    }
}
