package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> basket;

    public Basket(){
        this.basket = new ArrayList<>();
    }
    public boolean remove(String bagel) {
        if(bagel == null){
            return false;
        }
        if(!this.basket.contains(bagel)){
            return false;
        }
        this.basket.remove((bagel));
        return true;
    }

    public boolean add(String bagel){
        if(bagel == null){
            return false;
        }
        if(bagel.isEmpty()){
            return false;
        }
        basket.add(bagel);
        return true;
    }

}
