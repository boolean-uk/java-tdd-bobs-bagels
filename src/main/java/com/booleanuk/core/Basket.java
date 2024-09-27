package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    private final ArrayList<String> bagels = new ArrayList<>();
    public static int MAX_CAPACITY = 5;

    public void addBagel(String bagel) {
        if (bagels.size() >= MAX_CAPACITY) {
            System.out.println("There is no space in the Basket for another bagel!");
            return;
        }
        bagels.add(bagel);
        System.out.println("Successfully added new bagel");
    }

    public void removeBagel(String bagel) {
        if (checkIfBagelIsInTheBasket(bagel)) {
            bagels.remove(bagel);
            System.out.println("Successfully removed the bagel");
        } else {
            System.out.println("You can't remove something that is not here!");
        }
    }

    public int getSizeOfBasket() {
        System.out.println("The basket size is: " + bagels.size());
        return bagels.size();
    }

    public boolean isBasketFull() {
        return bagels.size() == MAX_CAPACITY;
    }

    public int changeCapacityOfBasket(int capacity) {
        System.out.println("Successfully changed the capacity");
        return MAX_CAPACITY = capacity;
    }

    public boolean checkIfBagelIsInTheBasket(String bagel) {
        return bagels.contains(bagel);
    }
}
