package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> bagels;
    int capacity;

    public Basket(int capacity) {
        this.bagels= new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean addItem(String item){
        if (bagels.size()<this.capacity){
            bagels.add(item);
            return true;
        }
        System.out.println("You can´t add a new bagel. your basket is full");
        return false;
    }
    public boolean removeItem(String item){

        if (bagels.contains(item)){
            bagels.remove(item);
            return true;
        }
        System.out.println("Item does not exists");
        return false;
    }
}
