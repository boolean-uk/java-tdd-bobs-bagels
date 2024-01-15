package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> items;


    public Basket(){
       this.items = new ArrayList<>(10);
    }

    public boolean add(String name) {

        if (items.contains(name)) {
           return true;
        }
        items.add(name);
        return false;



    }
    public boolean remove(String name) {


        return true;
    }
    public boolean isBasketFull() {
        return true;
    }
    public boolean updateBasket(int amount) {


        return true;
    }
    public String canItemBeRemoved(String name) {


        return "";
    }


}
