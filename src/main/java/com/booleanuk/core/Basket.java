package com.booleanuk.core;

import java.lang.reflect.Array;

public class Basket {
    String [] bagels;
    int capacity;
    public Basket(){
        this.bagels = new String[5];
        for(int i = 0; i < 5; i++){
            this.bagels[i] = "";
        }
        this.capacity = this.bagels.length;
    }

    public Basket (int size){
        this.bagels = new String[size];
        for(int i = 0; i < size; i++) {
            this.bagels[i] = "";
        }
        this.capacity = this.bagels.length;
    }
    public boolean add(String bagel){
        if (!this.bagels[this.bagels.length - 1].equals("")){
            System.out.println("Basket is full");
            return false;
        }
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
        int index =0;
        for(String item:this.bagels){
            if(item.equals(bagel)){
                this.bagels[index] = "";
                return true;
            }
            index++;
        }
        System.out.println("Specified bagel not found");
        return false;
    }
}
