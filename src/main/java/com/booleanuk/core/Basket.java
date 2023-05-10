package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> bagels;

    public Basket(){
        this.bagels = new ArrayList<>();
    }

    public boolean add(String bagelType) {
        bagels.add(bagelType);
        return true;
    }

    public boolean remove(String bagelType) {
        return bagels.remove(bagelType);
    }
}
