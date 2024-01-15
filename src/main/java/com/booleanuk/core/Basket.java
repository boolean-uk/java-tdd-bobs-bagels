package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Basket {

    LinkedHashMap<String, Integer> items;
    int maxCapacity;

    public Basket(){
        this.items = new LinkedHashMap<>();
        this.maxCapacity = 5;
    }

    public String add(String bagel, int amount){

        if (getTotalAmount() + amount > maxCapacity) {
            return "Basket is full";
        }

        if(!this.items.containsKey(bagel)) {
            this.items.put(bagel, amount);
            return amount + " " + bagel + " bagel(s) added to basket";
        }else{
            this.items.put(bagel, this.items.get(bagel) + amount);
            return amount + " " + bagel + " bagel(s) added to basket";
        }
    }

    public String remove(String bagel, int amount){
        if (this.items.isEmpty()){
            return "Basket is empty";
        }else if(this.items.get(bagel) < amount){
            return "You only have " + this.items.get(bagel) + " " + bagel + " bagel(s) in your basket";
        }
        this.items.remove(bagel, amount);
        return amount + " " + bagel + " bagel(s) removed from basket";
    }

    public int getTotalAmount(){
        int totalAmount = 0;
        for (int amount : this.items.values()){
            totalAmount += amount;
        }
        return totalAmount;
    }

    public void setBasketCapacity(int capacity){
        System.out.println(items);
        if(capacity <= getTotalAmount()){
            System.out.println("its less than");
        }
        this.maxCapacity = capacity;
    }
}
