package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> basket;

    public Basket(){
        basket = new ArrayList<>();
    }

    public String addBagel(String name){
        if(basket.contains(name)){
            return name + " already exists in basket";
        }
        basket.add(name);
        return name + " added";
    }
    public String removeBagel(String name){
        return "";
    }
}
