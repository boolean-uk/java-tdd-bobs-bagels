package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelBasket=new ArrayList<String>();
    int basketSize=2;


    public String addBagel(String name){
        if (basketSize <=bagelBasket.size()) return "Basket full";
        if (bagelBasket.contains(name)) return name+" already exists in basket";
        bagelBasket.add(name);
        return name+" added";
    }
    public String removeBagel(String name){
        if (!bagelBasket.contains(name)) return name+" not in basket";
        bagelBasket.remove(name);
        return name+" removed";
    }

}
