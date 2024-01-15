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
    public boolean changeCapacity(int capacity){
        if(capacity > 0){
            this.capacity += capacity;
            return true;
        }
        return false;
    }
    public String viewBasket(){
        if(basket.isEmpty()){
            return "Basket is empty";
        }
        String basketContent = "";
        for(int i = 0; i < basket.size(); i++){
            if(i == basket.size() - 1){
                basketContent += basket.get(i);
            }
            else{
                basketContent += basket.get(i) + ", ";
            }

        }
        return basketContent;
    }
}
