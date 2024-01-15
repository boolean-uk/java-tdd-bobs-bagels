package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelBasket;

    public Basket(){
        this.bagelBasket = new ArrayList<>(6);
    }

    public boolean isEmpty(){
        return bagelBasket.isEmpty();
    }
    public boolean basketIsFull(){
        return bagelBasket.size() >= 6;
    }

    public String addBagel(String bagel){
        if (bagel == null && isEmpty()){
            return "Basket is empty";
        }
        else if (basketIsFull()){
            return "The Basket is full";
        }
        bagelBasket.add(bagel);

        return bagel + " added to basket";
    }

    public String removeBagel(String bagel){
        bagelBasket.remove(bagel);
        return bagel + " removed from basket";
    }

}

/*

| Class  | Members           | Methods                            | Scenario               | Output/Results             |
|--------|-------------------|------------------------------------|------------------------|----------------------------|
| Basket | ArrayList<String> | String addBagel(String bagel)      | Adds a bagel into the  | String (bagel +" has been  |
|        | bagelBasket       |                                    | bagel basket list      | added to you basket")      |
|        |                   | String removeBagel(String bagel)   | Removes a bagel        | String (bagel+" has been   |
|        |                   |                                    | from the basket list   | removed from your basket") |
|        |                   | boolean basketIsFull(String bagel) | Tries to add a bagel   | if full return true        |
|        |                   |                                    | but the basket is full | else return false          |
|        |                   |                                    |                        |                            |
|        |                   | ArrayList<String> changeCapacity() | Lets the manager       | return the new bagelBasket |
|        |                   |                                    | change basket capacity | capacity                   |
|        |                   | boolean itemDoesntExist(String     | Checks if the item     | if exist return true       |
|        |                   | bagel)                             | removed exists         | else return false          |

 */