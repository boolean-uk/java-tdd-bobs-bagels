package com.booleanuk.core;

import java.lang.reflect.Array;

public class Basket {
    String [] bagels;
    public Basket(){
        this.bagels = new String[5];
        for(int i = 0; i < 5; i++){
            this.bagels[i] = "";
        }
    }

    public Basket (int size){
        this.bagels = new String[size];
        for(int i = 0; i < size; i++) {
            this.bagels[i] = "";
        }
    }
    public boolean add(String bagel){
        int index = 0;
        for (String item : this.bagels){
            if(item.equals("")){
                this.bagels[index] = bagel;
                break;
            }
            index++;
        }
        return true;

    }
    public boolean remove(String bagel) {
        return true;
    }
}
