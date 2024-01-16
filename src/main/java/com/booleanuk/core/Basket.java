package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagels;
    int capacity = 2;
    public Basket(){
        this.bagels = new ArrayList<>(capacity);
        bagels.add("bagel2");
    }

    public boolean addBagel(String bagel){

        if (bagels.contains(bagel)){
            return false;
        }
        bagels.add(bagel);
        return true;
    }
    public boolean removeBagel(String bagel){
        if (bagels.contains(bagel)){
            bagels.remove(bagel);
            return true;
        }
        return false;
    }
    public boolean checkCapacity(){
        if (bagels.size() >capacity ){
            return true;
        }
        return false;
    }

    public int updateCapacity(int newCap){
        this.capacity = newCap;
        return this.capacity;
    }
    public String removeBagelString(String bagel){
        String ut="The bagel " + bagel + " doesn't exist";
        if (bagels.contains(bagel)){
            bagels.remove(bagel);
            ut= "The bagel " + bagel + " is removed";
        }
        return ut;
    }

}
