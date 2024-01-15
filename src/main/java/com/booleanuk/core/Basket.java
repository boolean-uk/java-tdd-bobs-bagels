package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> basket;

    public Basket(){
        basket = new ArrayList<>();
    }

    public String addBagel(String name){
        basket.add(name);
        return name + " added";
    }
}
