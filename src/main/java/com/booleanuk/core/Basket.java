package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> contents;
    int capacity;

    public Basket() {
        this.contents = new ArrayList<>(){
            {
                add("Plain");
                add("CinnamonRaisin");
                add("PoppySeed");
            }
        };
        this.capacity = 4;
    }

    public boolean add(String bagel){
        if (this.contents.size() == capacity){
            return false;
        }
        this.contents.add(bagel);
        return true;
    }

    public void remove(String bagel) {
        this.contents.remove(bagel);
    }

    public boolean expandSize(int newSize) {
        if (newSize <= this.capacity) {
            return false;
        }
        this.capacity = newSize;
        return true;
    }
}
