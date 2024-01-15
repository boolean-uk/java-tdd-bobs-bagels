package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> basket;
    int capacity;

    public Basket(){
        basket = new ArrayList<>();
        capacity = 3;
    }

    public String addBagel(String name){
        if(basket.size() == capacity){
            return "Basket full";
        }
        else if(basket.contains(name)){
            return name + " already exists in basket";
        }
        basket.add(name);
        return name + " added";
    }
    public String removeBagel(String name){
        if(basket.contains(name)){
            basket.remove(name);
            return name + " removed";
        }
        return "Bagel not in basket";
    }
}
