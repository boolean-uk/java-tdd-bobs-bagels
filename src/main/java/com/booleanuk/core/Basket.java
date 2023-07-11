package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    private ArrayList<String> bagels = new ArrayList<>();
    public static int MAX_CAPACITY = 5;

    public void addBagel(String bagel) {
        if (bagels.size() >= MAX_CAPACITY) {
            return;
        }
        bagels.add(bagel);
    }

    public void removeBagel(String bagel) {
         if (checkIfBagelIsInTheBasket(bagel)) {
            bagels.remove(bagel);
        }
    }

    public int getSizeOfBasket() {
        return bagels.size();
    }

    public boolean isBasketFull() {
        return bagels.size() == MAX_CAPACITY;
    }

    public void changeCapacityOfBasket(int capacity) {
        MAX_CAPACITY = capacity;
    }

    public boolean checkIfBagelIsInTheBasket(String bagel) {
        return bagels.contains(bagel);
    }
}
