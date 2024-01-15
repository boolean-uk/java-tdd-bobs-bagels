package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> basket;
    int maxCapacity;

    public Basket(){
        this.basket = new ArrayList<>();
        this.maxCapacity = 3;
    }

    public void add(String bagel, int amount){
        for(int i = 0; i< amount; i++){
            this.basket.add(bagel);
        }
    }
}
