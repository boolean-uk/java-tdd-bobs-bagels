package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<String> bagles;
    private int capacity;
    public Basket(int capacity) {
        bagles = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addToBasket(String bagle) {
        if(capacity > bagles.size()) {
            bagles.add(bagle);
            System.out.println("Spaces left in basket: " + (capacity - bagles.size()));
        }else
            System.out.println("There is no more space left in basket");

    }

    public List<String> getAllBagles() {
        return bagles;
    }

    public void removeFromBasket(String bagle) {
        if (bagles.contains(bagle))
            bagles.remove(bagle);
        else
            System.out.println("The " + bagle + " is not inside the basket, so it can't be removed.");
    }

    public void changeCapacityOfBasket(int newSize) {
        if (newSize > 0 && bagles.size() == 0)
            this.capacity = newSize;
        else if (newSize <= 0)
            System.out.println("New capacity size must be positive. You cannot set it to " + newSize + ".");
        else if(newSize >= bagles.size()){
            System.out.println("You already got " + bagles.size() + " bagles in basket so you can't downsize basket to " + newSize + " spaces");
            this.capacity = bagles.size();
        }

    }

    public int getCapacity() {
        return capacity;
    }
}
