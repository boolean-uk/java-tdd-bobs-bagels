package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    private static List<String> acceptableBagels = Arrays.asList("Ham and cheese","Cheese and bacon");
    private ArrayList<String> contents = new ArrayList<>();
    private int capacity;
    public Basket(int capacity)
    {
        this.capacity = capacity;
    }

    public void addToBasket(String bagelType) throws Exception
    {
        if (contents.size()<capacity)
        {
            if (acceptableBagels.contains(bagelType))
            {
                contents.add(bagelType);
            }
            else throw new Exception ("Bagel Type does not exist");
        }
    }
    public void removeFromBasket(String bagelType)
    {
        if (contents.contains(bagelType))
        {
            contents.remove(bagelType);
        }
        else
        {
            System.out.println(bagelType+" bagel is not in the basket");
        }
    }

    public ArrayList<String> getContents() {
        return contents;
    }
}
