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
        if (bagelsInBasket.size() < userCapacity)
            bagelsInBasket.add(typeOfBagle);
        else
            throw new IllegalStateException("You can not add more Bagles, max number of Bagles in basket is: " + userCapacity);
    }

    public void removeBagle(String typeOfBagle){
        if (!bagelsInBasket.remove(typeOfBagle))
          throw new NoSuchElementException("You don't have: " + typeOfBagle + " in your basket");
    }

    public void changeBasketSize(int newSize){
        if (this.user.equals(User.BAGELS_MANAGER)) {
            capacity = newSize;
            System.out.println("Capacity changed to" + newSize);
        }
        else
            throw new IllegalStateException("You don't have permission to change default capacity.");
    }

    public ArrayList<String> getBagelsInBasket() {
        return bagelsInBasket;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getUserCapacity(){
        return userCapacity;
    }
}

enum User {
    BAGELS_MANAGER,
    MEMBER_OF_PUBLIC
}
