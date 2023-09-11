package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> contents;

    public Basket() {
        this.contents = new ArrayList<>(){
            {
                add("Plain");
                add("CinnamonRaisin");
                add("PoppySeed");
            }
        };
    }

    public void add(String bagel){
        contents.add(bagel);
    }

    public void remove(String bagel) {

    }
}
