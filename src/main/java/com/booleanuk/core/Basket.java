package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagels;

    public Basket(){
        this.bagels = new ArrayList<>();
        this.bagels.add("bagel2");
    }

    public boolean addBagel(String bagel){

        if (bagels.contains(bagel)){
            return false;
        }
        return true;
    }



}
