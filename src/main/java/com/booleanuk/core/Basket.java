package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> bagels = new ArrayList<String>();
    ArrayList<String> orderedBagels = new ArrayList<>();
    int capacity;

    Basket(){
        bagels.add("bagelOne");
        bagels.add("bagelTwo");
        bagels.add("bagelThree");
        capacity = 5;
    }

    public boolean order(String bagel){
        if(!bagels.contains(bagel)){
            full();
            System.out.println("Bagel not found!");
            return false;
        }
        orderedBagels.add(bagel);
        System.out.println("Bagel added.");
        return true;
    }

    public boolean remove(String bagel){
        if(orderedBagels.contains(bagel)){
            orderedBagels.remove(bagel);
            System.out.println("Bagel removed.");
            return true;
        }
        System.out.println("Bagel not found!");
        return false;
    }

    public boolean full(){
        if(orderedBagels.size() >= capacity){
            System.out.println("Basket is full!");
            return true;
        }
        System.out.println("Basket is not full.");
        return false;
    }

    public boolean setCapacity(int newCap){
        capacity = newCap;
        return true;
    }
}
