package com.booleanuk.core;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Basket {
    private static final int DEFAULT_CAPACITY = 3;
    private static int capacity = DEFAULT_CAPACITY;
    private final User user;
    private int userCapacity;

    private ArrayList<String> bagelsInBasket = new ArrayList<>();

    public Basket(User user) {
        this.user = user;
        this.userCapacity = capacity;
    }

    public void addBagle(String typeOfBagle){
        if (bagelsInBasket.size() < capacity)
            bagelsInBasket.add(typeOfBagle);
        else
            throw new IllegalStateException("You can not add more Bagles, max number of Bagles in basket is: " + userCapacity);
    }

    public void removeBagle(String typeOfBagle){
        if (!bagelsInBasket.remove(typeOfBagle))
          throw new NoSuchElementException("You don't have: " + typeOfBagle + " in your basket");
    }

    public void changeBasketSize(int newSize){
        //TODO
    }

    public ArrayList<String> getBagelsInBasket() {
        return bagelsInBasket;
    }
}

enum User {
    BAGELS_MANAGER,
    MEMBER_OF_PUBLIC
}
