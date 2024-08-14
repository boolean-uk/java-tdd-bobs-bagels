package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    int basketSize;
    ArrayList<String> basket;

    public Basket(){
        this.basketSize = 10;
        this.basket = new ArrayList<>();
    }

    public Boolean addBagel(String bagel){
        if (basket.size()>= getBasketSize()){
            System.out.println("BASKET FULL, CANNOT ADD");
            return false;
        }else{
            basket.add(bagel);
            return true;
        }
    }

    public boolean removeBagel(String bagel){
        if (!basket.contains(bagel)){
            System.out.println(bagel + " does not exist in the basket");
            return false;
        }else{
            return true;
        }
    }

    public void changeCapacity(int newSize){
        if(newSize >= 0){ //if valid number
            this.basketSize = newSize;
        }else{
            System.out.println("Invalid basketsize");
        }
    }


    public int getBasketSize(){
        return this.basketSize;
    }

}
