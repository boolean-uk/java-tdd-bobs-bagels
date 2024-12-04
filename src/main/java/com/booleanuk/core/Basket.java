package com.booleanuk.core;
import java.util.ArrayList;
public class Basket {
    ArrayList<String> bagelsList;
    int capacity;

    public Basket(int capacity){
        this.bagelsList = new ArrayList<String>();
        this.capacity = capacity;

    }


    public boolean add(String bagels){
        if(this.bagelsList.contains(bagels)){
            return false;
        }
        this.bagelsList.add(bagels);
        return true;

    }
    public boolean remove(String bagels){
        return this.bagelsList.remove(bagels);

    }

    public boolean isFull(int capacity) {
        return this.bagelsList.size() == capacity;
    }
    public int changeCapacity(int capacity){
        this.capacity = capacity;
        return this.capacity;
    }

    public boolean isItemInBasket(String bagel){
       if(bagelsList.contains(bagel)){
           bagelsList.remove(bagel);
           return true;
       }else {
           return false;
       }
    }




}