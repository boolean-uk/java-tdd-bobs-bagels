package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagels;
    int basketCapacity;

    public Basket() {
        this.bagels = new ArrayList<>();
        this.basketCapacity = 3;
    }

    public boolean addBagel(String bagelType){
        if (this.bagels.size() < this.basketCapacity){
            this.bagels.add(bagelType);
            return true;
        }
        System.out.println("Basket is full, could not add bagel!");
        return false;
    }

    public boolean removeBagel(String bagelType) {
        if (this.bagels.contains(bagelType)) {
            this.bagels.remove(bagelType);
            return true;
        }
        System.out.println("The bagel does not exist in the basket!");
        return false;
    }

    public boolean updateBasketCapacity(int newCapacity) {
        if(newCapacity <= 0) {
            System.out.println("Cannot update basket capacity to zero or less.");
            return false;
        } else if (newCapacity < this.bagels.size()) {
            System.out.println("Cannot update basket capacity to a size smaller than current basket size.");
            return false;
        }
        this.basketCapacity = newCapacity;
        return true;
    }



}
