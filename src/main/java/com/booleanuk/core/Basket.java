package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    HashMap<String, Integer> items;
    int maxCapacity;

    public Basket(){
        this.items = new HashMap<>();
        this.maxCapacity = 5;
    }

    public String add(String bagel, int amount){

        if(getTotalAmount() + amount > maxCapacity){
            return "Basket is full";
        }

        this.items.put(bagel, amount);
        return amount + " " +  bagel + " bagel added to basket";
    }

    public int getTotalAmount(){
        int totalAmount = 0;
        for (int amount : this.items.values()){
            totalAmount += amount;
        }
        return totalAmount;
    }
}
