package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> items;
    int capacity;

    public Basket() {
        this.items = new ArrayList<>();
        this.capacity = 5;
    }


    public void add(String bagelname) {
        items.add(bagelname);
        System.out.println(items);
    }

    public void remove(String bagelname) {
        items.remove(bagelname);
        System.out.println(items.contains(bagelname));


    }


}
