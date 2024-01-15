package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    //String type;
    ArrayList<String> bagels;

    public Basket(){
        bagels = new ArrayList<>();
    }

    public boolean addBagelTypeToBasket(String bagelType) {
        if(this.bagels.contains(bagelType)) {
            return false;
        }
        this.bagels.add(bagelType);
        return true;
    }

    public boolean removeBagelTypeFromBasket(String bagelType) {
        return true;
    }

}
