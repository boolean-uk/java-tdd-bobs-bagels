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
//        System.out.println(items);
    }

    public boolean remove(String bagelname) {
        System.out.println(items);
        if (items.contains(bagelname)) {
            items.remove(bagelname);
            System.out.println(items);
            return true;
        }
        System.out.println("This item is not in the list: " + bagelname);
        return false;

//        System.out.println(items.contains(bagelname));

    }

    public boolean capChecker() {
//        System.out.println(items.size());
//        System.out.println(capacity);
//        System.out.println(items.size() < 5);
        return items.size() <= capacity;
    }

    public void changeMaxCap(int newCap) {
        capacity = newCap;
//        System.out.println(capacity);
    }


}
