package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> bagles;
    int capacity;
    public Basket(int capacity){
        bagles = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean add(String type) {
        if(bagles.size()< capacity){
            bagles.add(type);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean remove(String type){
        if  (bagles.contains(type)){
            bagles.remove(type);
            return true;
        }
        return false;
    }

    public boolean changeCapacity(int capacity) {
        if(capacity > 0 && capacity > this.capacity){
            this.capacity = capacity;
            return true;
        }
        else return false;

    }
}
