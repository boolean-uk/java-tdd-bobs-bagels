package com.booleanuk.core;

import java.lang.reflect.Array;
import java.util.Objects;

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
    public boolean changeCapacity(int newCapacity){
        if(newCapacity<=0){
            System.out.println("New capacity is less than or equals to 0");
            return false;
        }
        int activeBagels =0;
        for(int i=0;i<this.bagels.length;i++){
            if(!Objects.equals(this.bagels[i], "")){
                activeBagels++;
            }
        }
        if(newCapacity<activeBagels){
            System.out.println("New capacity is less than the number of bagels in the basket");
            return false;
        }
        String[] newBagels = new String[newCapacity];


        for(int i=0;i<activeBagels;i++){
            newBagels[i] = this.bagels[i];
        }
        this.bagels = newBagels;
        return true;
    }
}
