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

    public void remove(String bagel)
    {
        bagelsBasket.remove(bagel);
    }

    public void changeCapacity(int newCapacity){

    }

}
