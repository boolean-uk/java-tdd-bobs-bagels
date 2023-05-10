package com.booleanuk.core;

import java.util.ArrayList;

enum BASKETERROR {
    BAGELNOTFOUND,
    MAXCAPACITY
}

public class Basket {
    ArrayList<String> bagels;
    static int capacity = 1;
    BASKETERROR lastError;

    public Basket() {
        this.bagels = new ArrayList<>(capacity);
        this.lastError = null;
    }

    public boolean addBagel(String type) { return true; }

    public boolean removeBagel(String type) { return true; }

    static boolean setCapacity(int size) { return true; }
}
