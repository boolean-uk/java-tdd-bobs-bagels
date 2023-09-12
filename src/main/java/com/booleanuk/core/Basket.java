package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> items;
    int capacity;

    public Basket() {
        this.items = new ArrayList<>();
        this.capacity = 6;
    }


    public void addItem(String bagelname) {
        if (items.size() < capacity) {
            items.add(bagelname);

            System.out.println("Bagel succesfully added");
            System.out.println(capacity);
            System.out.println(items);
        } else {
            System.out.println("Max capacity for basket has been reached");
        }
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
        return items.size() < capacity;
    }

    public void changeMaxCap(int newCap) {
        capacity = newCap;
//        System.out.println(capacity);
    }


}
