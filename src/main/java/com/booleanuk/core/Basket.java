package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> bagels;
    int capacity;

    public Basket(int capacity) {
        this.bagels= new ArrayList<>();
        this.capacity = capacity;
    }
}
