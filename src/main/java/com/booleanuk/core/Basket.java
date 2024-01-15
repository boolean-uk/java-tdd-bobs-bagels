package com.booleanuk.core;
import java.util.ArrayList;
public class Basket {
    ArrayList<String> bagelsList;
    public Basket(){
        this.bagelsList = new ArrayList<String>();


    }
    public boolean add(String bagels){
        if(this.bagelsList.contains(bagels)){
            return false;
        }
        this.bagelsList.add(bagels);
        return true;

    }
    public boolean remove(String bagels){
        return this.bagelsList.remove(bagels);

    }



}