package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> basketList;
    int max;

    public Basket()
    {
        basketList = new ArrayList<>();
        max = 10;
    }

    public boolean addToBasket(String type)
    {
        if(basketList.contains(type))
        {
            System.out.println("Bagel of type \"" + type + "\" already exists in basket");
            return false;
        }
        basketList.add(type);
        System.out.println("Successfully added " + type + " bagel to basket");
        return true;
    }

    public boolean removeFromBasket(String type)
    {
        return false;
    }

    public void changeCapacity(int capacity)
    {

    }
}
