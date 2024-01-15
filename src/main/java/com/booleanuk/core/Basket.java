package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    public ArrayList<String> bagels;
    public int capacity;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.bagels = new ArrayList<>();
    }

    public boolean order(String name) {
        return true;
    }
    public String delete(String name) {
        return "";
    }
    public void expand(int newSize) {
        
    }
}
