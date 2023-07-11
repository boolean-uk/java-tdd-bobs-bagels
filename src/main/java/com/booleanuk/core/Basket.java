package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> bagelsBasket=new ArrayList<>();
    int capacity;

    public Basket()
    {

    }

    public Basket(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(String bagel)
    {
        if(bagelsBasket.size()==capacity) {
            System.out.println("Sorry, your basket if full");
            return false;
        }
        bagelsBasket.add(bagel);
        return true;
    }

    public boolean remove(String bagel)
    {
        bagelsBasket.remove(bagel);
        return true;
    }

    public void changeCapacity(int capacity){
        this.capacity = capacity;
        System.out.println("Capacity of the basket is changed");
    }

}
