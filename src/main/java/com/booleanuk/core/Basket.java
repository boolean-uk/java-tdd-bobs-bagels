package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    public ArrayList<String> bagelsList = new ArrayList<>();

    public Basket(){
        this.bagelsList = new ArrayList<>();
    }

    public boolean add(String bagel){
        return this.bagelsList.add(bagel);

    }

}
