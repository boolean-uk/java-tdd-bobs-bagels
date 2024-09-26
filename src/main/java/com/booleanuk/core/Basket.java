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

    public boolean setCapacity(int newCapacity){
        if( newCapacity < this.bagels.size()){
            System.out.println("You are trying to decrease the size of a basket which has more elements than the new size ");
            return false;
        } else if( newCapacity <= 0){
            System.out.println("No negative numbers allow in reality life");
            return false;
        } else {
            this.capacity = newCapacity;
            return true;
        }
    }
}
