package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagels;
    public int basketCapacity = 3;

    public Basket() {
        this.bagels = new ArrayList<>();
    }

    public boolean addBagel(String type) {
        if(isBasketFull()) {
           return false;
        }
        return bagels.add(type);
    }



    public boolean isBasketFull() {
        if (bagels.size() >= basketCapacity) {
            System.out.println("Your basket is full");
            return true;
        } else {
            return false;
        }
    }

    public void setBasketCapacity(int newBasketCapacity) {
        this.basketCapacity = newBasketCapacity;
    }
}
