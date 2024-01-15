package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> basket;
    int capacity;

    public Basket(){
        this.basket = new ArrayList<>();
        this.capacity = 5;
    }

    public boolean checkIfFull(){
        if(this.basket == null){
            return false;
        }
        if(this.basket.size() > 5){
            System.out.println("Basket is full, unable to add bagel!");
            return false;
        }
        System.out.println("Basket is not full, adding bagel");
        return true;

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
        if(checkIfFull()){
            basket.add(bagel);
        }
        return true;
    }

}
