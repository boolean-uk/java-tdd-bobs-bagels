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





}
