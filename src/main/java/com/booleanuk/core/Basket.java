package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> bagels = new ArrayList<>();

    public List<String> getBagels() {
        return bagels;
    }

    public void add(String bagel){
        bagels.add(bagel);
    }
}
