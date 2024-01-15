package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelBasket;
    int capacity;

    public Basket(){
        this.capacity = 6;
        this.bagelBasket = new ArrayList<>(capacity);
    }

    public boolean isEmpty(){
        return bagelBasket.isEmpty();
    }
    public boolean basketIsFull(){
        return bagelBasket.size() >= changeCapacity(capacity);
    }

    public String addBagel(String bagel){
        if (bagel == null && isEmpty()){
            return "Basket is empty";
        }
        else if (basketIsFull()){
            return "The Basket is full";
        }
        bagelBasket.add(bagel);
        return bagel + " added to your basket";
    }

    public String removeBagel(String bagel){
        if (!bagelBasket.contains(bagel)){
            return "Can not remove non-existing item.";
        }
        bagelBasket.remove(bagel);
        return bagel + " removed from your basket";
    }

    public int changeCapacity(int newCapacity){
        this.capacity = newCapacity;
        return newCapacity;
    }

}

/*

| Class  | Members           | Methods                             | Scenario               | Output/Results             |
|--------|-------------------|-------------------------------------|------------------------|----------------------------|
| Basket | ArrayList<String> | String addBagel(String bagel)       | Adds a bagel into the  | String (bagel +" has been  |
|        | bagelBasket       |                                     | bagel basket list      | added to you basket")      |
|        |                   | String removeBagel(String bagel)    | Removes a bagel        | String (bagel+" has been   |
|        |                   |                                     | from the basket list   | removed from your basket") |
|        | int capacity      | boolean basketIsFull(String bagel)  | Tries to add a bagel   | if full return true        |
|        |                   |                                     | but the basket is full | else return false          |
|        |                   |                                     |                        |                            |
|        |                   | int changeCapacity(int newCapacity) | Lets the manager       | return the new bagelBasket |
|        |                   |                                     | change basket capacity | capacity                   |
|        |                   | boolean itemDoesntExist(String      | Checks if the item     | if exist return true       |
|        |                   | bagel)                              | removed exists         | else return false          |
|        |                   | boolean isEmpty()                   | Checks if the basket   | if empty return true       |
|        |                   |                                     | is empty               | else return false          |

 */