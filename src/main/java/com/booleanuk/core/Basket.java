package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    private static final List<String> acceptableBagels = Arrays.asList("Ham and cheese","Cheese and bacon", "Nutella");
    private final List<String> contents = new ArrayList<>();
    private int capacity;
    public Basket(int capacity)
    {
        this.capacity = capacity;
    }

    public void addToBasket(String bagelType) throws Exception
    {
        if (!isBasketFull())
        {
            if (acceptableBagels.contains(bagelType)) contents.add(bagelType);
            else throw new Exception ("Bagel Type does not exist");
        }
        else System.out.println("Basket is full!!!");
    }
    public void removeFromBasket(String bagelType)
    {
        if (contents.contains(bagelType))
        {
            contents.remove(bagelType);
        }
        else
        {
            System.out.println(bagelType + " bagel is not in the basket");
        }
    }
    public boolean isBasketFull()
    {
        return contents.size() == capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void changeBasketCapacity(int newCapacity) throws Exception {
        if (capacity > newCapacity)
        {
            throw new Exception ("Cannot change capacity to lower than the current!");
        }
        else this.capacity = newCapacity;
    }

    public List<String> getContents() {
        return contents;
    }

    public void clearBasket() {
        contents.clear();
    }
}
