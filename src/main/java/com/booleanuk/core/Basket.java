package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> items;


    public Basket(){

       this.items = new ArrayList<>(10);
       items.add("Regular");

    }

    public boolean add(String name) {

        if (items.contains(name)) {
           return false;
        }
        items.add(name);
        return true;



    }
    public boolean remove(String name) {

        if (items.contains(name)) {
            items.remove(name);
            return true;
        }

        return false;
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
