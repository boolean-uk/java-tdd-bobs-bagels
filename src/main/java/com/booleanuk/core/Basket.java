package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> items;
    int basketSize = 10;


    public Basket(){

       this.items = new ArrayList<>(basketSize);
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


        if (items.size() > basketSize) {
            return true;
        }

        return false;
    }
    public int updateBasket(int amount) {


        return 0;
    }
    public String canItemBeRemoved(String name) {


        return "";
    }


}
