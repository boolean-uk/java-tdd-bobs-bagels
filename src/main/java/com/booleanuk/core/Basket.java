package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> items;

    public Basket() {
        this.items = new ArrayList<>();
    }


    public void add(String bagelname) {
        items.add(bagelname);
        System.out.println(items);
    }

    public boolean remove(String bagelname) {
        items.remove(bagelname);
        System.out.println(items.contains(bagelname));
        return items.contains(bagelname);

    }


}
