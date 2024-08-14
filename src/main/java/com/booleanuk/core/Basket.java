package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelsInStore = new ArrayList<>();
    ArrayList<String> bagelsInBasket = new ArrayList<>();
    int maxCapacity = 5;

    public Basket() {
        bagelsInStore.add("Cheese Bagel");
        bagelsInBasket.add("Pepperoni Bagel");
        bagelsInBasket.add("Cheese Bagel");
        bagelsInBasket.add("bagel1");

    }

    public boolean addBagel(String bagel) {
        if(bagel.isEmpty() || !(bagelsInStore.contains(bagel)) || maxCapacity == bagelsInBasket.size() ) {
            return false;
        }
        bagelsInBasket.add(bagel);
        System.out.println("Your: " + bagel + " Has been added to the basket");
        return true;
    }

    public boolean removeBagel(String bagel) {
        if(bagel.isEmpty() || !(bagelsInBasket.contains(bagel))) {
            System.out.println("The item you're trying to remove doesn't exist.");
            return false;
        }
        bagelsInBasket.remove(bagel);
        System.out.println("The item " + bagel + " Got removed from your basket");
        return true;
    }

    public boolean incrementCapacity(int amount, String name) {
        if(!name.equalsIgnoreCase("bob")) {
            return false;
        }
        maxCapacity = maxCapacity + amount;
        System.out.println("You have now updated the capacity");
        return true;
    }

}
